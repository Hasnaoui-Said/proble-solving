package com.algo.traingle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quel symbole voulez-vous pour le triangle ? ");
        String s = scan.next();
        System.out.println("Combien de lignes (de 8 a 35)? ");
        int l = scan.nextInt();
        while (8>l || l>35){
            System.out.println("Combien de lignes (de 8 a 35)? ");
            l = scan.nextInt();
        }
        System.out.println("Quelles guirlandes voulez-vous mettre (taille de 3 a 25 caractères et elles " +
                "ne peuvent pas contenir le même caractère que celui utilisé pour les épines)? ");
        String g = scan.next();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i<g.length(); i++){
            list.add(g.charAt(i));
        }

        Triangle triangle= new Triangle(l, s, list);
        //triangle.run();
        triangle.pyramide();
        triangle.sapin();


    }

}