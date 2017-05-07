package org.ktu.examples;

public class GeometryCalculator {
	public double areaOfCircle(double radius) {
		if(radius < 0){
			throw new IllegalArgumentException();
		}
		return Math.PI * radius * radius;
	}
	public double circumferenceOfCircle(double radius){
		if(radius < 0){
			throw new IllegalArgumentException();
		}
		return Math.PI*2*radius;
	}

	public double perimeterOfRectangle(double length, double width){
		if(length < 0 || width < 0){
			throw new IllegalArgumentException();
		}
		return 2*length + 2*width;
	}
	public double areaOfRectangle(double length, double width) {
		if(length < 0 || width < 0){
			throw new IllegalArgumentException();
		}
		return length * width;
	}
	public double perimeterOfSquare(double a){
		if(a < 0){
			throw new IllegalArgumentException();
		}
		return 4*a;
	}
	public double areaOfSquare(double a){
		if(a < 0){
			throw new IllegalArgumentException();
		}
		return a*a;
	}

	public double areaOfTriangle(double base, double height) {
		if(base < 0 || height < 0){
			throw new IllegalArgumentException();
		}
		return base * height * 0.5;
	}
	
	public double areaOfTrapezoid(double base1, double base2, double height){
		if(base1 < 0 || base2 < 0 ||height < 0){
			throw new IllegalArgumentException();
		}
		return 0.5*(base1+base2)*height;
	}
	public double areaOfParallelogram(double base, double height){
		if(base < 0 || height < 0){
			throw new IllegalArgumentException();
		}
		return base*height;
	}
	
	public double volumeOfRectangularPrism(double length, double height, double width){
		if(length < 0 || height < 0 || width < 0){
			throw new IllegalArgumentException();
		}
		return length*height*width;
	}
	public double surfaceAreaOfRectangularPrism(double length, double height, double width){
		if(length < 0 || height < 0 || width < 0){
			throw new IllegalArgumentException();
		}
		return 2*length*height+2*length*width+2*height*width;
	}
	
	public double volumeOfGeneralPrism(double areaOfBase, double height){
		if(areaOfBase < 0 || height < 0){
			throw new IllegalArgumentException();
		}
		return areaOfBase*height;
	}
	
	public double volumeOfCylinder(double areaOfBase, double height){
		if(areaOfBase < 0 || height < 0){
			throw new IllegalArgumentException();
		}
		return areaOfBase*height;
	}
	public double surfaceAreaOfGeneralPrism(double areaOfBase, double height, double circumference){
		if(areaOfBase < 0 || height < 0 || circumference < 0){
			throw new IllegalArgumentException();
		}
		return 2*areaOfBase+circumference*height;
	}
	
	public double volumeOfSquarePyramid(double areaOfBase, double height){
		if(areaOfBase < 0 || height < 0){
			throw new IllegalArgumentException();
		}
		return (1/3)*areaOfBase*height;
	}
	public double surfaceAreaOfSquarePyramid(double perimeterOfBase, double slantHeight){
		if(perimeterOfBase < 0 || slantHeight < 0){
			throw new IllegalArgumentException();
		}
		return 0.5*perimeterOfBase*slantHeight;
	}
	public double volumeOfRightCircularCone(double areaOfBase, double height){
		if(areaOfBase < 0 || height < 0){
			throw new IllegalArgumentException();
		}
		return (1/3)*areaOfBase*height;
	}
	public double surfaceAreaOfRightCircularCone(double circumference, double slantHeight){
		if(circumference < 0 || slantHeight < 0){
			throw new IllegalArgumentException();
		}
		return 0.5*circumference*slantHeight;
	}
	
	public double volumeOfSphere(double radius){
		if(radius < 0){
			throw new IllegalArgumentException();
		}
		return (4/3)*Math.PI*Math.pow(radius, 3);
	}
	public double surfaceAreaOfSphere(double radius){
		if(radius < 0){
			throw new IllegalArgumentException();
		}
		return 4*Math.PI*radius*radius;
	}
	
}
