public class TaskView {
    TaskViewModel viewModel;
    public TaskView(TaskViewModel viewModel){
        this.viewModel = viewModel;
    }

    public void showTask(){
        System.out.println("task: "+ viewModel.getTitle());
        System.out.println("description: "+ viewModel.getDescription());
        System.out.println("status: "+(viewModel.isCompleted() ? "completed" : "not completed"));
    }
}
