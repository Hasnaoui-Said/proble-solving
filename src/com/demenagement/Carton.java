package com.demenagement;

import java.util.ArrayList;

public class Carton {
    private int num;
    ArrayList<MyObjetct>  affaires;
    ArrayList<Carton>  cartons;

    public Carton(int num) {
        this.num = num;
        this.affaires = new ArrayList<>();
        this.cartons = new ArrayList<>();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<MyObjetct> getAffaires() {
        return affaires;
    }

    public void setAffaires(ArrayList<MyObjetct> affaires) {
        this.affaires = affaires;
    }

    public ArrayList<Carton> getCartons() {
        return cartons;
    }

    public void setCartons(ArrayList<Carton> cartons) {
        this.cartons = cartons;
    }

    public boolean addAffaire(MyObjetct affaire){
        return this.affaires.add(affaire);
    }
    public boolean addCarton(Carton carton){
        return this.cartons.add(carton);
    }

    @Override
    public String toString() {
        return "-> " +" num= " + num;
    }


    public void printObjectByCarton(int i) {
        for (Carton carton: cartons){
            if (carton.getNum() == i)
                for(MyObjetct o: carton.getAffaires())
                    System.out.println(o.toString());
            else  carton.printObjectByCarton(i);
        }
    }

    public void printAllObject() {
        for (Carton carton: cartons){
            System.out.printf("\t\tNumero du carton: %d\n", carton.getNum());
            for(MyObjetct o: carton.getAffaires())
                System.out.printf("\t\t\t%s\n", o.toString());
            carton.printAllObject();
        }
    }

    public String findNumCarton(String s) {
        String res = "";
        for (Carton carton: cartons){
            for(MyObjetct o: carton.getAffaires())
                if(o.getName().equals(s)){
                    res += carton.getNum() + " -> "+ o.getName();
                }
            if(!res.contains(s))
                res += carton.findNumCarton(s);
        }
        return res;
    }

}
