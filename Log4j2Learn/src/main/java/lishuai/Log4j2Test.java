package lishuai;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Test {
    //定义日志记录器对象
    public static final Logger logger = LogManager.getLogger(Log4j2Test.class);
    public static void main(String[] args) {
        //日志输出
        logger.fatal("fattal");
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");

    }
}
