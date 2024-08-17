package com.changhe.leetcode.java;

import java.util.HashSet;
import java.util.Set;

public class num_36 {
    public static boolean isValidSudoku(char[][] board) {
        //1,横竖方向只能有一个 沿着对角线处理
        //2，3*3范围内只能有一个，沿着对角线处理
        boolean b = false;
        for (int i = 0;i<board.length;i++){
            b = checkXY(board, i);
            if(b){
                if(i == 0){
                 b =   check3X3(board,0,2,0,2);
                }
                if(i == 3){
                    b = check3X3(board,0,2,3,5)&&check3X3(board,3,5,3,5)&&check3X3(board,3,5,0,2);
                }
                if(i ==6){
                    b = check3X3(board,0,2,6,8)&&
                            check3X3(board,3,5,6,8)&&
                            check3X3(board,6,8,6,8) &&
                            check3X3(board,6,8,3,5)&&
                            check3X3(board,6,8,0,2);
                }
                if(!b){
                    break;
                }
            }else {
                break;
            }
        }
        return b;
    }
    public static boolean checkXY(char[][] board,int i){
        Set<Character> sets = new HashSet<>();
        int nums = 0;
        for(int x = 0;x<board.length;x++){
            if(board[i][x] != '.'){
                sets.add(board[i][x]);
                nums++;
            }
        }
        if(nums == sets.size()){
            sets.clear();
            nums = 0;
        }else {
            return false;
        }
        for(int x = 0;x<board.length;x++){
            if(board[x][i] != '.'){
                sets.add(board[x][i]);
                nums++;
            }
        }
        if(nums == sets.size()){
            return true;
        }else {
            return false;
        }
    }
    public static boolean check3X3(char[][] board,int xs,int xe,int ys,int ye ){
        Set<Character> sets = new HashSet<>();
        int num = 0;
        for(int i = xs;i<= xe;i++){
            for (int j = ys;j<=ye;j++){
                if(board[i][j] != '.'){
                    sets.add(board[i][j]);
                    num++;
                }
            }
        }
        if(num == sets.size()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        char[][] a = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        isValidSudoku(a);
    }
}
