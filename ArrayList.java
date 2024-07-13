import java.util.*;
class AList{
    public static void main(String args[]){
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(33);
        ai.add(33);
        ai.add(33);
        System.out.println("Normal print Statement");
        System.out.println(ai);
        System.out.println("Iterator method");
        Iterator i=ai.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}