public class TaskView implements TaskObserver {
    private TaskFacade taskFacade;

    public TaskView(TaskFacade taskFacade) {
        this.taskFacade = taskFacade;
        TaskViewModel.getInstance().addObserver(this); // Подписываемся на изменения
    }

    @Override
    public void onTaskUpdated(TaskComponent task) {
        System.out.println("Updated Task:");
        showTask(task);
    }

    public void menu() {
        System.out.println("1. New Task");
        System.out.println("2. Show Tasks");
        System.out.println("3. Set Priority for a Task");
        System.out.println("4. Set Reminder for a Task");
        System.out.println("5. Exit");
    }

    public void run() {
    }

    public void showTask(TaskComponent task) {
        System.out.println("Type: " + task.getType());
        System.out.println("Task: " + task.getTitle());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Status: " + (task.isCompleted() ? "Completed" : "Not Completed"));
        System.out.println("-----------------------------------------------");
    }
}
