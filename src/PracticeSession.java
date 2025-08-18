import java.util.List;
import java.util.ArrayList;
public class PracticeSession {
    public static void main(String [] args){
//        int userInput = 1;
//        switch(userInput){
//            case 1-> System.out.println("book adding in progress....");
//            case 2-> System.out.println("printing all books....");
//            case 3-> System.out.print("book is about to update....");
//            case 4-> System.out.print("book is about to deleted");
//            case 5-> System.out.print("thanks for using the program!");
//            default -> System.out.println("Invalid input ! try again");

        List<String> books = new ArrayList<>();
        books.add("the hbbit");
        books.add("punctuation");
        System.out.println(books);
        System.out.println(books.remove(0));
        System.out.println(books);
        System.out.println(books.size());
        System.out.println(books.contains("the hbbit"));
        System.out.println(books.isEmpty());
    }
}
