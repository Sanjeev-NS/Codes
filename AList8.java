import java.util.*;
class AList8{
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
        System.out.println("\nNormal for loop");
        for(int j=0;j<ai.size();j++){
            System.out.print(ai.get(j)*3+"  ");

        }
    }
}