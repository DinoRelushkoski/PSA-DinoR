package command;

public class BicyclesCommand implements Command{

    private ToyMagic toy;

    public BicyclesCommand(ToyMagic toy) {
        this.toy = toy;
    }

    @Override
    public void execute() {
        this.toy.saidINeedBicycles();
    }
}
