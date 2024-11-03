public class TaskModel {
    private String type;
    private String title;
    private String description;
    private boolean isCompleted;

    public TaskModel(String type, String title, String description, boolean isCompleted){
        this.type = type;
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
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

    public String getType() {
        return type;
    }
}
