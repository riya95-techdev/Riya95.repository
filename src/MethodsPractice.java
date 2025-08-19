import java.util.Scanner;

public class MethodsPractice {

    public static int addNumbers(int a, int b)
    {
        return a+b;
    }
    // A method that doesn't return anything
    public void sayHello()
    {
        System.out.println("Hello, Welcome to java methods.");
    }

    public static void main (String[]args){

        //We need to create an object of the class to call a non-static method
        MethodsPractice myGreeting = new MethodsPractice();
        myGreeting.sayHello(); //calling the method
    }
}
