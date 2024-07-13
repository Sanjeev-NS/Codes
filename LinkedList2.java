import java.util.*;
class LinkedList2
{
    public static void main(String[] args)
    {
        LinkedList<String> l1=new LinkedList<String>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        System.out.println(l1);

        LinkedList<String> l2=new LinkedList<String>();
        l2.add("D");
        l2.add("E");
        l2.add("F");
        l1.addAll(1,l2);
        System.out.println(l1);

        LinkedList<String> l3=new LinkedList<String>();
        l3.addAll(l1);
        l1.removeAll(l3);
        System.out.println(l1.isEmpty());
    }
}