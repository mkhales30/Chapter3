
public class Airplane implements Flight, Movement {
    private String model;
    private int year;
    public Airplane(String model, int year) {
        this.model = model;
        this.year = year;
    }
    @Override
    public void fly() {
        System.out.println("I rely on my engine to fly.");
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Airplane [model=" + model + ", year=" + year + "]";
    }
    @Override
    public void walk() {
        System.out.println("I tax on my wheels.");
    }
    @Override
    public void jump() {
        System.out.println("I cannot jump.");
    }
}
