class Vehicle {
		String brand;
		int speed;

	void display() {
		// Display vehicle details
		
		System.out.println("brand is"+brand);
		System.out.println("Speed is"+speed);
	}

}


class Car extends Vehicle {
		String model;

	@Override
	void display() {
		// Display car details including brand, speed, and model
	
		System.out.println("brand is"+brand);
		System.out.println("Speed is"+speed);
		System.out.println("Model is"+model);
	}

}
