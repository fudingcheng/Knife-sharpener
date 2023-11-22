package cn.itcast.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 需求：编写一个计算除法的方法，在计算前打印日志：开始计算X/Y；计算成功后打印结果result；程序出错的时候记录报错信息
 */
public class LogDemo {


    public static void main(String[] args) {

        String a = "abc";

        divide(10,0);
    }

    public static Double divide(int x, int y) {
        Logger logger = LoggerFactory.getLogger("LogDemo");
        try {
            logger.warn("这是warn。。。");
            logger.info("这是info。。。");
            logger.debug("这是debug。。。");
            double result = x / y;

            logger.info("执行成功：" + result);
            return result;
        } catch (Exception e) {

            logger.error("程序出错了：" + x + "/" + y);
            return null;
        }
    }

}
