import java.util.ArrayList;
import java.util.List;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/10/30 13:38
 * @description：
 */
public class JvmTest4 {

    void test() throws InterruptedException {
        //首先生成200M的对象
        byte[] a = new byte[1024 * 1024 * 50];

        Byte[] a1 = new Byte[1024 * 1024 * 50];

//        //每次增加30M 加到h内存溢出
//
//        byte[] b = new byte[1024 * 1024 * 30];
//        Thread.sleep(1000);
//        byte[] c = new byte[1024 * 1024 * 30];
//        Thread.sleep(1000);
//        byte[] d = new byte[1024 * 1024 * 30];
//        Thread.sleep(1000);
//        byte[] e = new byte[1024 * 1024 * 30];
//        Thread.sleep(1000);
//        byte[] f = new byte[1024 * 1024 * 30];
//        Thread.sleep(1000);
//        byte[] g = new byte[1024 * 1024 * 30];
//        Thread.sleep(1000);
//        byte[] h = new byte[1024 * 1024 * 30];

        System.out.println("aa");

    }

    public static void main(String[] args) throws InterruptedException {
        JvmTest4 j = new JvmTest4();
        j.test();
    }
}
