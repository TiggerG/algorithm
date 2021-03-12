import java.util.ArrayList;
import java.util.List;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/10/30 13:38
 * @description：
 */
public class JvmTest2 {
    /**
     * -Xms512M -Xmx512M -Xmn400M -Xss1M -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=256M
     * @throws InterruptedException
     */
    void test() throws InterruptedException {
        List list = new ArrayList();
        byte[] b = new byte[1024 * 1024 * 290];
        for (int i = 0; i < 1000; i++) {
            byte[] a = new byte[1024 * 1024 * 10];
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JvmTest2 jvmTest2 = new JvmTest2();
        jvmTest2.test();
    }
}
