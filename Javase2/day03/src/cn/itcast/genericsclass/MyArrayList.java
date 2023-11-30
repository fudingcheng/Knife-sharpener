package cn.itcast.genericsclass;

/**
 * 使用泛型,自定义一个ArrayList
 * @param <E>
 */
public class MyArrayList<E> {
    private Object[] arr = new Object[10];
    private int size;

    public boolean add(E e) {
        arr[size++] = e;
        return true;
    }

    public void get(int index) {
        E e = (E) arr[index];
    }
}
