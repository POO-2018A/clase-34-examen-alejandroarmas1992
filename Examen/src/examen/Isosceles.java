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
public abstract class Isosceles implements Triangulo {
    double a;
    double b;
   

    @Override
    public double CalcularArea() {
        return (b*Math.sqrt(Math.pow(a, 2)-(Math.pow(b, 2)/4)))/2;
    }

    @Override
    public double CalcularPerimetro() {
        return (2*a)+b;
    }

    @Override
    public double CalcularAltura() {
        return Math.sqrt(Math.pow(a, 2)-(Math.pow(b, 2)/4));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    

    public Isosceles(double a, double b) {
        this.a = a;
        this.b = b;
     
    }
    
}
