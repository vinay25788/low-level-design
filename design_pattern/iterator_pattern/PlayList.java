import java.util.ArrayList;
import java.util.List;

public class PlayList implements IterableCollection<String>{

    private List<String> list = new ArrayList<>();
       private  int modCount =0;

       public void addSong(String song)
       {
           this.list.add(song);
           modCount++;
       }

       public String getSong(int ind)
       {
           return list.get(ind);
       }

       public int getModCount()
       {
           return this.modCount;
       }

    @Override
    public Iterator<String> createIterator() {
        return new PlayListIterator(this);
    }

    public int getSize()
    {
        return list.size();
    }
}
