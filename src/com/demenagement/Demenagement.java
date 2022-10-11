package com.demenagement;

import java.util.ArrayList;

public class Demenagement {

    ArrayList<Carton> cartons;

    public Demenagement() {
        this.cartons = new ArrayList<>();
    }

    public ArrayList<Carton> getCartons() {
        return cartons;
    }

    public void setCartons(ArrayList<Carton> cartons) {
        this.cartons = cartons;
    }
    public boolean addCarton(Carton carton){
        return this.cartons.add(carton);
    }

    public void printObjectByCarton(int i) {
        for (Carton carton: cartons){
            if (carton.getNum() == i)
                for(MyObjetct o: carton.getAffaires())
                    System.out.println(o.toString());
            else carton.printObjectByCarton(i);
        }
    }

    public void printAllObject() {
        for (Carton carton: cartons){
            System.out.printf("Numero du carton : %d\n",carton.getNum());
            for(MyObjetct o: carton.getAffaires())
                System.out.printf("\t%s\n", o.toString());
            carton.printAllObject();
        }
    }

    public String findNumCarton(String s) {
        String res = "";
        for (Carton carton: cartons){
            for(MyObjetct o: carton.getAffaires())
                if(o.getName().equals(s)){
                    return carton.getNum() + "->" + o.getName();
                }
            res = carton.findNumCarton(s);
        }
        return res.contains(s) ? res : "Not found";
    }
}
