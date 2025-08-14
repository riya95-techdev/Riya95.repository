
import java.net.SocketOption;
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

//        //4. wap to Reverse a string : " hello" ---> " olleh"
//        System.out.print("please enter any string to print it's reverse : ");
//        String stringByUser=riya.nextLine();
//        String reversed= "";
//        int index=stringByUser.length ()- 1;
//
//        while(index>=0){
//            reversed=reversed + stringByUser.charAt(index);
//            index--;
//        }
//        System.out.print("Reversed string : "+ reversed);


//        //5. wap to print number traingle
//        int number,i=1;
//        System.out.print("number traingle banane ke liye ek number enter kijiye : ");
//        number = riya.nextInt();
//
//        while(i<=number){
//            int j=1;
//            while(j<=i){
//                System.out.print(j+" ");
//                j++;
//            }
//            System.out.println("");
//            i++;
//        }

//        //6. wap to print Sum of squares till N
//
//        int number,sum=0;
//        System.out.print("kaha tak squares ka sum print karna hai please ek number se specify karo : ");
//        number = riya.nextInt();
//        int i=1,square;
//        while(i<=number){
//            square=i*i;
//            sum = sum+square;
//            if(i<number)
//                System.out.print(square+"+");
//            else
//                System.out.print(square);
//            i++;
//        }
//        System.out.print("\nSum : "+sum);

//        //7. wap to  Print digits of number separately
//        //Explanation: Extract with %10, print in reverse.
//        //Input: 123
//        //Output: 3 2 1
//        int number;
//        System.out.print("number batayiye jiske digits ko saparate karna h : ");
//        number= riya.nextInt();
//        while(number !=0){
//            System.out.print(number%10+" ");
//            number=number/10;
//        }

//        //8. wap to Find LCM of two numbers
//        //Explanation: LCM = (a×b)/GCD
//        System.out.print("please enter two numbers to find their LCM : ");
//        int a,b,min,i,gcd=0,lcm=0;
//        a= riya.nextInt();
//        b= riya.nextInt();
//
//        if(a<b)
//            min=a;
//        else
//            min=b;
//        i=1;
//        while(i<=min){
//            if( a%i == 0 && b%i == 0)       // condition to find greatest common divisor of two numbers
//                gcd = i;
//            i++;
//        }
//        lcm= ((a*b)/gcd);   //lcm of above two numbers
//        System.out.print("LCM : "+lcm);
    }
}