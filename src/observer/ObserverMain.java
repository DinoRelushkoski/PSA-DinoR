package observer;

public class ObserverMain {

    public static void main(String[] args) {


        Task task = new Task();
        Observer obs1 = new ChristmasElf("Elf 01");
        Observer obs2 = new ChristmasElf("ELf 02");
        Observer obs3 = new ChristmasElf("Elf 03");

        task.add(obs1);
        task.add(obs2);
        task.add(obs3);

        task.setTask("Check the good kids!");
        task.remove(obs1);
        task.setTask("Help Santa and the other elves with packaging!");

    }
}
