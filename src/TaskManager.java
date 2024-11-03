public class TaskManager {
    TaskView view = new TaskView(new TaskViewModel());
    private static TaskManager instance;
    private TaskManager() {

    }

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }
}
