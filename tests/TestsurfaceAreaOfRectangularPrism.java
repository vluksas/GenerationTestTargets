import org.ktu.examples.GeometryCalculator;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
public class TestsurfaceAreaOfRectangularPrism
{
@Rule
 public final ExpectedException exception = ExpectedException.none();
/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism1() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.surfaceAreaOfRectangularPrism(127.16, -355.82, -134.61);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism2() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism3() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism4() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length*height+2*length*width+2*height*width " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism5() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 52.88714909056162;
		double mca_height = 54.9943101138949;
		double mca_width = -216.54505370051822;

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, mca_height, mca_width);
		org.junit.Assert.assertEquals(-40905.40819718633, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism6() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism7() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism8() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism9() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.surfaceAreaOfRectangularPrism(-256.48, 322.98, 17.86);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism10() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism11() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism12() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length*height+2*length*width+2*height*width " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism13() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -305.01519501234145;
		double mca_height = -143.96408272620383;
		double mca_width = 105.68345951685734;

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, mca_height, mca_width);
		org.junit.Assert.assertEquals(-7076.901110566952, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism14() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism15() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism16() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism17() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.surfaceAreaOfRectangularPrism(-43.07, -36.68, -494.89);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism18() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism19() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism20() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length*height+2*length*width+2*height*width " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism21() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 35.071646660664356;
		double mca_height = 26.218491576143535;
		double mca_width = -423.2920874065068;

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, mca_height, mca_width);
		org.junit.Assert.assertEquals(-50048.20975831532, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism22() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism23() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism24() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism25() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.surfaceAreaOfRectangularPrism(-1.90, -42.04, 163.19);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism26() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism27() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism28() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length*height+2*length*width+2*height*width " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism29() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -404.17740955987347;
		double mca_height = -248.15661569243397;
		double mca_width = 199.67592648326655;

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, mca_height, mca_width);
		org.junit.Assert.assertEquals(-59912.20554620017, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism30() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism31() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism32() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism33() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.surfaceAreaOfRectangularPrism(-375.22, -47.86, -117.57);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism34() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism35() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism36() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length*height+2*length*width+2*height*width " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism37() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -200.04061240088862;
		double mca_height = 168.6893030195081;
		double mca_width = -192.49495734889132;

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, mca_height, mca_width);
		org.junit.Assert.assertEquals(-55419.485038601444, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism38() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism39() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism40() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism41() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.surfaceAreaOfRectangularPrism(231.96, -45.97, -245.16);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism42() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism43() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism44() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length*height+2*length*width+2*height*width " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism45() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -351.1975602466646;
		double mca_height = -311.2365331876634;
		double mca_width = 148.24195977150302;

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, mca_height, mca_width);
		org.junit.Assert.assertEquals(22209.96576994742, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism46() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism47() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism48() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism49() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.surfaceAreaOfRectangularPrism(-185.27, -342.44, -277.21);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism50() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism51() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism52() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length*height+2*length*width+2*height*width " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism53() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 146.49582555602382;
		double mca_height = 199.5567577866487;
		double mca_width = -86.12909376544273;

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, mca_height, mca_width);
		org.junit.Assert.assertEquals(-1141.926842512279, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism54() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism55() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism56() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism57() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.surfaceAreaOfRectangularPrism(43.08, 26.15, 16.17);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism58() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism59() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism60() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length*height+2*length*width+2*height*width " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism61() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -312.95961346592026;
		double mca_height = 147.08776822585793;
		double mca_width = 66.15252030147727;

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, mca_height, mca_width);
		org.junit.Assert.assertEquals(-114010.74339843215, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism62() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism63() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism64() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism65() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.surfaceAreaOfRectangularPrism(11.65, 119.67, -172.42);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism66() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism67() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism68() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length*height+2*length*width+2*height*width " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism69() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -166.6044035373821;
		double mca_height = -259.4254471023766;
		double mca_width = 48.40053067060316;

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, mca_height, mca_width);
		org.junit.Assert.assertEquals(45202.702048856, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism70() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism71() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism72() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by random generation rule. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism73() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();

		double res = testObject.surfaceAreaOfRectangularPrism(-314.41, 340.06, 13.81);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism74() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism75() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism76() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  post: result = 2*length*height+2*length*width+2*height*width " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism77() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -305.67528064955536;
		double mca_height = -35.40518294954005;
		double mca_width = -286.77905331075726;

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, mca_height, mca_width);
		org.junit.Assert.assertEquals(217274.4433765846, res, 0.001);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: length > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism78() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_length = -1;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(mca_length, 0.00, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: height > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism79() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_height = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, mca_height, 0.00);
	};

/**
* Auto generated by an OCL generation rule. Checks whether constraint "  pre: width > 0 " is satisfied. 
*/	@org.junit.Test
	public void testSurfaceAreaOfRectangularPrism80() throws Throwable
	{
		GeometryCalculator testObject = new GeometryCalculator();
		double mca_width = 0;
		exception.expect(Throwable.class);

		double res = testObject.surfaceAreaOfRectangularPrism(0.00, 0.00, mca_width);
	};

};