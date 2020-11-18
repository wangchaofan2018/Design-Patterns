package Iterator;

/**
 * Created by wangchaofan on 2020/11/17.
 */
public interface Iterator<E> {
    void remove();

    E next();

    boolean hasNext();
}
