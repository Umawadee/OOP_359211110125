package ooplab8;

public class AppPerson {
    public static void main(String[] args) {
        Student student = new Student("1111111111111",
                "Boy Saiyai",
                "109 M.2 Thyngsong",
                "Maie",
                "Information System");
        System.out.println(student.toString());
        student.setName("Boy Saiyong");
        System.out.println(student.getName());
        System.out.println(student.toString());





    }//main
}//class
