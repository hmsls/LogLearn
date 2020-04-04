import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jTest {
    public static void main(String[] args) {
        //初始化配置信息，入门案例暂不使用配置文件
//        BasicConfigurator.configure();

        //获取日志记录器对象
        Logger logger = Logger.getLogger(Log4jTest.class);
        //日志输出
        logger.info("hello log4j");

        //日志级别
        logger.fatal("严重错误，一般会造成系统崩溃。");
        logger.error("错误信息，不会影响系统运行");
        logger.warn("警告信息，可能会发生错误");
        logger.info("运行信息");
        logger.debug("调试信息");
        logger.trace("追踪信息，程序所有流程");
    }
}
