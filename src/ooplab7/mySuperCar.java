package ooplab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar s1 = new SuperCar();
        s1 = inputData (s1);
        System.out.println(s1.toString());

    }//main
    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your Student info: ");
        System.out.print("Car_brand: ");
        s.setCar_brand(scanner.nextLine());
        System.out.print("Car_color: ");
        s.setCar_color(scanner.nextLine());
        System.out.print("Car_engine_size: ");
        s.setCar_engine_size(scanner.nextLine());
        System.out.print("Max_speed: ");
        s.setMax_speed(scanner.nextLine());
        System.out.print("Country_of_origin: ");
        s.setCountry_of_origin(scanner.nextLine());
        return s;
    }
    }//class
