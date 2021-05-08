package com.changhe.leetcode.java;

import javafx.scene.chart.Chart;
import sun.font.DelegatingShape;

import javax.activation.MimetypesFileTypeMap;
import java.util.HashMap;

/**
 * 罗马数字转整数
 */
public class num_13 {
    /**
     * 思路：
     * 首先是大值在左，执行的是加法
     * 其次是大值在右，执行的是减法
     * 在整个遍历的时候，需要往后走一位，在进行判断
     * 我这里用了map接口存储字符与整数的映射
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        if(s == null || s.length() == 0) {
            return 0;
        }
        int sum = 0;
        for(int i=0 ;i<s.length()-1;i++){
            if(map.get(s.charAt(i))>= map.get(s.charAt(i+1))){
                sum += map.get(s.charAt(i));
            }else{
                sum -= map.get(s.charAt(i));
            }
        }
        sum += map.get(s.charAt(s.length()-1));

        return  sum;

    }

    public static void main(String[] args) {


        System.out.println(romanToInt("MCMXCIV"));
    }
}
