package cn.itcast.t9;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 主线程就只有1个线程在运行吗
 *  其实不是的,在JVM中,出了main线程外,还有其他更多的线程,比如垃圾收集器等
 */
public class MainThread {

    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println(threadInfo.getThreadId() + ":" + threadInfo.getThreadName());
        }
    }

}
