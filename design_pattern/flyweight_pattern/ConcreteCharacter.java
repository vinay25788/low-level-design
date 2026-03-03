public class ConcreteCharacter implements CharacterFlyWeight{

    char symbol;

    ConcreteCharacter(char ch)
    {
        this.symbol = ch;
    }
    @Override
    public void display(int position) {
        System.out.println("character "+this.symbol +" position "+position );
    }
}
