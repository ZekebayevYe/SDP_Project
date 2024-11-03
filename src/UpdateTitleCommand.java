public class UpdateTitleCommand implements TaskCommand {
    private TaskComponent task;
    private String newTitle;
    private String oldTitle;

    public UpdateTitleCommand(TaskComponent task, String newTitle) {
        this.task = task;
        this.newTitle = newTitle;
        this.oldTitle = task.getTitle();
    }

    @Override
    public void execute() {
        task.setTitle(newTitle);
    }

    @Override
    public void undo() {
        task.setTitle(oldTitle);
    }
}
