
public class VegiHoagie extends Hoagie {

    String[] vigeUsed = {"Lettuce", "Tomato", "Onion", "Peppers"};
    String[] condimentUsed= {"Oil", "Vinegar"};

    boolean customerWantMeat(){ return false; }
    boolean customerWantCheese(){ return false; }

    @Override
    void addMeat() { }


    @Override
    void addCheese() { }

    @Override
    void addVegitable() {
        System.out.println("Adding vegitable");

        for (String vigeconter: vigeUsed){

            System.out.println( vigeconter + " ");
        }
    }

    @Override
    void addCondiments() {

        System.out.println("Adding condiments");

        for (String condementsconter: condimentUsed){

            System.out.println( condementsconter + " ");
        }

    }


}
