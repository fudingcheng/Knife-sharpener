package cn.itcast.stringbuffer;

/**
 * StringBuffer的优势
 */
public class Test2 {

    public static void main(String[] args) {
        // 需求:拼接100万次"abc"
//        String str = "";
//        for (int i = 0; i < 1000000; i++) {
//            str += "abc";
//        }
//        System.out.println(str);

        /**
         * sb拼接效率很高
         */
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }

}

