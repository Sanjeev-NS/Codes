import java.util.*;
class AList{
    public static void main(String args[]){
        List<Integer> ai = new ArrayList<Integer>();
        ai.add(33);
        ai.add(45);
        ai.add(57);
        System.out.println("Normal print Statement");
        System.out.println(ai);
        System.out.println("Iterator method");
        Iterator i=ai.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println("Using for each loop");
        for(int a:ai){
            System.out.print(a+" ");
        }
        System.out.println("\nNormal for loop");
        for(int j=0;j<ai.size();j++){
            System.out.print(ai.get(j)+" ");

        }
    }
}