package cn.itcast.t1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ThreadTest3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        //1、 创建MyCallable对象
        MyCallable myCallable = new MyCallable(100);

        //2、把MyCallable封装到FutrueTask类
        FutureTask<Integer> futureTask = new FutureTask<Integer>(myCallable);

        //3、把任务对象交给线程Thread
        Thread thread = new Thread(futureTask);

        // Integer result = futureTask.get(2, TimeUnit.SECONDS);

        Integer result = futureTask.get();

        //4、启动线程
        thread.start();

        //5. 通过futureTask获取任务对象的返回值
        // int result = futureTask.get();

        System.out.println("子线程执行的结果是：" + result);


    }

}
