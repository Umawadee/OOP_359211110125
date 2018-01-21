package ooplab5;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        //ArrayList
        ArrayList List = new ArrayList();
        String name = "Tan";
        List.add(name);
        System.out.println(List);
        List.add("Toey");
        List.add("Tom");
        System.out.println(List);
        List.add(2, "ADAM");
        System.out.println(List);
        List.add(1);
        System.out.println(List);
        List.add(10.10);
        System.out.println(List);
        List.remove("Toey");
        System.out.println(List);
        List.remove(3);
        System.out.println(List);
        System.out.println(List.size());
        System.out.println(List.get(2));
        System.out.println(List.indexOf("ADAM"));
    }//main
}//class
