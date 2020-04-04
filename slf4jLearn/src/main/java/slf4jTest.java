import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class slf4jTest {
    public static final Logger LOGGER = LoggerFactory.getLogger(slf4jTest.class);

    public static void main(String[] args) {
        //日志输出
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info"); //默认级别
        LOGGER.debug("debug");
        LOGGER.trace("trace");
        //使用占位符输入日志信息
        String name = "ls";
        int age = 22;
        LOGGER.info("用户: {},{}",name,age);

        //将系统异常信息输出
        try{
            int i = 10 / 0;
        }catch (Exception e){
            LOGGER.error("出现错误：{}",e);
        }

    }
}
