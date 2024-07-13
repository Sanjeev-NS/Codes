import java.util.*;
class Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
        {
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num : numbers) 
        {
            sum += num;
        }
        double average = (double) sum / size;
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
    }
}
