package Factory;

public interface TaskInterface {
    String getType();
    String getTitle();
    String getDescription();
    boolean isCompleted();
    void setCompleted(boolean isCompleted);
}
