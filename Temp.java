class TemperatureConverter {

	double toFahrenheit(double celsius) {
	// Formula: (celsius * 9/5) + 32
	
		return celsius*(9/5) + 32 ;
	}


	double toCelsius(double fahrenheit) {
	// Formula: (fahrenheit - 32) * 5/9
	
		return (fahrenheit -32) * (5/9);
	
	}


}