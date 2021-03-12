package string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/11/18 9:48
 * @description：算法之字符串
 */
public class StringTest20201118 {

    /**
     *
     *
     * @param s
     */
    public void reverseString(char[] s) {
        if (s.length == 0){
            return ;
        }
        int len = s.length;
        for (int i = 0; i<len/2; i++){
            char a = s[i];
            s[i] = s[len-i-1];
            s[len-i-1] = a;
        }
        String a = "hlelfhello";
        int hello = a.indexOf("hello");
        System.out.println(hello);


        HashMap
    }

    @Test
    public void test1(){

        char[] s = {'h','e','l','l'};
        reverseString(s);
        for (int i = 0;i<s.length; i++){
            System.out.println(s[i]);
        }
    }

    /**
     * sunday 字符串匹配
     * @param origin  目标串
     * @param aim  模式串
     * @return
     */
    public int strStr(String origin, String aim) {
        if(aim.length() > origin.length()){
            return -1;
        }
        if (aim.length() == 0){
            return 0;
        }
        //目标串index
        int originIndex = 0;
        //模式串index
        int aimIndex = 0;
        while (aimIndex < aim.length() ){
            if (originIndex > origin.length() - 1){
                return -1;
            }
            if (origin.charAt(originIndex) == aim.charAt(aimIndex)){
                originIndex++;
                aimIndex++;
            } else {
                //找到模式串在目标串的后一个index
                int nextCharIndex  = originIndex - aimIndex + aim.length();
                if(nextCharIndex < origin.length()){
                    int step = aim.lastIndexOf(origin.charAt(nextCharIndex));
                    if (step == -1){
                        originIndex = nextCharIndex + 1;
                    }else {
                        originIndex = nextCharIndex - step;
                    }
                    aimIndex = 0;
                }else {
                    return -1;
                }
            }

        }
        return originIndex - aimIndex;
    }



    @Test
    public void test2(){
        String origin = "aaaaa";
        String aim = "bba";
        int i = strStr(origin, aim);
        System.out.println(i);
    }
}
