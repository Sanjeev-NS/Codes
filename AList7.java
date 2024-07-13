import java.util.*;
import java.util.Arrays;
class AList7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        List<Double> ai = new ArrayList<Double>();
        List<Double> bi = new ArrayList<Double>();
        ai.add(33.3);
        ai.add(45.9);
        ai.add(57.22);
        ai.add(63.8);
        ai.add(81.16);
        System.out.println("Original list:");
        System.out.println(ai);
        
        System.out.println("After Checking ai");
        System.out.println(ai.isEmpty());
        
        System.out.println("After Checking bi");
        System.out.println(bi.isEmpty());

    }
}