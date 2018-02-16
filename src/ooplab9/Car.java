package ooplab9;

public class Car {
    private String beand;
    private String color;
    private Engine engine;//her-a relation

    public String getBeand() {
        return beand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "beand='" + beand + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public void setBeand(String beand) {
        this.beand = beand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String beand, String color, Engine engine) {
        this.beand = beand;
        this.color = color;
        this.engine = engine;
    }
}//class
