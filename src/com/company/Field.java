package com.company;

public class Field {
    /*private int[] backendField = new int[9];


    public int getBackendFieldElement(int element){
        return backendField[element];
    }

    public void setBackendFieldElement(int element, int Integer){
        backendField[element] = Integer;
    }*/
    private String[] field = new String[9];

    public String getFieldElement(int element) {
        return field[element];
    }

    public void setFieldElement(int element, String string){
        field[element] = string;
    }

}
