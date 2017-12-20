package ooplab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentData {
    public static void  A (){
        System.out.print("ชื่อ-สกุล");

    }
    public static void  B (){
        System.out.print("รหัส");

    }
    public static void  C (){
        System.out.print("สาขา");

    }
    public static void D (){
        System.out.print("ที่อยู่");

    }
    public static void E (){
        System.out.print("Email");

    }
    public static void main(String[] args)throws IOException  {
        A();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("");
        String name = reader.readLine();
        B();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("");
        String S = reader.readLine();
        C();
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("");
        String W = reader.readLine();
        D();
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("");
        String J = reader.readLine();
        E();
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("");
        String Q = reader.readLine();







    }


}
