
public class ItalianHogie extends Hoagie{

     String[] meatUsed = { "Salmon", "Chicken", "Ham"};
     String[] cheeseUsed = {"Marzarolla"};
     String[] vigeUsed = {"Lettuce", "Tomato", "Onion", "Peppers"};
     String[] condimentUsed= {"Oil", "Vinegar"};



    @Override
    void addMeat() {
     System.out.println("Adding meat");

     for (String meatconter: meatUsed){

       System.out.println(meatconter + " ");
     }
    }

    @Override
    void addCheese() {

        System.out.println("Adding cheese");

        for (String cheeseconter: cheeseUsed){

            System.out.println( cheeseconter + " ");
        }
    }

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

