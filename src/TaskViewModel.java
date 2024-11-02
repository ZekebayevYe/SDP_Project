public class TaskViewModel {
    public TaskModel task;
    public TaskViewModel(TaskModel task){
        this.task = task;
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
