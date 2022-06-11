package factorymethod;

public class BarbieDoll extends ToyProduct{

    @Override
    public void make() {
        System.out.println("Making Barbie doll");
    }
}
