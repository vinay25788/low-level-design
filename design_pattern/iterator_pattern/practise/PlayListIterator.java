package practise;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class PlayListIterator implements Iterator<String>{


    private final PlayList playList;
    private final int expectedModCount;
    int index =0;

    PlayListIterator(PlayList list)
    {
        this.playList = list;
        this.expectedModCount = list.getModCount();
    }


    public void checkForConcurrent()
    {
        if(this.expectedModCount != playList.getModCount())
        {
            throw new ConcurrentModificationException(" list modified during iterator which is not allowed ");
        }
    }



    @Override
    public boolean hasNext() {
        checkForConcurrent();
        return index< playList.getSize();
    }

    @Override
    public String next() {

        checkForConcurrent();
        if(!hasNext())
        {
            throw new NoSuchElementException(" no song is present to play ");
        }
        return playList.getSong(index++);
    }
}
