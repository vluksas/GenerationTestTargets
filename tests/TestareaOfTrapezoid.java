import org.ktu.examples.GeometryCalculator;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
public class TestareaOfTrapezoid
{
@Rule
 public final ExpectedException exception = ExpectedException.none();
/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid1() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfTrapezoid(-539.37, 130.49, -45.12);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid2() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid3() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid4() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 0.5*(base1+base2)*height " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid5() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -552.9220173456541;
		double mca_base2 = 0.031056524732520074;
		double mca_height = -61.410231607167574;

		double res = testObject.areaOfTrapezoid(mca_base1, mca_base2, mca_height);
		org.junit.Assert.assertEquals(16976.580978761103, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid6() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid7() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid8() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid9() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfTrapezoid(-183.42, -4.63, -102.21);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid10() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid11() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid12() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 0.5*(base1+base2)*height " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid13() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 60.158524323956556;
		double mca_base2 = -7.5874417121661395;
		double mca_height = 70.1886230090588;

		double res = testObject.areaOfTrapezoid(mca_base1, mca_base2, mca_height);
		org.junit.Assert.assertEquals(1844.945949308522, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid14() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid15() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid16() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid17() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfTrapezoid(-254.28, -59.05, 62.59);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid18() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid19() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid20() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 0.5*(base1+base2)*height " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid21() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -357.47462320551324;
		double mca_base2 = -47.331568731060756;
		double mca_height = -107.57050811653723;

		double res = testObject.areaOfTrapezoid(mca_base1, mca_base2, mca_height);
		org.junit.Assert.assertEquals(21772.60387766888, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid22() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid23() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid24() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid25() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfTrapezoid(-211.39, -392.82, -225.73);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid26() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid27() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid28() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 0.5*(base1+base2)*height " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid29() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -354.39349799884985;
		double mca_base2 = 246.58896229773728;
		double mca_height = -431.5557993509806;

		double res = testObject.areaOfTrapezoid(mca_base1, mca_base2, mca_height);
		org.junit.Assert.assertEquals(23261.83628907748, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid30() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid31() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid32() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid33() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfTrapezoid(-158.22, -55.65, -450.94);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid34() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid35() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid36() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 0.5*(base1+base2)*height " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid37() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -128.51067192314193;
		double mca_base2 = -84.40348083589849;
		double mca_height = 74.6550740388162;

		double res = testObject.areaOfTrapezoid(mca_base1, mca_base2, mca_height);
		org.junit.Assert.assertEquals(-7947.560919068991, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid38() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid39() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid40() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid41() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfTrapezoid(-353.73, -166.96, 174.58);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid42() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid43() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid44() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 0.5*(base1+base2)*height " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid45() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -266.89337548427045;
		double mca_base2 = -235.17659856163272;
		double mca_height = 146.77587492273227;

		double res = testObject.areaOfTrapezoid(mca_base1, mca_base2, mca_height);
		org.junit.Assert.assertEquals(-36845.87985651046, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid46() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid47() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid48() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid49() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfTrapezoid(-558.83, 136.23, -531.22);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid50() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid51() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid52() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 0.5*(base1+base2)*height " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid53() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -172.4103885564154;
		double mca_base2 = -239.86580059495836;
		double mca_height = -30.983758324991427;

		double res = testObject.areaOfTrapezoid(mca_base1, mca_base2, mca_height);
		org.junit.Assert.assertEquals(6386.932903907308, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid54() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid55() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid56() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid57() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfTrapezoid(-349.50, -359.20, 63.36);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid58() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid59() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid60() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 0.5*(base1+base2)*height " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid61() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -530.4461752915074;
		double mca_base2 = 106.2394864704456;
		double mca_height = 99.79020021086114;

		double res = testObject.areaOfTrapezoid(mca_base1, mca_base2, mca_height);
		org.junit.Assert.assertEquals(-21165.835204120114, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid62() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid63() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid64() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid65() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfTrapezoid(-505.67, -237.52, -176.82);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid66() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid67() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid68() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 0.5*(base1+base2)*height " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid69() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -225.54345564919765;
		double mca_base2 = 133.8219576441056;
		double mca_height = 205.46889309844624;

		double res = testObject.areaOfTrapezoid(mca_base1, mca_base2, mca_height);
		org.junit.Assert.assertEquals(-9422.957334218805, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid70() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid71() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid72() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid73() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.areaOfTrapezoid(-272.59, -220.32, 339.86);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid74() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid75() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid76() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 0.5*(base1+base2)*height " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid77() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = -245.56062041648966;
		double mca_base2 = -249.03609393371335;
		double mca_height = -300.9849044469264;

		double res = testObject.areaOfTrapezoid(mca_base1, mca_base2, mca_height);
		org.junit.Assert.assertEquals(74433.07240422981, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base1 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid78() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base1 = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(mca_base1, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: base2 > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid79() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_base2 = -1;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, mca_base2, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testAreaOfTrapezoid80() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.areaOfTrapezoid(0.00, 0.00, mca_height);
	};

};
