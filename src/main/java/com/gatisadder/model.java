
package com.gatisadder;

import com.gatisadder.*;

/*
Model class only knows about the count variable
no idea what it is used for at all
*/

public class model {

    private int count;
    final private int MAX = 100;
    final private int MIN = 0;

    public int addNumber() {
        if(count < MAX) {
            count++;
        } else {
            count = MIN;
        }
        return count;
    }

    public int minusNumber() {
        if(count > MIN) {
            count--;
        } else {
            count = MAX;
        }
        return count;
    }

    public int resetCounter(){
        count = MIN;
        return count;
    }

    public int initModel(int init) {
        if(init <= MAX && init >= MIN) {
            count = init;
        } else {
            count = MIN;
        }
        return count;
    }

    public model()
    {

    }
}
