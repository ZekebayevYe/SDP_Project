import java.util.ArrayList;
import java.util.List;

public class TaskViewModel {
    public TaskModel task;
    private List<TaskModel> tasks;
    public TaskViewModel(){
        tasks = new ArrayList<>();
    }

    public void createTask(String title, String description, boolean isCompleted) {
        TaskModel task = new TaskModel(title);
        task.setDescription(description);
        task.setCompleted(isCompleted);
        tasks.add(task);
     }

     public void getTasks() {
        for (TaskModel task : tasks) {
            showTask(task);
        }
     }

     public void showTask(TaskModel task) {
         System.out.println(task.getTitle());
         System.out.println(task.getDescription());
         System.out.println(task.isCompleted());
    }

    public String getTitle() {
        return task.getTitle();
    }
    public String getDescription() {
        return task.getDescription();
    }
    public boolean isCompleted() {
        return task.isCompleted();
    }
    public void setTitle(String title) {
        task.setTitle(title);
    }
    public void setDescription(String description) {
        task.setDescription(description);
    }
    public void setCompleted(boolean completed) {
        task.setCompleted(!task.isCompleted());
    }
}
