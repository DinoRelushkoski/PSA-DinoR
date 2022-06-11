package factorymethod;

public class PorcelainDoll extends ToyProduct {

    @Override
    public void make() {
        System.out.println("Making Porcelain doll");
    }
}
