package lesson5;

public class Passport;

 private String name;
 private String family;
 private int age;
 private boolean human=true;


    public Passport(String name, String family, int age, boolean human) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.human = human;
    }

    public String getName(){
        return name;
        }

    public String getfamily(){
        return family;
}
    public int getAge(){
        return age;
        }

    public boolean  isHuman(){
        return human;
        }

        public void print(){
        System.out.println(name);
        System.out.println(family);
        System.out.println(age);
        System.out.println("Human-" +human);
        }