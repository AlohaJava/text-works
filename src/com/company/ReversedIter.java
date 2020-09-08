package com.company;
import java.util.*;

public class ReversedIter<T> implements Iterable<T> {
    private List<T> dataList;
    public ReversedIter(List<T> list){
        this.dataList = list;
    }
    @Override
    public Iterator<T> iterator() {
        final ListIterator<T> iterator = dataList.listIterator(dataList.size());
        return new Iterator<T>(){
            @Override
            public T next(){
                return iterator.previous();
            }
            @Override
            public boolean hasNext(){
                return iterator.hasPrevious();
            }
        };
    }
}