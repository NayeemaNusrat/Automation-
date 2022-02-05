import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLogger {

	public static final Logger looger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void getLog(String msg) {
		looger.log(Level.INFO, msg);
	}

}
