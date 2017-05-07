package org.ktu.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SimulatedAnnealing {
	private static final String IGNORE_MANAGER_FLAG = "ignorethismanager_grhc";
	private static final int COUNT = 100;
	Random randomGen = new Random();
	protected int iCount;
	protected int curIteration;
	protected double bestValue;
	public double getBestValue() {
		return bestValue;
	}
	List<DummyTestCase> testCase = new ArrayList<DummyTestCase>();
	
	private double[][] valuesMatrix;
	List<DummyTestCase> resultsList;
	/**
	 * Fake class used to imitate method the tests are generated for
	 * @author vidma
	 *
	 */
	private class DummyMethod{
		private int parameterCount;
		public DummyMethod(int paramCount){
			parameterCount = paramCount;
		}
		public int getParameterCount() {
			return parameterCount;
		}
		
	}
	/**
	 * Fake class used to imitate generated test cases
	 * @author vidma
	 *
	 */
	private class DummyTestCase{
		private DummyMethod dummyMethod;
		private List<Double> params = new ArrayList<Double>();
		public DummyTestCase(DummyMethod dm){
			dummyMethod = dm;
		}
		public DummyMethod getDummy() {
			return dummyMethod;
		}
		public double getParam(int n) {
			return params.get(n);
		}
		public void addParams(Double param) {
			this.params.add(param);
		}
		
	}
	public SimulatedAnnealing() {
	}
	public SimulatedAnnealing(int iterationCount) {
	}

	public boolean isBetter(double fitnessResNew, double fitnessResCurrent) {
		double diff = Math.abs(fitnessResNew-fitnessResCurrent+0.1f);
		boolean realSituation = fitnessResNew >= fitnessResCurrent;
		double wrongProb = getWrongChoiceProb(diff, 0.1);
		if(randomGen.nextDouble() < wrongProb){
			return !realSituation;
		}
		return realSituation;
	}
	public double getWrongChoiceProb(double diff, double tempFactor) {
		double wrongProb = Math.pow(Math.E, -diff/getTemperature(tempFactor));
		if(wrongProb > 0.98){
			wrongProb = 0.98;//To avoid infinite loops
		}
		return wrongProb;
	}

	protected double nextValue(double[][] newVMatrix, int i, int j) {
		boolean goFwd = randomGen.nextInt(2) == 0;
		double res = newVMatrix[i][j];
		res = goFwd?res+1:res-1;
		while(randomGen.nextDouble() < getWrongChoiceProb(0.1, 2)){
			res = goFwd?res+1:res-1;
		}
		return res;
	}
	private double getTemperature(double tempFactor){
		return (double)(iCount-curIteration)/iCount *tempFactor;
	}

	public void apply(double targetValue) {
		if(bestValue < 0 || bestValue > 50){
			throw new IllegalArgumentException();
		}
		bestValue = targetValue;
		DummyMethod meth = new DummyMethod(randomGen.nextInt(10));
		if(meth.getParameterCount() == 0){
			return;
		}
		initializeValuesMatrix(COUNT, meth);
		resultsList = transformValuesMatrixToTestCases(valuesMatrix,meth);
		double fitness = fitnessFunction(resultsList, meth);
		executeAlgorithm(meth, fitness);
		resultsList = transformValuesMatrixToTestCases(valuesMatrix,meth);
		testCase.addAll(resultsList);
		
	}
	private void executeAlgorithm(DummyMethod meth, double fitness) {
		List<DummyTestCase> tempResultsList;
		double[][] tempValuesMatrix;
		double tempFitness;
		for(curIteration = 0; curIteration < iCount;curIteration++){
			tempValuesMatrix = tweakValuesMatrix(meth);
			tempResultsList = transformValuesMatrixToTestCases(tempValuesMatrix,meth);
			tempFitness = fitnessFunction(tempResultsList, meth);
			if(isBetter(tempFitness, fitness)){
				//Found better solution
				valuesMatrix = tempValuesMatrix;
				resultsList = tempResultsList;
				fitness = tempFitness;
			}
		}
		
	}

	private void initializeValuesMatrix(int testCount, DummyMethod dm){
		valuesMatrix = new double[testCount][dm.getParameterCount()];
		for(int i = 0; i < valuesMatrix.length;i++){
			for(int j = 0; j < valuesMatrix[i].length; j++){
				valuesMatrix[i][j] = randomGen.nextDouble();
			}
		}
	}
	private double[][] tweakValuesMatrix(DummyMethod meth){
		double[][] newVMatrix = new double[valuesMatrix.length][valuesMatrix[0].length];
		for(int i = 0; i < valuesMatrix.length;i++){
			newVMatrix[i] = valuesMatrix[i].clone();
		}
		generateTweakedMatrix(meth, newVMatrix);
		return newVMatrix;
	}
	private void generateTweakedMatrix(DummyMethod meth, double[][] newVMatrix) {
		int i = randomGen.nextInt(newVMatrix.length);
		int j = randomGen.nextInt(newVMatrix[i].length);
		double res = nextValue(newVMatrix, i, j);
		newVMatrix[i][j] = res;
	}
	private List<DummyTestCase> transformValuesMatrixToTestCases(double[][] valuesMatrix, DummyMethod meth){
		List<DummyTestCase> testCases = new ArrayList<DummyTestCase>(valuesMatrix.length);
		for(int i = 0; i < valuesMatrix.length;i++){
			DummyTestCase tc = new DummyTestCase(meth);
			for(int j = 0; j < valuesMatrix[i].length; j++){
				tc.addParams(valuesMatrix[i][j]);
			}
			testCases.add(tc);
		}
		return testCases;
	}
	protected double fitnessFunction(List<DummyTestCase> testCases, DummyMethod meth) {
		return 50-Math.abs(bestValue - testCases.get(COUNT/2).getParam(meth.getParameterCount()/2));
	}
	public double fitnessFunction(double valueToCheck){
		return 50-Math.abs(bestValue-valueToCheck);
	}
}

