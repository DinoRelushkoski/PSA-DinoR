package command;

public class CommandMain {

    public static void main(String[] args) {


        ToyMagic toy = new ToyMagic();
        Command dollsCommand = new DollsCommand(toy);
        Command bicyclesCommand = new BicyclesCommand(toy);

        RemoteController remote = new RemoteController();

        remote.setCommand(dollsCommand);
        remote.pressButton();

        remote.setCommand(bicyclesCommand);
        remote.pressButton();
    }

}
