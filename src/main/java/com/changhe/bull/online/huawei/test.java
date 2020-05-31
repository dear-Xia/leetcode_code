package com.changhe.bull.online.huawei;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = "";
        do{
            String line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            result += line;

        }while (true);

        System.out.println(result);
    }
}
