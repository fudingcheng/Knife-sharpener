package cn.itcast.t1;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    private int num;

    public MyCallable(int num) {
        this.num = num;
    }


    public Integer call() {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }
}
