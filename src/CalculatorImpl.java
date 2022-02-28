import java.util.logging.Logger;


interface Calculator {
	
	//void switchOn();
	
	//void sum(int input);
	
	int subtract (int i1, int i2);
}

public class CalculatorImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Logger LOGGER = Logger.getAnonymousLogger();
		
//		 Calculator calculator = () -> LOGGER.info("Switch On");
//		 
//		 calculator.switchOn();
		
//		Calculator calculator = (int input) -> LOGGER.info("Sum : "+input);
//		
//		calculator.sum(394);
		
		Calculator calculator = (i1,i2) -> {
			if(i2 < i1) {
				throw new RuntimeException("message");
			} else {
				return i2 - i1;
			}
		};
		
		System.out.println(calculator.subtract(8, 20));
		//LOGGER.info(calculator.subtract(8, 20));

	}

}
