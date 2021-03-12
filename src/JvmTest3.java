import java.util.ArrayList;
import java.util.List;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/10/30 13:38
 * @description：
 */
public class JvmTest3 {

    void test() throws InterruptedException {
        List list = new ArrayList();
        for (int i = 0; i < 200; i++) {
            list.add(new byte[1024 * 1024 * 1]);
        }

        for (int i = 0; i < 1000; i++) {
            list.add(new byte[1024 * 1024 * 30]);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JvmTest3 j = new JvmTest3();
        j.test();
    }
}
