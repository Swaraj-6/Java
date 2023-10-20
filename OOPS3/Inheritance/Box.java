package Inheritance;

public class Box {
    double l, w, h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box obj){
        this.l = obj.l;
        this.w = obj.w;
        this.h = obj.h;
    }

    public void information(){
        System.out.println("Inside the box.");
    }

}
