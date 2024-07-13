import java.util.*;
class AList1{
    public static void main(String args[]){
        List<String> car = new ArrayList<String>();
        car.add("BMW");
        car.add("PORSCHE");
        car.add("MUSTANG");
        System.out.println("Normal print Statement");
        System.out.println(car);
        System.out.println("Iterator method");
        Iterator i=car.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }        
        System.out.println("\nNormal for loop");
        for(int j=0;j<car.size();j++){
            System.out.println(car.get(j));

        }
    }
}