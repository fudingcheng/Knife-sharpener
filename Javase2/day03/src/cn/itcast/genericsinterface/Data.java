package cn.itcast.genericsinterface;

import java.util.ArrayList;

/**
 * 泛型接口
 */
public interface Data<E> {

    void add(E e);

    ArrayList<E> getByName(String name);
}
