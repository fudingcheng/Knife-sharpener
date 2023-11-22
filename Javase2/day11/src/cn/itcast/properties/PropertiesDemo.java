package cn.itcast.properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * 需求：
 *  1、读取conf目录下的helloworld.properties配置文件内容，并把内容输出到控制台
 *  2、给配置文件中添加：zl=000
 */
public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        readProperties();

        System.out.println("---------------");

        writeProperties();

        readProperties();
    }

    private static void writeProperties() throws IOException {
        //1、创建Properties对象
        Properties properties = new Properties();

        //2、保存键值对
        properties.setProperty("zl","000");

        //3、保存数据到文件中
        properties.store(new FileWriter("conf/helloworld.properties",true),"zl");
    }

    private static void readProperties() throws IOException {
        //1、创建Properties对象
        Properties properties = new Properties();

        //2、将.properties文件加载到内存中
        properties.load(new FileReader("conf/helloworld.properties"));

        //3、获取所有键的集合keys
        Set<String> keys = properties.stringPropertyNames();

        //4、遍历properties读取数据
        properties.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });



        /*for (String key : keys) {
            System.out.println(key+"->"+properties.getProperty(key));
        }*/

        /*keys.forEach((key)->{
            System.out.println(key+"->"+properties.getProperty(key));
        });*/


    }
}
