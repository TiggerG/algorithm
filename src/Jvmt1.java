import java.util.ArrayList;
import java.util.List;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/10/29 17:37
 * @description：
 */
public class Jvmt1 {
    private static final int _1MB = 1024 * 1024;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("0.---");
        List caches = new ArrayList();
        for (int i = 0; i < 11; i++){
            caches.add(new byte[3 * _1MB]);

        }
        System.out.println("1.---");
        caches.add(new byte[3 * _1MB]);
        caches.remove(0);
        caches.add(new byte[3 * _1MB]);
        for (int i = 0; i < 8; i++) {
            caches.remove(0);
            Thread.sleep(1000);
        }
        caches.add(new byte[3 * _1MB]);
        System.out.println("2.---");
        for (int i = 0; i < 7; i++){
            caches.add(new byte[3 * _1MB]);
            Thread.sleep(1000);
        }
    }
}
