import java.util.logging.Logger;

/**
 Functional Interface is the one which contains only one abstract method and multiple static and default methods 
 */

/**
 * @author KapurA
 *
 */
@FunctionalInterface
public interface myFunctionalInterface {
	
	static final Logger LOGGER = Logger.getAnonymousLogger();
	
	void m1();
	
	default void m2() {
		LOGGER.info("Default Method 1");
	}
	
	default void m3() {
		LOGGER.info("Default Method 2");
	}
	
	static void m4() {
		LOGGER.info("static method 1");
	}

}
