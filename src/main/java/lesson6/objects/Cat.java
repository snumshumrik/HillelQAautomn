package lesson6.objects;

public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name);
        this.color = color;    }


    String color;

    public String getColor() {
        return color;
    }

    public Cat(String name) {

        super(name);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say(){
            System.out.println("Cat"+getName()+"myau");
        }
    }

