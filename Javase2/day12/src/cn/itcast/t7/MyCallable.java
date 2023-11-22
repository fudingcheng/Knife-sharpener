package cn.itcast.t7;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    private int num;

    public MyCallable(int num) {
        this.num = num;
    }

    @Override
    public String call() throws Exception {
        Integer result = null;
        for (int i = 0; i < num; i++) {
            result +=i;
        }
        return Thread.currentThread().getName()+":执行了1-"+num+"的结果"+result;
    }
}
