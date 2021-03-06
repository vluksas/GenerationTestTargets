import org.ktu.examples.GeometryCalculator;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
public class TestareaOfRectangle
{
@Rule
 public final ExpectedException exception = ExpectedException.none();
/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfRectangle1() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfRectangle(-342.68, -67.13);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle2() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle3() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = length*width " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle4() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 25.179080540028906;
		double mca_width = 63.67039426721877;

		double res = testObject.areaOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(1603.161985269696, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle5() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle6() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfRectangle7() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfRectangle(-135.88, 256.88);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle8() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle9() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = length*width " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle10() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 287.8302137112633;
		double mca_width = 66.94051655168778;

		double res = testObject.areaOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(19267.50318501465, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle11() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle12() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfRectangle13() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfRectangle(-53.00, 178.27);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle14() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle15() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = length*width " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle16() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -167.37556002223005;
		double mca_width = 38.24691434133311;

		double res = testObject.areaOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-6401.598707002891, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle17() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle18() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfRectangle19() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfRectangle(-267.69, 138.03);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle20() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle21() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = length*width " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle22() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -368.23342552955165;
		double mca_width = 76.10784630796181;

		double res = testObject.areaOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-28025.452955657416, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle23() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle24() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfRectangle25() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfRectangle(-92.22, -54.78);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle26() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle27() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = length*width " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle28() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -497.28532925223533;
		double mca_width = 40.41782515566473;

		double res = testObject.areaOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-20099.191490194014, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle29() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle30() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfRectangle31() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfRectangle(125.39, -232.11);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle32() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle33() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = length*width " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle34() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 66.44373395358065;
		double mca_width = -148.50873793128363;

		double res = testObject.areaOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(-9867.47507288824, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle35() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle36() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfRectangle37() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfRectangle(-27.61, 49.20);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle38() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle39() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = length*width " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle40() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -34.96224239700649;
		double mca_width = -20.877242596172934;

		double res = testObject.areaOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(729.9152162285072, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle41() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle42() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfRectangle43() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfRectangle(-438.05, 400.31);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle44() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle45() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = length*width " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle46() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -118.88728288775899;
		double mca_width = -364.5378364237338;

		double res = testObject.areaOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(43338.91288220005, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle47() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle48() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfRectangle49() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfRectangle(150.53, 47.17);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle50() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle51() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = length*width " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle52() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -135.1394595403374;
		double mca_width = -14.900832796641112;

		double res = testObject.areaOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(2013.6904908390143, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle53() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle54() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfRectangle55() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfRectangle(-35.28, 219.36);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle56() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle57() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = length*width " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle58() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -371.4589342740361;
		double mca_width = -169.3058258292147;

		double res = testObject.areaOfRectangle(mca_length, mca_width);
		org.junit.Assert.assertEquals(62890.16162890567, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle59() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(mca_length, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfRectangle60() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfRectangle(0.00, mca_width);
	};

};
