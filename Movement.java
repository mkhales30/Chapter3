
public interface Movement extends Flight {
    public void walk();
    public void jump();
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
