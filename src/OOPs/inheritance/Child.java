package OOPs.inheritance;

public class Child extends Parent {
    double weight;

    Child() {
        this.weight = -1;
    }

    Child(double l, double h, double w, double weight){
        super(l,h,w); // super = call the parent class constructor.

        this.weight = weight;
    }
}
