public class TaskModel implements TaskComponent {
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

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isCompleted() {
        return isCompleted;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }

    public String getType() {
        return type;
    }
}

