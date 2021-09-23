package hello;

public class Animal {
    void whichVariety(){System.out.println("Generic Animal");}
}

class Cat extends Animal{
    @Override
    void whichVariety(){System.out.println("Cat says Meow");}
}

class TestAnnotation{
    public static void main(String args[]){
        Animal a=new Cat();
        a.whichVariety();
    }}