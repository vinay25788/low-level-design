import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class PlayListIterator implements Iterator<String> {

    private final PlayList list;
    int index =0;
    private final int expectedModCount;

    PlayListIterator(PlayList list)
    {
        this.list = list;
        this.expectedModCount = list.getModCount();
    }

    private void checkForModification()
    {
        if(this.expectedModCount != list.getModCount())
        {
            throw new ConcurrentModificationException(" lsit chagned ");

        }
    }

    public boolean hasNext()
    {
        checkForModification();
        return index< list.getSize();
    }

    @Override
    public String next() {
        checkForModification();
        if(!hasNext())
        {
           throw new NoSuchElementException(" no more song");
        }
        return list.getSong(index++);
    }


}
