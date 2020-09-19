import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /**
     * 买股票问题
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

            int i = 0;
            int valley = prices[0];
            int peak = prices[0];
            int maxprofit = 0;
            while (i < prices.length - 1) {
                while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                    i++;
                valley = prices[i];
                while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                    i++;
                peak = prices[i];
                maxprofit += peak - valley;
            }
            return maxprofit;

    }


    @Test
    public void test3(){
        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    /**
     * 旋转数组
     */
    public static int[] rotate(int[] nums, int k) {
        if (k>nums.length){
            k = k%nums.length;
        }
        int l = nums.length;
        int[] num2 = new int[nums.length];
        for (int i=0 ;i<k;i++){
            num2[i]=nums[l-k+i];
        }
        for (int j=0;j<l-k;j++){
            num2[k+j]=nums[j];
        }
        nums=num2;
        return nums;
    }
    @Test
    public void test4(){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] b=rotate(arr,3);
       for (int i=0;i<b.length;i++){
           System.out.println(b[i]);
       }
    }

    /**
     * 三数之和
     */


        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();
            for (int first = 0;first<n;++first){
                //要合上一个数字不同
                if (first>0&&nums[first]==nums[first-1]){
                    continue;
                }
                //c指针指向数组的最后一个元素
                int third = n-1;
                //目标元素
                int target = -nums[first];
                for (int second = first+1;second<n;++second){
                    if (second>first+1&&nums[second]==nums[second-1]){
                        continue;
                    }
                    // 需要保证 b 的指针在 c 的指针的左侧
                    while (second < third && nums[second] + nums[third] > target) {
                        --third;
                    }
                    if (second == third){
                        break;
                    }

                    if (nums[second]+nums[third]==target){
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(first);
                        list1.add(second);
                        list1.add(third);
                        list.add(list1);
                    }


                }
            }
            return list;
        }




}
