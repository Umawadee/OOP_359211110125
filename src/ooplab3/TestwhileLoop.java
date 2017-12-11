package ooplab3;

public class TestwhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.print(i + "");
            i++;
        }//while
        System.out.println();
        int j = 1;
        do {
            if (j % 3 == 0 && j % 5 == 0)
                System.out.print(j + "");
        } while (++j <= 100);


    }//main
}//class
