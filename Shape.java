class Shape {
	
	void area() {
	System.out.println("Area not defined");
	}

}


class Circle extends Shape {
	double radius;
	Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	
	void area() {
	// Calculate and display area
		double area = (22/7)*radius*radius;
		System.out.println("area is: "+area);
		
	}

}