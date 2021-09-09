import models.Lavadora;
import models.LavadoraFactoryIMP;

public class Main {

    public static void main(String[] args) {

        LavadoraFactoryIMP factory = new LavadoraFactoryIMP();

        Lavadora lavadora1 = factory.create("frontal");
        Lavadora lavadora2 = factory.create("");

        System.out.println(lavadora1.toString());
        System.out.println(lavadora2.toString());
    }
}
