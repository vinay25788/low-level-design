public class FlyweightDemo {

    public static void main(String[] args) {
        String text = "HELLOLLKM";

        for(int i=0;i< text.length();i++)
        {
            CharacterFlyWeight ch = FlyweightFactory.getCharacter(text.charAt(i));

            ch.display(i);
        }
    }
}
