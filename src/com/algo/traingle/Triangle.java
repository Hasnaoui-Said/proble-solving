package com.algo.traingle;

import java.util.ArrayList;
import java.util.Random;

public class Triangle {
    private int largeur;
    private String symbole;
    private ArrayList<Character>  guirlandes;

    public Triangle (int largeur, String symbole, ArrayList<Character> guirlandes) {
        this.largeur = largeur;
        this.symbole = symbole;
        this.guirlandes = guirlandes;
    }

    public void run(){
        boolean bool = false;
        int[] arr = {2,3};
        Boolean[] arrBool = {true, false};
        for (int i = 0; i<this.largeur*2; i++){
            String s = "";
            for (int l = (this.largeur*2) +1 - i/2; l>0; l--)
                s += " ";
            for (int j = 0; j<i +1; j++){
                Random suiteType = new Random();
                int n = suiteType.nextInt(2);
                int h = suiteType.nextInt(2);
                if (arrBool[n] && bool){
                    s += toString(this.guirlandes);
                    for (int m = 0; m< arr[h]; m++)
                        s+= this.symbole;
                }else
                    s += this.symbole;
            }
            if(i%2 == 0){
                System.out.println(s);
                bool = ! bool;
            }

        }
    }

    static String toString(ArrayList<Character> guirlandes) {
        String temp = "";
        for (Character character: guirlandes)
            temp += character;
        return temp;
    }
    public void pyramide(){
        int r = this.largeur*2;
        for (int i = 0; i < r; i++) {
            if (i%2 == 0){
                for (int j = 0; j < r- i; j++) { // i/2
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print(this.symbole + " ");
                }

                System.out.println("");
            }
        }
    }
    public void sapin(){
        int r = this.largeur*2;
        int[] arr = {2,3};
        boolean boo = false;
        for (int i = 0; i < r; i++) {
            if (i%2 == 0){
                for (int j = 0; j < r- i; j+=2) {
                    System.out.print(" ");
                }
                if (boo){
                    for (int k = 0; k <= i; k++) {
                        Random suiteType = new Random();
                        int n = suiteType.nextInt(2);
                        for (int h = 0; h<this.guirlandes.toArray().length; h++)
                            if(k<=i){
                                System.out.print(this.guirlandes.get(h));
                                k++;
                            }
                        for (int h = 0; h<arr[n]; h++)
                            if(k<=i){
                                System.out.print(this.symbole);
                                k++;
                            }
                        k--;
                    }
                    boo = !boo;
                } else{
                    for (int k = 0; k <= i; k++) {
                        System.out.print(this.symbole);
                        boo = !boo;
                    }
                }


                System.out.println("");
            }
        }
    }
}
