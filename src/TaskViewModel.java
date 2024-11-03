import java.util.ArrayList;
import java.util.List;

public class TaskViewModel {
    private static TaskViewModel instance;
    private List<TaskComponent> tasks;

    private TaskViewModel() {
        tasks = new ArrayList<>();
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
        return tasks.get(index);
    }

    public void updateTask(int index, TaskComponent updatedTask) {
        tasks.set(index, updatedTask);
    }
}
