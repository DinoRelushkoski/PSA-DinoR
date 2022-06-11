package observer;
import java.util.ArrayList;
import java.util.List;

public class Task implements Observable{

    private List<Observer> observers;
    private String task;

    public Task() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
        observer.setTask(this);
    }

    @Override
    public void remove (Observer observer) {
        this.observers.remove(observer);
        observer.setTask(null);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
        this.notifyObservers();
    }

}
