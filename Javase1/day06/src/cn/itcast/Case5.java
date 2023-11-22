package cn.itcast;

/**
 * 数组的拷贝
 */
public class Case5 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        // 拷贝数组
        //int[] newArr = copyArray(arr);
        int[] newArr = arr;     // 这是数组的拷贝吗?不是的!!
        // 打印数组
        printArray(newArr);
    }

    /**
     * 打印数组
     *
     * @param arr
     */
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }

    /**
     * 拷贝数组
     * @param arr
     * @return
     */
    private static int[] copyArray(int[] arr) {

        // 创建一个新数组,长度和arr一样
        int[] newArr = new int[arr.length];

        // 遍历arr,将元素拷贝到newArr
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }
}
