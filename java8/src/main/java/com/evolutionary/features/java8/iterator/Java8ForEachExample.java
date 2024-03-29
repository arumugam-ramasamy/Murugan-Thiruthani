package com.evolutionary.features.java8.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {
    public static void main(String[] args) {
        //creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);

        //traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value::"+i);
        }

        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Using anonymous functional interface " + integer);
            }
        });
        //traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }
}

class MyConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println("Printed through consumer " + integer);

    }
}
