package cn.itcast.n1;

import java.net.InetAddress;

/**
 * ip地址
 */
public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        //获得网络地址对象
        InetAddress inetAddress = InetAddress.getLocalHost();

        //获得ip地址
        String hostAddress = inetAddress.getHostAddress();
        System.out.println(hostAddress);

        //获得主机名
        String hostName = inetAddress.getHostName();
        System.out.println(hostName);

        //根据域名获得网络地址对象
        InetAddress inetAddress2 = InetAddress.getByName("www.itheima.com");

        //获得IP地址
        String hostAddress2 = inetAddress2.getHostAddress();
        System.out.println(hostAddress2);

        //获得域名
        String hostName2 = inetAddress2.getHostName();
        System.out.println(hostName2);


        boolean reachable = inetAddress2.isReachable(2000);
        System.out.println(reachable);

    }
}
