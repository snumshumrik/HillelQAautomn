package lesson6.objects;

public class dog extends Animal {
    private boolean agry;
    public dog(String name){
        super(name);
    }

    public dog(String name, boolean agry) {
        super(name);
        this.agry = agry;
    }

    public  dog(){
        this("Kasper");

    }
    public void say(){
        System.out.println("dog"+getName()+"gav");
    }
}
