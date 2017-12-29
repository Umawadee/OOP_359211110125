package ooplab6;

public class StringCompare {
    public static void main(String[] args) {
   String str1 ="Hello";
   String str2 ="Hellooo";
        //Compare String
        //type 1(==)
        if (str1 == str2)System.out.println("true");
        else System.out.println(false);
        //type 2 (equals () method)
        if (str1.equals(str2))System.out.println("true");
        else System.out.println("false");
        //type 3 (CompareTo () method)
        //0 = String is equal.
        //ค่าที่ได้เป็นลบ = Left String is less than Right String
        //ค่าที่ได้เป็นบวก = Right String is less than Left String
        if (str1.compareTo(str2)==0)
            System.out.println("true");
        else if (str1.compareTo(str2)>=1)
            System.out.println("str1 is more than str2");
        else
            System.out.println("str1 is less than str2");




    }//main
}//class
