class Rectangle {
	private int length;
	private int breadth;

	Rectangle() {
	// Default constructor
		this.length = 0;
		this.breadth = 0;
	}
	Rectangle(int length, int breadth) {
	// Parameterized constructor
		this.length = length;
		this.breadth = breadth;
		
	}
	public int area() {
	// Calculate and return area
	
		return length*breadth;
	}
}
