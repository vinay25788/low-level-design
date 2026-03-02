import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CommandExecuter {

    Deque<Command> history = new ArrayDeque<>();

    public void excuteCommand(Command command)
    {
        history.add(command);
        command.execute();
    }

    public void undoAllCommand()
    {
        if(!history.isEmpty())
        {
            Command command = history.pop();
            command.undo();
        }
    }
}
