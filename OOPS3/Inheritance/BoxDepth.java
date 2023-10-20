package Inheritance;

public class BoxDepth extends Box{
    double depth;

    public BoxDepth() {
        this.depth = -1;
    }

    public BoxDepth(double l, double h, double w, double depth) {
        super(l, h, w); // This here calls the parent class constructor and used
        // to initialize values in parent class constructor
        this.depth = depth;
    }
}
