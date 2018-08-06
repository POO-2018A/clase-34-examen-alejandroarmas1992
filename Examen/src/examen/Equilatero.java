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
public abstract class Equilatero implements Triangulo{
   double a;
  
  
   

    @Override
    public double CalcularArea() {
        
        return ((Math.sqrt(3)*a)/2)*Math.pow(a, 2) ;
    }

    @Override
    public double CalcularPerimetro() {
        return a+b+c;
    }

    @Override
    public double CalcularAltura() {
        return (Math.sqrt(3)*a)/2;
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

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Equilatero(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
   
}
