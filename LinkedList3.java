import java.util.*;

class LinkedList3 {
    public static void main(String args[]) {
        List<String> l1 = new LinkedList<String>(0);
        l1.add("Gowtham");
        l1.add("NEC");
        l1.add("MCA");
        l1.add("Ooty");
        System.out.println("Original" + l1);
        System.out.print("The element in position of MCA is : " + l1.indexOf("MCA"));
    }
}