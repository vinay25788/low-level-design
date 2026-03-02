public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light(1,"room1");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        CommandExecuter commandExecuter = new CommandExecuter();

        commandExecuter.excuteCommand(lightOnCommand);
        commandExecuter.excuteCommand(lightOffCommand);

        commandExecuter.undoAllCommand();
        commandExecuter.undoAllCommand();
    }
}
