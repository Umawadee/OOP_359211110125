package ooplab9;

public class percon {
    private String name;
    private int ang;
    private Address Address;
    private Job Job;

    public percon(String name, int ang, ooplab9.Address address, ooplab9.Job job) {
        this.name = name;
        this.ang = ang;
        Address = address;
        Job = job;
    }

    @Override
    public String toString() {
        return "percon{" +
                "name='" + name + '\'' +
                ", ang=" + ang +
                ", Address=" + Address +
                ", Job=" + Job +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAng() {
        return ang;
    }

    public void setAng(int ang) {
        this.ang = ang;
    }

    public ooplab9.Address getAddress() {
        return Address;
    }

    public void setAddress(ooplab9.Address address) {
        Address = address;
    }

    public ooplab9.Job getJob() {
        return Job;
    }

    public void setJob(ooplab9.Job job) {
        Job = job;
    }
}
