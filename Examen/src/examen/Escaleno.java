/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author ESFOT
 */
public abstract class Escaleno implements Triangulo {
    double a;
    double b;
    double c;
    double s=((a+b+c)/2);
    
    @Override
    public double CalcularArea() {
       return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double CalcularPerimetro() {
        return a+b+c;
    }

    @Override
    public double CalcularAltura() {
        return (2/a)*Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getS() {
        return s;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setS(double s) {
        this.s = s;
    }

    public Escaleno(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
}
