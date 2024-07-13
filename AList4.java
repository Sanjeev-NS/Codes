import java.util.*;
class AList4{
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
        double i=63.8;
        System.out.println(ai.contains(i));
        
              
    }
}