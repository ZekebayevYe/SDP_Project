public class UpdateDescriptionCommand implements TaskCommand {
    private TaskComponent task;
    private String newDescription;
    private String oldDescription;

    public UpdateDescriptionCommand(TaskComponent task, String newDescription) {
        this.task = task;
        this.newDescription = newDescription;
        this.oldDescription = task.getDescription();
    }

    @Override
    public void execute() {
        task.setDescription(newDescription);
    }

    @Override
    public void undo() {
        task.setDescription(oldDescription);
    }
}
