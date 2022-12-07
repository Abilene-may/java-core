package Lesson1;
import Farther;


public class Child extends Farther{
    private String name;

    public Child(){

    }

    public Child(String name) {
        this.name = name;
    }

    public Child(String name, String name2) {
        super(name);
        name = name2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("con chạy");
    }

    @Override
    public String toString() {
       return super.toString() + " - " + this.getName();
    }
}
