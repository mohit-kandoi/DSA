package OOPs.inheritance;

public class Parent {
    double l;
    double h;
    double w;


    Parent() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Parent(double l, double h){
        this.l = l;
        this.h = h;
    }

    Parent(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Parent(Parent other){
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;
    }

}
