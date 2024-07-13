import java.util.*;
class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number or string: ");
        String input = sc.nextLine();
        if (isPalindrome(input)) 
        {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String input) 
    {
        String cleanedInput = input.replaceAll("[\\W]", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversedInput);
    }
}
