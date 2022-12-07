package Lesson1;

public class Farther {
    private String name;

    public Farther(){

    }

    public Farther(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("bố chạy");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
