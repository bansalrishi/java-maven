package hello;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        System.out.println("Hello World Primary!");
        /*int stuAge = 5;
        double stuGPA = 8.28;
        String stuName = "Manoj Kumar";
        char stuFirInitial = stuName.charAt(0);
        System.out.println(stuAge);
        System.out.println(stuGPA);
        System.out.println(stuName);
        System.out.println(stuFirInitial);
        System.out.println(stuName + " " + stuFirInitial + " has GPA : " + stuGPA);
        Scanner input = new Scanner(System.in);
        stuGPA = input.nextDouble();
        System.out.println(stuGPA);

        Rectangle oneR = new Rectangle(10, 15);
        double area = oneR.area();
        System.out.println("Printing Area of Rectangle");
        System.out.println(area);
         */

        StringBuffer strb = new StringBuffer("Welcome Home");
        System.out.println(strb);
        strb.insert(2, "Hello");
        System.out.println(strb);

    }
}
