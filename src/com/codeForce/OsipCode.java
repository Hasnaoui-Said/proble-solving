package com.codeForce;

import java.util.Scanner;

public class  OsipCode{

    public static void main(String args[]) throws Exception {
        String s = new Scanner(System.in).nextLine();
//        for (int i = 0; i<s.length(); i++) {
//            if (s.charAt(i) == '-' && s.charAt(i + 1) == '-') {
//                System.out.print(2);
//                i += 1;
//            } else if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
//                System.out.print(1);
//                i += 1;
//            } else if (s.charAt(i) == '.') {
//                System.out.print(0);
//            }
//        }
        String res = s.replace("--", "2");
        res = res.replace("-.", "1");
        res = res.replace(".", "0");

        System.out.println(res);
    }
}

// -..-.---.--.
// 0 == .
// 1 == -.
// 2 == --
