package cn.itcast.stringbuffer;

/**
 * 使用StringBuffer拼接数组元素
 */
public class Test3 {


    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < intArr.length; i++) {
            if (i < intArr.length - 1) {
                sb.append(intArr[i] + ",");
            } else if (i == intArr.length - 1) {
                sb.append(intArr[i]);
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}
