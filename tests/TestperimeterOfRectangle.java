import org.ktu.examples.GeometryCalculator;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
public class TestperimeterOfRectangle
{
@Rule
 public final ExpectedException exception = ExpectedException.none();
/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle1() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.perimeterOfRectangle(26.70, -260.37);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle2() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle3() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length+2*width " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle4() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -180.64398361926015;
		double mca_width = 4.268247089438518;

		double res = testObject.perimeterOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-352.7514730596433, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle5() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle6() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle7() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.perimeterOfRectangle(151.46, -133.73);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle8() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle9() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length+2*width " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle10() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -177.11763406856795;
		double mca_width = 44.55989403377566;

		double res = testObject.perimeterOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-265.1154800695846, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle11() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle12() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle13() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.perimeterOfRectangle(-67.50, -168.73);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle14() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle15() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length+2*width " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle16() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 333.7331404158923;
		double mca_width = 11.752162218479995;

		double res = testObject.perimeterOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(690.9706052687446, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle17() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle18() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle19() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.perimeterOfRectangle(-103.94, -242.83);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle20() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle21() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length+2*width " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle22() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -69.37252283247491;
		double mca_width = -202.3905096924588;

		double res = testObject.perimeterOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-543.5260650498674, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle23() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle24() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle25() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.perimeterOfRectangle(-277.62, -431.99);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle26() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle27() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length+2*width " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle28() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -240.7653018583031;
		double mca_width = -302.21486384299783;

		double res = testObject.perimeterOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-1085.960331402602, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle29() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle30() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle31() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.perimeterOfRectangle(87.18, -208.30);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle32() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle33() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length+2*width " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle34() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -93.16347299392147;
		double mca_width = -243.4028815475477;

		double res = testObject.perimeterOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-673.1327090829384, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle35() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle36() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle37() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.perimeterOfRectangle(327.86, -470.78);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle38() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle39() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length+2*width " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle40() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -103.24150215996289;
		double mca_width = 177.38908486609762;

		double res = testObject.perimeterOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(148.29516541226945, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle41() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle42() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle43() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.perimeterOfRectangle(-126.73, -406.97);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle44() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle45() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length+2*width " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle46() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -76.6417619743501;
		double mca_width = -85.81119779912211;

		double res = testObject.perimeterOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-324.90591954694446, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle47() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle48() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle49() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.perimeterOfRectangle(-353.13, -242.13);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle50() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle51() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length+2*width " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle52() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -333.0672891545696;
		double mca_width = -312.8766663208165;

		double res = testObject.perimeterOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-1291.8879109507723, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle53() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle54() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle55() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.perimeterOfRectangle(83.31, -84.43);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle56() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle57() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length+2*width " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle58() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -29.834099065127333;
		double mca_width = -10.306139869806117;

		double res = testObject.perimeterOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-80.2804778698669, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle59() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testPerimeterOfRectangle60() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.perimeterOfRectangle(0.00, mca_width);
	};

};
