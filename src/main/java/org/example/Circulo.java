package org.example;

public class Circulo extends Elipse {
    private int radio;


    public Circulo(int radio) {
        super("3.14 * r * r");
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
