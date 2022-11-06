package lesson6.work;


import lesson6.objects.Cat;



public class lesson6 {
    public static void main(String[] args){
      Cat cat=new Cat("Bagira","Grey");
      cat.say();
        cat.setName("Vasya");
        cat.setColor("Grey");


        System.out.println(cat.getName());
        System.out.println(cat.getColor());



    }
}
