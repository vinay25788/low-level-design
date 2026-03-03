package practise;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements IterableCollection<String>{


    List<String> list = new ArrayList<>();
    private  int modCount =0;

    public void addSong(String song)
    {
        list.add(song);
        modCount++;
    }

    public int getModCount()
    {
        return this.modCount;

    }

    public String getSong(int ind)
    {
        return this.list.get(ind);
    }

    public int getSize()
    {
        return this.list.size();
    }

    @Override
    public Iterator<String> createIterator() {
        return new PlayListIterator(this);
    }
}
