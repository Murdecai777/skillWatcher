import org.apache.logging.log4j.*;


public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class.getName());

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        String greeting = new App().getGreeting();
        LOGGER.info(greeting);
    }
}
