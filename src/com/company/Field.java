package com.company;

public class Field {
    private String[] field = new String[9];

    public String getFieldElement(int element) {
        return field[element];
    }

    public void setFieldElement(int element, String string){
        field[element] = string;
    }

}
