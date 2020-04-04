import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JCLTest {
    public static void main(String[] args) {
        //获取log日志记录器对象
        Log log = LogFactory.getLog(JCLTest.class);
        log.info("hello jcl");
    }
}
