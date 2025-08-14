import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagementProject {
    public static void main(String[] args) {
        Scanner riya = new Scanner(System.in);
        List<String> books = new ArrayList<>();

        String message = """
                Enter 1 to add book
                Enter 2 to see books 
                Enter 3 to update details of the book
                Enter 4 to delete books 
                Enter 5 to exit :
                """;
        int userInput;
        do{
            System.out.print(message);
            userInput = riya.nextInt();

            switch (userInput){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.Println("Thanks for using this program!");
                    break;
                default:
                    System.out.Println("Invalid input ! please tru again.");
                    break;

            }

        }while(userInput !=5);
    }
}
