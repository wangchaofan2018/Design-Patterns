package Iterator;

import java.util.NoSuchElementException;

/**
 * Created by wangchaofan on 2020/11/17.
 */
public class ArrayIterator<E> implements Iterator {
    private int cursor;
    private int lastRet = -1;
    private ArrayList arrayList;
    public ArrayIterator(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
        this.cursor = 0;
    }
    @Override
    public void remove() {
        if (lastRet != -1) {
            arrayList.remove(lastRet);
            cursor = lastRet;
            lastRet = -1;
        }
    }

    @Override
    public E next() {
        int i = cursor;
        if (i >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        Object e = arrayList.array[i];
        lastRet = cursor;
        cursor = i + 1;
        return (E) e;
    }



    @Override
    public boolean hasNext() {
        return cursor<arrayList.size();
    }
}
