import Facade.TaskFacade;
import MVVM.TaskView;

public class Main {
    public static void main(String[] args) {
        TaskView view = new TaskView(new TaskFacade());
        view.run();

    }
}