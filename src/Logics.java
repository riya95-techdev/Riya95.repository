public class Logics{
    //A method that takes two integers and returns their sum
    public int add(int num1,int num2)
    {
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[]args)
    {
        Logics myCalculation = new Logics();
        int result = myCalculation.add(3,6); //Calling the method with arguments
        System.out.println("The sum is : "+ result); //Output: The sum is : 9
    }
}