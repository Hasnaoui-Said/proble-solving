package com.codeForce;

import java.util.Scanner;

public class AdibaLovesSnakes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean bool = true;
        for (int i = 0; i<n; i++){
            System.out.println(print1(m));
            if(i!=n-1)
                System.out.println(print2(m, bool));
            bool = !bool;
            i+=1;
        }
        //3<=n && n<=50 && 3<=m && m<=50
//        Boolean boo = true;
//        Boolean boo2 = true;
//        for (int i = 0; i<n; i++){
//            String c = "";
//            for (int j = 0; j<m; j++){
//                if((i%2 == 0 || j==m-1)){
//                    c+="#";
//                } else {
//                    c += ".";
//                }
//            }
//
//            System.out.println(c);
//        }

    }

    public  static String print1(int m){
        String s = "";
        for (int i = 0; i<m; i++) s+="#";
        return s;

    }
    public  static String print2(int m, Boolean aBoolean){
        String s = "";
        for (int i = 0; i<m-1; i++) s+=".";
        return aBoolean ? s+"#": "#"+s;
    }
}
