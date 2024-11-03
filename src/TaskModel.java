public class TaskModel extends Subject implements TaskComponent {
    private String title;
    private String description;
    private boolean isCompleted;
    private String type;

    public TaskModel(String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
        this.type = "Default";
    }

    public TaskModel(String type, String title, String description, boolean isCompleted) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyObservers("Title updated to: " + title);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        notifyObservers("Description updated to: " + description);
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
        notifyObservers("Task completion status updated.");
    }

    @Override
    public String toString() {
        return "TaskModel{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
