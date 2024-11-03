public interface TaskComponent {
    String getType();
    String getTitle();
    String getDescription();
    boolean isCompleted();
    void setTitle(String title);
    void setDescription(String description);
    void setCompleted(boolean completed);
}
