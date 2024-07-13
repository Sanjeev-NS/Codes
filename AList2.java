import java.util.*;
class AList2{
    public static void main(String args[]){
        List<Integer> ai = new ArrayList<Integer>();
        ai.add(33);
        ai.add(45);
        ai.add(57);
        System.out.println("Original List");
        System.out.println(ai);
        ai.remove(2);
        System.out.println("After Remove");
        System.out.println(ai);
       
    }
}