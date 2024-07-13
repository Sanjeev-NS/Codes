import java.util.*;
class AlphabetTriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println(); 
        }
    }
}
