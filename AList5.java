import java.util.*;
import java.util.Arrays;
class AList5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        List<Double> ai = new ArrayList<Double>();
        ai.add(33.3);
        ai.add(45.9);
        ai.add(57.22);
        ai.add(63.8);
        ai.add(81.16);
        System.out.println("Original list:");
        System.out.println(ai);
        Collections.sort(ai);
        System.out.println("After sorting");
        System.out.println(ai);
        Collections.reverse(ai);
        System.out.println("After reverse");
        System.out.println(ai);

    }
}