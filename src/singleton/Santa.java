package singleton;

public class Santa {

    private static Santa instance;

    private Santa() {
        // TODO Auto-generated constructor stub
    }

    public static Santa getInstance() {

        if(instance == null) {
            instance = new Santa();
        }

        return instance;
    }

    public void postMessage(String message) {
        System.out.println("Posting a message" + message);
    }

}
