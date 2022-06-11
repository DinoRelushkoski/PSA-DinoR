package command;

public class DollsCommand implements Command{

    private ToyMagic toy;

    public DollsCommand(ToyMagic toy) {
        this.toy = toy;
    }

    @Override
    public void execute() {
        this.toy.saidINeedDolls();
    }
}
