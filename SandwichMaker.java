
public class SandwichMaker {

    public static void main(String[] args){
        Hoagie cust1Hoagie = new ItalianHogie();
        cust1Hoagie.makeSandwich();

        System.out.println("-------------------------");
        Hoagie cust2Hoagie = new VegiHoagie();
        cust2Hoagie.makeSandwich();
    }
}
