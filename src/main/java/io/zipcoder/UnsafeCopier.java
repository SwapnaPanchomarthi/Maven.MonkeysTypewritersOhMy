package io.zipcoder;

import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {
 //   private ReentrantLock lock;

    public UnsafeCopier(String toCopy) {
        super(toCopy);
       // this.lock=lock;
    }

    public void run() {
        //Iterator<String> iterator = stringIterator;


        while(stringIterator.hasNext())
        {
            copied+=stringIterator.next() +' ';
        }

    }

}
