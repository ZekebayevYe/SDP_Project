
public class TaskFacade {
    private TaskViewModel taskViewModel;

    public TaskFacade() {
        this.taskViewModel = TaskViewModel.getInstance();
    }

    public void createAndAddTask(String type, String title, String description, boolean isCompleted) {
        taskViewModel.createTask(type, title, description, isCompleted);
    }

    public void showAllTasks() {
        taskViewModel.getTasks();
    }

    public void setPriority(int taskIndex, String priority) {
        TaskComponent task = taskViewModel.getTask(taskIndex);
        TaskComponent priorityTask = new Priority(task, priority);
        taskViewModel.updateTask(taskIndex, priorityTask);
    }

    public void setReminder(int taskIndex, String reminderTime) {
        TaskComponent task = taskViewModel.getTask(taskIndex);
        TaskComponent reminderTask = new Reminder(task, reminderTime);
        taskViewModel.updateTask(taskIndex, reminderTask);
    }
}