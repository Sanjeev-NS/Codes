import java.util.*;
class AdamNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isAdamNumber(number)) 
        {
            System.out.println(number + " is an Adam number.");
        } 
        else 
        {
            System.out.println(number + " is not an Adam number.");
        }
    }

    public static boolean isAdamNumber(int number) 
    {
        int reversedNumber = reverse(number);
        int squaredNumber = number * number;
        int squaredReversedNumber = reversedNumber * reversedNumber;

        return reverse(squaredNumber) == squaredReversedNumber;
    }
    public static int reverse(int num) 
    {
        int reversed = 0;
        while (num > 0) 
        {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}
