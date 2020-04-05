package lishuai;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackLearn {
    public static final Logger LOGGER = LoggerFactory.getLogger(LogbackLearn.class);
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            //日志输出
            LOGGER.error("error");
            LOGGER.warn("warn");
            LOGGER.info("info");
            LOGGER.debug("debug"); //默认级别
            LOGGER.trace("trace");
        }

    }
}
