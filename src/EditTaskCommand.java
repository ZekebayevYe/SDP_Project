public class EditTaskCommand implements Command {
    private TaskModel task;
    private String newTitle;
    private String newDescription;

    public EditTaskCommand(TaskModel task, String newTitle, String newDescription) {
        this.task = task;
        this.newTitle = newTitle;
        this.newDescription = newDescription;
    }

    @Override
    public void execute() {
        task.setTitle(newTitle);
        task.setDescription(newDescription);
    }
}
