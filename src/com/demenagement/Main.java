package com.demenagement;

import com.demenagement.object.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Demenagement demenagement = new Demenagement();
        Carton carton1 = new Carton(1);
        Carton carton2 = new Carton(2);
        Carton carton3 = new Carton(3);
        Carton carton4 = new Carton(4);
        Carton carton5 = new Carton(5);
        Carton carton6 = new Carton(6);
        Carton carton7 = new Carton(7);
        carton1.addAffaire(new MyObjetct("Object1"));
        carton1.addAffaire(new MyObjetct("Object2"));
        carton4.addCarton(carton5);
        carton1.addCarton(carton4);
        carton2.addAffaire(new MyObjetct("Object4"));
        carton3.addAffaire(new MyObjetct("Object3"));
        carton7.addAffaire(new MyObjetct("Test"));

        carton6.addCarton(carton7);
        carton5.addCarton(carton6);
        carton3.addCarton(carton5);

        demenagement.addCarton(carton1);
        demenagement.addCarton(carton2);
        demenagement.addCarton(carton3);

        System.out.println("Le contenu de tous les cartons du déménagement");
        demenagement.printAllObject();
        System.out.println("Le contenu d’un carton donné: 1-2-3-4-5");
          Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        demenagement.printObjectByCarton(x);
        System.out.println("Trouver le numéro du carton où se trouve un objet de nom donné: ");
        String s = scanner.next();
        System.out.println(demenagement.findNumCarton(s));

    }
}
