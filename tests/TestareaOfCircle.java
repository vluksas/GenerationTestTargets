import org.ktu.examples.GeometryCalculator;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
public class TestareaOfCircle
{
@Rule
 public final ExpectedException exception = ExpectedException.none();
/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfCircle1() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfCircle(360.64);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle2() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 3.1415926*radius*radius " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle3() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -66.30071509237699;

		double res = testObject.areaOfCircle(mca_radius);
		org.junit.Assert.assertEquals(13809.764627656767, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle4() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfCircle5() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfCircle(-44.18);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle6() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 3.1415926*radius*radius " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle7() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -41.161567504367845;

		double res = testObject.areaOfCircle(mca_radius);
		org.junit.Assert.assertEquals(5322.7205001314915, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle8() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfCircle9() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfCircle(144.49);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle10() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 3.1415926*radius*radius " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle11() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -415.9916987710139;

		double res = testObject.areaOfCircle(mca_radius);
		org.junit.Assert.assertEquals(543649.7341029904, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle12() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfCircle13() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfCircle(153.68);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle14() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 3.1415926*radius*radius " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle15() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 96.4377501808296;

		double res = testObject.areaOfCircle(mca_radius);
		org.junit.Assert.assertEquals(29217.563163870363, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle16() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfCircle17() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfCircle(-25.02);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle18() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 3.1415926*radius*radius " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle19() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -145.62973030205114;

		double res = testObject.areaOfCircle(mca_radius);
		org.junit.Assert.assertEquals(66626.95138146215, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle20() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfCircle21() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfCircle(-97.18);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle22() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 3.1415926*radius*radius " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle23() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -147.4280337788943;

		double res = testObject.areaOfCircle(mca_radius);
		org.junit.Assert.assertEquals(68282.59197942159, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle24() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfCircle25() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfCircle(-247.57);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle26() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 3.1415926*radius*radius " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle27() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -315.22137567376717;

		double res = testObject.areaOfCircle(mca_radius);
		org.junit.Assert.assertEquals(312162.8172316425, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle28() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfCircle29() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfCircle(-220.36);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle30() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 3.1415926*radius*radius " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle31() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -214.02706358901395;

		double res = testObject.areaOfCircle(mca_radius);
		org.junit.Assert.assertEquals(143908.7621758405, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle32() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfCircle33() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfCircle(104.61);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle34() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 3.1415926*radius*radius " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle35() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = 82.84374025834452;

		double res = testObject.areaOfCircle(mca_radius);
		org.junit.Assert.assertEquals(21561.017305315283, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle36() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfCircle37() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfCircle(-80.63);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle38() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 3.1415926*radius*radius " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle39() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -202.27456260950518;

		double res = testObject.areaOfCircle(mca_radius);
		org.junit.Assert.assertEquals(128538.25298703731, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: radius > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfCircle40() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_radius = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfCircle(mca_radius);
	};

};