
public class Bird implements Movement {
    String type;
    public Bird(String type) {
        this.type = type;
    }
    @Override
    public void fly() {
        System.out.println("I flap my wings to fly.");
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Bird [type=" + type + "]";
    }
    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }
    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }
}
