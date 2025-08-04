
import java.util.Scanner;
public class JavaPracticeWithWhileLoop {
    public static void main(String[]args){
        Scanner riya= new Scanner(System.in);
//         1.wap to print numbers from 1 to 5, output : 1 2 3 4 5

//        int count;
//        count=1;
//        while(count<6){
//            System.out.print(count +" ");
//            count++;

//        2.wap to print from 10 to 1,with output: 10 9 8 7 6 5 4 3 2 1
//        int counter; //declaration of variable
//        counter=10; //initialization of variable with value
//        while(counter>=1){
//            System.out.print(counter + " ");
//            counter--;
//        }

//        3.wap to print first N natural number, where N will be given by user

//        System.out.print("batayiye natural numbers kaha tak print karne hai : ");
//        int number=riya.nextInt(); //refrence ke through input lene ke liye
//        int i= 1; // initialization with 1 ,because first natural numbers print karne hai
//
//        System.out.print("First "+ number +" natural numbers: ");
//        while(i<(number+1)){
//            System.out.print(i+" ");
//            i++;
//        }

//        //3.wap to print common divisiors of two numbers
//
//        int number1,number2;
//        int max,i;
//        System.out.print("2 numbers ke common divisors btane ke liye \nplease enter first number :");
//        number1=riya.nextInt();
//        System.out.print("please enter second number :");
//        number2=riya.nextInt();
//
//        if(number1>number2)
//            max= number1;
//        else
//            max=number2;
//
//        i=1;
//        while(i<=max){
//            if(number1%i == 0 && number2%i == 0)
//                System.out.print(i+" ");
//            i++;
//        }

        //wap to Reverse a string : " hello" ---> " olleh"
        System.out.print("please enter any string to print it's reverse : ");
        String stringByUser=riya.nextLine();
        String reversed= "";
        int index=stringByUser.length ()- 1;

        while(index>=0){
            reversed=reversed + stringByUser.charAt(index);
            index--;
        }
        System.out.print("Reversed string : "+ reversed);
    }
}