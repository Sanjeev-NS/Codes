import java.util.*;
class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        long factorial = calculate(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
    public static long calculate(int number) 
    {
        long result = 1;
        for (int i = 1; i <= number; i++) 
        {
            result *= i; 
        }
        return result;
    }
}
