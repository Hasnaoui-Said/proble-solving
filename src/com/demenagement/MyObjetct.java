package com.demenagement;

public class MyObjetct {
    private String name;

    public MyObjetct(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Obj-> " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExist(String s) {
        return this.getName().equals(s);
    }
}
