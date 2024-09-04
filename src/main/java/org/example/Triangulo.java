package org.example;

public class Triangulo extends Poligono {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        super("(base * altura) / 2");  // Fórmula del área del triángulo
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
