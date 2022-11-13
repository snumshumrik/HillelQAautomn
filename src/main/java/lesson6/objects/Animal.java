package lesson6.objects;

public class Animal {

   private String eats;
   private int noOflegs;
    boolean vegatarian;

    public Animal(String eats,int noOflegs, boolean vegatarian) {
        this.eats = eats;
        this.noOflegs = noOflegs;
        this.vegatarian=vegatarian;
        super(eats);
    }

    public void setName(String eats) {

        this.eats = eats;
    }

    public String getName() {

        return eats;
    }

    public  class Animal {

        private String eats;

        public void setName(String eats) {
            this.eats = eats;
        }

        public String getName(){
            return eats;

        }
    }
}
