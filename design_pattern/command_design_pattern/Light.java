public class Light {

    int id;
    String name;

    Light(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public void lightOn()
    {
        System.out.println(" light on" + this.name);
    }

    public void lightOff()
    {
        System.out.println("light Off"+ this.name);
    }
}
