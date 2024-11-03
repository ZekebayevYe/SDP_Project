import java.util.ArrayList;
import java.util.List;

public class TaskViewModel {
    private static TaskViewModel instance;
    private List<TaskComponent> tasks;
    private List<Observer> observers;

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

    public void createTask(String type, String title, String description, boolean isCompleted) {
        TaskModel task = TaskFactory.createTask(type, title, description, isCompleted);
        tasks.add(task);
        notifyObservers("Task created: " + title);
    }

    public void getTasks() {
        for (TaskComponent task : tasks) {
            showTask(task);
        }
    }

    public void showTask(TaskComponent task) {
        System.out.println("Type: " + task.getType());
        System.out.println("Task: " + task.getTitle());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Status: " + task.isCompleted());
        System.out.println("-----------------------------------------------");
    }

    public TaskComponent getTask(int index) {
        if (tasks.isEmpty() || index >= tasks.size() || index < 0) return null;
        else return tasks.get(index);
    }

    public void updateTask(int index, TaskComponent updatedTask) {
        if (tasks.isEmpty() || index >= tasks.size() || index < 0) {
            System.out.println("Invalid index");
        } else {
            tasks.set(index, updatedTask);
            notifyObservers("Task updated: " + updatedTask.getTitle());
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
