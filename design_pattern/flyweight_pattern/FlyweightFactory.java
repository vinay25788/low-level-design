import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    static Map<Character,CharacterFlyWeight> characterPool = new HashMap<>();

    public static CharacterFlyWeight getCharacter(Character ch)
    {
        if(! characterPool.containsKey(ch))
        {
            System.out.println("creatig new character "+ch);
            characterPool.put(ch, new ConcreteCharacter(ch));
        }
        return characterPool.get(ch);
    }
}
