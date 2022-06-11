package factorymethod;

public class BicyclesFactory extends ToyFactory {

    @Override
    public ToyProduct createProduct(String productName) {
        if(productName == "M_BICYCLE") {
            return new MBicycle();
        }
        if(productName == "K_BICYCLE") {
            return new KBicycle();
        }
        if(productName == "C_BICYCLE") {
            return new CBicycle();
        }
        System.out.println("Unknown type of bicycle");
        return null;
    }
}
