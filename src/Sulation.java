import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/8/7 10:58
 * @description：
 */
public class Sulation {
    public static void main(String[] args) {
//
//        ArrayList<Integer> list= (ArrayList<Integer>) plusOne(new int[]{9,9,9,9});
//        System.out.println(list);

    }
    //
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int ant=sum;
        for (int i=0;i<nums.length;i++){
            if(sum>0){
                sum+=nums[i];
            }else {
                sum=nums[i];
            }
            ant=Math.max(sum,ant);
        }
        return ant;
    }
    public static int lengthOfLastWord(String s) {

        int i= s.lastIndexOf(" ");
        if (i==-1){
            return s.length();
        }

        if(i!=s.length()-1){
            return s.length()-i-1;
        }else {
            return lengthOfLastWord(s.substring(0,i));
        }
    }

    public static int[] plusOne(int[] digits) {
       for (int i = digits.length-1;i>0;i--){
           digits[i]++;
           digits[i]=digits[i]%10;
           if (digits[i]!=0){
               return digits;
           }
       }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }



        public int mySqrt(int x) {
            if (x==0){
                return 0;
            }
            if(x==1){
                return 1;
            }
            int[] a=new int[x];
            for (int i=0;i<x;i++){
                a[i]=i;
            }
            int start=0;
            int end=a.length-1;
            int mid=(start+end)/2;
            int index=0;
            for (int i=0;i<a.length;i++){
                if(a[mid]*a[mid]==x){
                    index=mid;
                    break;
                }else if (a[mid]*a[mid]>x&&a[mid-1]*a[mid-1]<x) {
                    index=mid-1;
                    break;
                } else{
                    if(a[mid]*a[mid]>x){
                        end=mid-1;
                        index=mid;
                    }else{
                        start=mid+1;
                        index=mid+1;
                    }
                    mid=(start+end)/2;
                }

            }
            return a[index];
        }



}
