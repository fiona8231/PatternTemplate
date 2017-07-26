
public abstract class Hoagie {

    final void makeSandwich(){

        cutBun();

        if(customerWantMeat()){

            addMeat();

        }

        if(customerWantCheese()){

            addCheese();
        }

        if(customerWantVegi()){

            addVegitable();
        }

        if(customerWantCondiments()){

            addCondiments();
        }

        wrapTheHoagie();
    }

    public void cutBun(){
        System.out.println("The Hoagie is Cut");
    }

   // These methods must be overridden by the extending subclasses

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegitable();
    abstract void addCondiments();


    // These are called hooks

    // If the user wants to override these they can
    // Use abstract methods when you want to force the user
    // to override and use a hook when you want it to be optional

    boolean customerWantMeat(){ return true; }
    boolean customerWantCheese(){ return true; }
    boolean customerWantVegi(){return  true;}
    boolean customerWantCondiments(){return  true;}



    public void wrapTheHoagie(){
        System.out.println("Wrap the Hoagie");
    }
}
