package OOPS.Abstraction.Abstract.Abstract.Task;

import java.util.Scanner;

public abstract class Shape {
    Scanner sc = new Scanner(System.in);
    private double r;
     private double l;
    private double b;
    abstract double calculateArea();
     void setR(double r){
        this.r=r;
    }
     double getR(){
        return r;
    }
    public void setL(double l){
        this.l=l;
    }
    public double getL(){
        return l;
    }
    public void setB(double b){
        this.b =b;
    }
    public double getB(){
        return b;
    }


}
