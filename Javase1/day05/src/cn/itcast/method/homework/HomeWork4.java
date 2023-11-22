package cn.itcast.method.homework;

/*
	分析以下需求并完成代码
		设计一个方法, 用来判断一个整数是否在某个数组中，
		如果在则返回该整数在数组中的索引, 如果不在则返回-1
		在main方法中调用该方法完成测试
*/
public class HomeWork4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int num = 3;

        // 通过方法查找在arr中是否存在num
        int rs = search(arr, num);
        System.out.println(rs);
    }

    public static int search(int[] arr, int num) {
        //1. 遍历数组
        for (int i = 0; i < arr.length; i++) {
            //2.判断如果arr[i] == num 找到了
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

}
