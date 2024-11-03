import java.util.ArrayList;
import java.util.List;

public class TaskViewModel {
    private static TaskViewModel instance;
    private List<TaskComponent> tasks;
    private List<TaskObserver> observers;

    private TaskViewModel() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static TaskViewModel getInstance() {
        if (instance == null) {
            instance = new TaskViewModel();
        }
        return instance;
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(TaskComponent task) {
        for (TaskObserver observer : observers) {
            observer.onTaskUpdated(task);
        }
    }

    public void createTask(String type, String title, String description, boolean isCompleted) {
        TaskModel task = TaskFactory.createTask(type, title, description, isCompleted);
        tasks.add(task);
        notifyObservers(task);
    }

    public void updateTask(int index, TaskComponent updatedTask) {
        if (tasks.isEmpty() || index >= tasks.size() || index < 0) {
            System.out.println("invalid index");
        } else {
            tasks.set(index, updatedTask);
            notifyObservers(updatedTask);
        }
    }
}
