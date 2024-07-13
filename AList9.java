import java.util.*;
class AList9{
    public static void main(String args[]){
        List<Integer> ai = new ArrayList<Integer>();
        ai.add(33);
        ai.add(45);
        ai.add(57);
        ai.add(64);
        ai.add(73);
        ai.add(81);
        System.out.println("Normal print Statement");
        System.out.println(ai);
        Integer[] a=new Integer[ai.size()];
            a=ai.toArray(a);
        System.out.println("\nNormal for loop");
        for(int i:a){
            System.out.print(i+" ");

        }
    }
}