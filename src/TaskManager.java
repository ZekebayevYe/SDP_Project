public class TaskManager {
    private static TaskView view;
    private static TaskManager instance;
    private TaskManager() {
        view = new TaskView(new TaskViewModel());
    }

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }
    public static void run() {
        view.run();
    }
}
