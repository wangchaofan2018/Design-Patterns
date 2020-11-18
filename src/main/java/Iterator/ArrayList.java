package Iterator;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by wangchaofan on 2020/11/17.
 */
public class ArrayList<E> implements List<E>{
    private int size;
    transient Object[] array;
    private int realLength;

    public ArrayList() {
        realLength = 0;
        size = 16;
        array = new Object[size];
    }

    public void add(Object o) {
        if (realLength < size) {
            array[realLength] = o;
        } else {
            Object[] temp = new Object[size * 2];
            for (int i=0;i<size;i++) {
                temp[i] = array[i];
            }
            size = size * 2;
            temp[realLength] = o;
            array = temp;
        }
        realLength++;
    }

    public int size(){
        return realLength;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }

    public void remove(int location) {
        if (location < 0 || location >= size) {
            throw new NoSuchElementException();
        }
        for (int i=location;i<realLength-1;i++) {
            array[i] = array[i + 1];
        }
        realLength--;
        array[realLength] = null;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
