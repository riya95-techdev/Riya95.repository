import java.net.SocketOption;

public class AppRunner {
    public static void main(String[]args){
        // testing
        Rectangle r=new Rectangle();
//        Rectangle r=new Rectangle("Gift","Gray",7,9); //practice of all argument constructor
//        Rectangle r=new Rectangle(9,6); //practice of required argument constructor
        System.out.println(r.toString());

        r.setName("Riya's box");
        r.setColor("Black");
        r.setLength(5.4);
        r.setWidth(8.8);
        System.out.print(r.toString());

        //testing of working methods
        double area=r.area();
        System.out.println("\nArea of rectangle : "+area);
        double perimeter = r.perimeter();
        System.out.println("Perimeter of the rectangle"+perimeter);

        if(r.isSquare()){
            System.out.println("this is blackberry mobile because length and width both are same.");
        }
        else{
            System.out.println("Your mobile phone is perfect rectangle,because length and width are not same.");
        }

        r.setWidth(5.4);
        System.out.println(r.toString());

        if(r.isSquare()){
            System.out.println("this is blackberry mobile because length and width both are same.");
        }
        else{
            System.out.println("Your mobile phone is perfect rectangle,because length and width are not same.");
        }


    }
}
