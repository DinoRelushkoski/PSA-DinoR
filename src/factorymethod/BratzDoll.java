package factorymethod;

public class BratzDoll extends ToyProduct {

    @Override
    public void make() {
        System.out.println("Making Bratz doll");
    }
}
