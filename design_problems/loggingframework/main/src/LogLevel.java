public enum LogLevel {

    INFO(1), DEBUG(2), ERROR(3);


    private final int priority;

    LogLevel(int priority)
    {
        this.priority = priority;
    }


    public boolean isEnabled(LogLevel configured)
    {
        return this.priority>= configured.priority;
    }


}
