package ooplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
     //StringTokenizer
        String msg = "Hello Welcome MT RMUTSV 2017";
        StringTokenizer myToken = new StringTokenizer(msg);
        //counToken
        System.out.println(myToken.countTokens());
        while (myToken.hasMoreTokens()){
            StringBuffer Buffer = new StringBuffer(myToken.nextToken());
            System.out.print(Buffer.reverse()+" ");
        }



    }//main
}//class
