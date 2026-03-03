package practise;

public class IteratorDemo {
    public static void main(String[] args) {
        PlayList playList = new PlayList();
        playList.addSong(" Punjabi hit ");
        playList.addSong(" Bollywood hit ");

        Iterator<String> iterator = playList.createIterator();

        while(iterator.hasNext())
        {
            System.out.println(" song "+ iterator.next());
        }
    }
}
