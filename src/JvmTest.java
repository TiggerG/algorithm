
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/10/17 16:32
 * @description：jvm test
 */
public class JvmTest {

    /**
     * -Xms512M -Xmx512M -Xmn400M -Xss1M -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=256M
     *
     * @throws InterruptedException
     */
    void test() throws InterruptedException {
        List list = new ArrayList();
        //首先生成200M的对象
        for (int i = 0; i < 200; i++) {
            byte[] a = new byte[1024 * 1024 * 1];
        }
        //每次增加50M 循环到第二次的时候eden 满了触发 YGC
        for (int i = 0; i < 1000; i++) {
            byte[] a = new byte[1024 * 1024 * 50];
            Thread.sleep(1000);
        }

    }


    public static void main(String[] args) throws InterruptedException {
        JvmTest j = new JvmTest();
        j.test();
    }

}
