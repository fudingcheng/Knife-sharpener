package cn.itcast.method.parameter;

/**
 * 引用类型数据的传递：比较2个数组是否一样（比较2个数组中存放的数据是否一样）
 */
public class MethodParameterDemo4 {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,50,40};
        int[] arr2 = {10,20,30,40,50};
        boolean rs = compareArray(arr1, arr2);
        System.out.println(rs);
    }


    /**
     * 比较2个int类型数组是否一样（比较2个数组中存放的数据是否一样）
     * 设计：
     * 1、需不需参数；需要，参数类型是int[]数组；参数个数是2个
     * 2、需不需要返回值；需要；一样的话就返回：true；不一样的话就返回：false
     * {10,20,30,40,50,60}
     * {10,20,30}
     */
    public static boolean compareArray(int[] arr1, int[] arr2) {
        //1、判断如果2个数组都为空，返回true
        if (arr1 == null && arr2 == null) {
            return true;
        }

        //2、如果1个为空，另一个不为空，返回false
        if (arr1 == null || arr2 == null) {
            return false;
        }

        //3、比较数组长度，长度如果不想等，返回false
        if (arr1.length != arr2.length) {
            return false;
        }

        // 如果程序可以执行到这一步，那么说明arr1和arr2 都不为空，且长度相等
        // 4、开始依次比较值
        for (int i = 0; i < arr1.length; i++) {
            // arr1的i位置上的值和arr2的i位置上的值比较
            if (arr1[i] != arr2[i]) {   //不相等的话，就返回false
                return false;
            }
        }

        return true;
    }

}