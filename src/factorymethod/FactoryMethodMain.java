package factorymethod;

public class FactoryMethodMain {

    public static void main(String[] args) {

        ToyFactory dollsFactory = new DollsFactory();
        ToyProduct doll1 = dollsFactory.produceProduct("BARBIE_DOLL");
        ToyProduct doll2 = dollsFactory.produceProduct("BRATZ_DOLL");
        ToyProduct doll3 = dollsFactory.produceProduct("PORCELAIN_DOLL");



        ToyFactory bicyclesFactory = new BicyclesFactory();
        ToyProduct bicycle1 = bicyclesFactory.produceProduct("A_BICYCLE");
        ToyProduct bicycle2 = bicyclesFactory.produceProduct("B_BICYCLE");
        ToyProduct bicycle3 = bicyclesFactory.produceProduct("C_BICYCLE");

    }

}
