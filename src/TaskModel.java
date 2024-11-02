public class TaskModel {
    public String title;
    public String description;
    public boolean isCompleted;

    public TaskModel(String title){
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

}
