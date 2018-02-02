package ooplab8;
//Dog is a Pet
//Dog is sub Class
//Dog is
public class Dog extends Pet{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }

}//Class
