package factorymethod;

public class DollsFactory extends ToyFactory {

    @Override
    public ToyProduct createProduct(String productName) {
        if(productName == "BARBIE_DOLL") {
            return new BarbieDoll();
        }
        if(productName == "BRATZ_DOLL") {
            return new BratzDoll();
        }
        if(productName == "PORCELAIN_DOLL") {
            return new PorcelainDoll();
        }
        System.out.println("Unknown type of doll");
        return null;
    }

}
