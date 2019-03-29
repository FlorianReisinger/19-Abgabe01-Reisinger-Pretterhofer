package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		
		// TODO implement your own Calculator Implementation and create a new CalculatorImpl Class
		Calculator calc = new CalculatorImpl();
		
		calc.addValue(20);	// currently highest number
		calc.addValue(4);	// currently lowest number
		calc.addValue(16);
		
		// add other integers
		calc.addValue(19);
		calc.addValue(11);
		
		// output lowest number 
		System.out.printf("Lowest: %d\n", calc.getMinimum());
		
		// output highest number
		System.out.printf("Highest: %d\n", calc.getMaximum());
		
		// output sum of all numbers
		System.out.printf("Sum: %d\n", calc.sum());
	}

}
