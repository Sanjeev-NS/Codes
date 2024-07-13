import java.util.*;
class AList3{
    public static void main(String args[]){
        List<String> car = new ArrayList<String>();
        car.add("BMW");
        car.add("PORSCHE");
        car.add("MUSTANG");
        car.add("LAMBORGHINI");
        car.add("ROVER");
        System.out.println("Origianl");
        System.out.println(car);
        car.set(3,"FERRARI");
        System.out.println(" After Replace");        
        System.out.println(car);
        
    }
}