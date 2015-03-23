package lab8se;


public class DecoratorTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Currency curr = new Pound();
        System.out.println(curr.getCurrencyDescription() +". "+curr.cost(2.0));
        
        curr = new Euro();
        System.out.println(curr.getCurrencyDescription() +". "+curr.cost(5.0));

//        curr = new USDDecorator(new Dollar());
//        System.out.println(curr.getCurrencyDescription() +". "+curr.cost(1.0));
//        
//        Currency curr2 = new AUSDecorator(new Dollar());
//        System.out.println(curr2.getCurrencyDescription() +". "+curr2.cost(1.0));
//        
//        curr2 = new NZDecorator(new Dollar());
//        System.out.println(curr2.getCurrencyDescription() +". "+curr2.cost(1.0));

    }
    
}

