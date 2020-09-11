import org.junit.Test;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/9/9 19:06
 * @description：20年9月9号算法练习
 */
public class T200909 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,4,5,6};
        int[] b = new int[]{1,2,3,4,5,6};
        int[] c = t1(a,b);
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }

    }

    /**
     * 求两个数组中公共的部门  可以用map实现
     * 2 如果这两个数组是有序数组 可以用双指针的方式实现
     * @param a
     * @param b
     * @return
     */
    public static int[] t1(int[] a, int[] b){
        int i =0;
        int j=0;
        int k=0;
        while (i<a.length && j<b.length){
            if (a[i] > b[j]){
                j++;
            }else if (a[i] < b[j]){
                i++;
            }else {
                a[k]=a[i];
                i++;
                j++;
                k++;
            }
        }
        int[] c = new int[k];
        for (int z=0;z<k;z++){
            c[z]=a[z];
        }
        return c;
    }


    /**
     * 获取字符串数组的最长前缀
     * @param strings
     */
    public static String t2(String[] strings){
        String prefix = strings[0];
        for (int i=1;i<strings.length;i++){
            prefix=compare(prefix,strings[i]);
            if (prefix.length()==0){
                break;
            }
        }
        return prefix;

    }
    public static  String compare(String pre,String compareS){
        int minLength=Math.min(pre.length(),compareS.length());
        int index=0;
        while (index<minLength&&pre.charAt(index)==compareS.charAt(index)){
            index++;
        }
        return pre.substring(0,index);
    }
    @Test
   public void test2(){
        String[] strings=new String[]{"length","leng","lensss"};
        System.out.println(t2(strings));
    }
}
