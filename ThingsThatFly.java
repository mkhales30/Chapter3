import java.util.ArrayList;

public class ThingsThatFly {
    public static void main(String[] args) {
        // single arrraylist to store all objects
        ArrayList<Flight> thingsThatFly = new ArrayList<Flight>();
        thingsThatFly.add(new Airplane("Boeing 747",2016));
        thingsThatFly.add(new Bird("Eagle"));
        thingsThatFly.add(new Bird("Hummingbird"));
        // loop to print the given output
        for(Flight f: thingsThatFly)
            f.fly();
    }
}

{
    void fly();
}

class Airplane implements Flight
{
    String model;
    int year;

    public void fly()
    {
        System.out.println(this.toString() + ": I'm an airplane that relies on an engine to fly.");
    }

    public Airplane(String model, int year)
    {
        this.model = model;
        this.year = year;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public String getModel()
    {
        return this.model;
    }
    public int getYear()
    {
        return this.year;
    }

    public String toString()
    {
        return "Airplane [model=" + this.model + ", year=" + this.year + "]";
    }

}

class Bird implements Flight
{
    String type;

    public void fly()
    {
        System.out.println(this.toString() + ": I'm a bird who flaps my wings to fly.");
    }

    public Bird(String type)
    {
        this.type = type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return this.type;
    }
    public String toString()
    {
        return "Bird [type=" + this.type + "]";
    }
}
