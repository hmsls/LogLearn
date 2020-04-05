package lishuai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLog4j2Test {
    public static final Logger LOGGER = LoggerFactory.getLogger(Slf4jLog4j2Test.class);

    public static void main(String[] args) {
        /*全局配置log4j2的异步日志
        * 配置文件不需要任何修改
        * classpath下面添加个log4j2.component.properties然后在里面配置
        * Log4jContextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector
        * */

        /*
        * 混合异步，关闭全局配置，只需配置配置文件
        * <AsyncLogger name="com.foo.Bar" level="trace" includeLocation="true">
      <AppenderRef ref="RandomAccessFile"/>
    </AsyncLogger>
        * */
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
        /*try{
            int i = 10 / 0;
        }catch (Exception e){
            LOGGER.error("出现错误：{}",e);
        }*/

    }
}
