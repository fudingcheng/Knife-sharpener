package cn.itcast.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 需求：解析xml文件，把user数据封装到集合中打印出来
 */
public class XmlDemo {
    public static void main(String[] args) throws Exception {
        // readXMlData();

        //1、创建StringBuffer对象
        StringBuffer stringBuffer = new StringBuffer();

        //2、使用StringBuffer对象封装数据
        stringBuffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
        stringBuffer.append("<users>");

        stringBuffer.append("<user id=\"1\">");
        stringBuffer.append("<name>张三</name>");
        stringBuffer.append("<password>123</password>");
        stringBuffer.append("<sex>男</sex>");
        stringBuffer.append("</user>");

        stringBuffer.append("</users>");

        //3、使用字符输出流将数据写入到磁盘中
        FileWriter writer = new FileWriter("day11/conf/helloworld.xml");
        writer.write(stringBuffer.toString());
        writer.close();

    }

    private static void readXMlData() throws DocumentException, FileNotFoundException {
        //1、创建Dom4j的解析器对象
        SAXReader saxReader = new SAXReader();

        //2、读取xml文件，获得Document
        Document document = saxReader.read(new FileReader("conf/helloworld.xml"));

        //3、通过Document获取根元素，rootElement
        Element rootElement = document.getRootElement();

        //4、通过rootElement获得子元素userElement
        List<Element> userElements = rootElement.elements();

        ArrayList<User> users = new ArrayList<>();
        for (Element userElement : userElements) {
            //5、通过userElement拿到对应数据标签，再获取标签中的内容,封装数据
            String name = userElement.element("name").getText();
            String password = userElement.element("password").getText();
            String sex = userElement.element("sex").getText();
            String data = userElement.element("data").getText();
            String data1 = userElement.element("data1").getText();
            String id = userElement.attributeValue("id");

            User user = new User();
            user.setName(name);
            user.setPassword(password);
            user.setSex(sex);
            user.setData(data);
            user.setData1(data1);
            user.setId(Integer.parseInt(id));

            users.add(user);
        }

        //6、打印
        System.out.println(users);
    }

    static class User{
        private Integer id;
        private String name;
        private String password;
        private String sex;
        private String data;
        private String data1;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getData1() {
            return data1;
        }

        public void setData1(String data1) {
            this.data1 = data1;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", password='" + password + '\'' +
                    ", sex='" + sex + '\'' +
                    ", data='" + data + '\'' +
                    ", data1='" + data1 + '\'' +
                    '}';
        }
    }
}
