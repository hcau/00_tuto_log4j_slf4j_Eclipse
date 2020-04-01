package tuto_log4j_slf4j;

//import org.apache.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//	public class TestLog4j1 {
//		public static void main(String[] args) {
//			final Logger logger= LoggerFactory.getLogger(TestLog4j1.class);
//			logger.error("This is an error by HCau!");
//			logger.debug("msg de debogage");
//			logger.info("msg d'information");
//			logger.warn("msg d'avertissement");
//			logger.error("msg d'erreur");
//		}
//	}

public class TestLog4j1 {
	private static final Logger log = LoggerFactory.getLogger(TestLog4j1.class);

	public static void main(String argv[]) {
		System.out.println("Running App ...");
		log.debug("message log.debug");

		// Logging the information
		log.info("message1 log.info");

		Integer age = 23;
		// Logging the information
		log.info("At the age of {} ramu got his first job", age);
		Integer oldWeight = 105;
		Integer newWeight = 85;
		log.info("Old weight is {}. new weight is {}.", oldWeight, newWeight);

		// démo de certains cas :
		log.error("This is an error by HCau!");
		log.debug("msg de debogage");
		log.info("msg d'information");
		log.warn("msg d'avertissement");
		log.error("msg d'erreur");

	}
}
