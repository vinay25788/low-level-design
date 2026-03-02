public class LightOnCommand implements Command{

    Light light;

    LightOnCommand(Light light)
    {
        this.light  = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }

    @Override
    public void undo() {
        light.lightOff();
    }
}
