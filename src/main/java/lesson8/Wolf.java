package lesson8;

public class Wolf extends Animal implements WildAnimal {

    public Wolf(String name) {
        super(name);


        @Override
   void greets() {
            System.out.println("Wolf" + getName() + "says Hawooo");
        }

        @Override
        public void hunting() {
            System.out.println("Wolf goes hunting" + getName());
        }



    }
}