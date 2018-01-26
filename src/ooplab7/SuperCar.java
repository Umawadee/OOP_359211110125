package ooplab7;
//จงสร้าง class ชื่อ SuperCar เพื่อเป็นตัวแทนของ hero โดยที่ super car จะต้องประกอบไปด้วยข้อมูลที่
//เป็น Instance variable ของ super car คือ car brand , car color, car engine size, max speed และ
//country of origin และ SuperCar Class จะต้องมี constructor เพื่อใช้ส าหรับการกำหนดค่าเริ่มต้นให้กับ 5
//ตัวแปรดังกล่าว และมี mutator method (get and set method) สำหรับแต่ละตัวแปร อีกอย่างหนึ่ง
//SuperCar Class จะมี method ชื่อ getSuperCarInfo() เพื่อแสดงข้อมูลของรถแต่ละคัน

//11.2 จากข้อที่ 11.1 จึงสร้าง application ชื่อ mySuperCar เพื่อท าการรับข้อมูลรถ 10 คัน จากผู้ใช้ โดยน า
//ข้อมูลของ Object มาเก็บไว้ใน array และแสดงผลข้อมูลของรถทั้ง 10 คัน ทางจอภาพ

public class SuperCar {
    private String car_brand;
    private String car_color;
    private String car_engine_size;
    private String max_speed;
    private String country_of_origin;


    public SuperCar (){}
    public SuperCar(String car_brand, String car_color, String car_engine_size, String max_speed,String country ) {

        this.car_brand = car_brand;
        this.car_color = car_color;
        this.car_engine_size = car_engine_size;
        this.max_speed = max_speed;
        this.country_of_origin = country;

    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "car_brand='" + car_brand + '\'' +
                ", car_color='" + car_color + '\'' +
                ", car_engine_size='" + car_engine_size + '\'' +
                ", max_speed='" + max_speed + '\'' +
                ", country_of_origin='" + country_of_origin + '\'' +
                '}';

    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public String getCar_engine_size() {
        return car_engine_size;
    }

    public void setCar_engine_size(String car_engine_size) {
        this.car_engine_size = car_engine_size;
    }

    public String getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(String max_speed) {
        this.max_speed = max_speed;
    }

    public String getCountry_of_origin() {
        return country_of_origin;
    }

    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }
}


