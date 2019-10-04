
public class Calculator {

	public static void main(String[] args) {
		

		 Integer number1 = 12 ;
			Integer number2 = 13 ;
			
			Calculator calc  = new Calculator();
			Integer sub = calc.subtractNumbers(12, 13);
			System.out.println(sub);
			
			//Calculator calc  = new Calculator();
			Integer sum = calc.additionNumbers(12, 13);
			System.out.println(sum);
			
	}
	
	
	
public Integer subtractNumbers(Integer number1, Integer number2) {
		
		return number1 - number2;
		
	}
public Integer additionNumbers(Integer number1, Integer number2) {
	
	return number1 + number2;
	
}
}


