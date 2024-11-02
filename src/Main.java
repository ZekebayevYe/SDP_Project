public class Main {
    public static void main(String[] args){
        TaskModel task = new TaskModel("some task");
        TaskViewModel viewModel = new TaskViewModel(task);
        TaskView view = new TaskView(viewModel);

        view.showTask();
    }
}