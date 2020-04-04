import org.apache.log4j.Logger;

public class Log4jImplTest {
    //定义log4j的日志记录器
    public static final Logger LOGGER = Logger.getLogger(Log4jImplTest.class);
    public static void main(String[] args) {
        //测试log4j的桥接器
        LOGGER.info("hello log4j");

    }
}
