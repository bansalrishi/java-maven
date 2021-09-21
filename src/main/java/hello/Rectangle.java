package hello;

public class Rectangle {
    double length;
    double breadth;
    Rectangle(double l, double b){
        this.length = l;
        this.breadth = b;
    }

    public double area(){
        return (this.length * this.breadth);
    }
}
