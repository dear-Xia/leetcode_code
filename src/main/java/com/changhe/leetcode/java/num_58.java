package com.changhe.leetcode.java;

public class num_58 {
    /**
     * 最后一个单词的长度
     * 分为两个情况，一个是切分后刚好最后一个就是单词
     * 还有有一个情况就是最后一个是重复的，需要去重
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        String flage = "";
        if(s.length()<=0 || s.equals(null)) {
            return 0;
        }

        String[] strings = s.split(" ");
        for(int i =strings.length-1 ; i>=0;i--){
            if(strings[i].length()>0){
                flage = strings[i];
                break;
            }
        }
        //拿到了最后的字符串，需要判断重复
        String son_string = "";
        for(int i =1;i <=flage.length();i++){
            if(flage.length() %i ==0){
                son_string = flage.substring(0,i);
                for(int j=1;j<flage.length()/i;j++){
                    String tmp_string = flage.substring(j*i ,j*i +i);
                    if(!son_string.equals(tmp_string)){
                        break;
                    }
                }
            }else {
                continue;
            }
        }

        return  son_string.length();
    }
    public static void main(String[] args) {
        String s = " abcb ";
        System.out.println(lengthOfLastWord(s));
    }
}
