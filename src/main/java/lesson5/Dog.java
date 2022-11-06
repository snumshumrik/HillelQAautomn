package lesson5;

public class Dog {

    private String name;
    private String color;
    private int age;
    private int height;


    public Dog(String name, String color, int age, int height) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.height =  height;
    }


    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Dog() {
        System.out.println("Creating object of the class Dog.");
    }

    public String getName() {
        return name;
    }

    public String getfamily() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void print() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(age);
        System.out.println(height);
    }
}