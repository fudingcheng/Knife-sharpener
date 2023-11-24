package cn.itcast.interfaceDemo3;

import java.util.List;

/**
 * 操作学生的接口
 */
public interface StudentOperator {

    /**
     * 打印所有信息
     *
     * @param students
     */
    void printAllInfo(List<Student> students);

    /**
     * 计算学生的平均成绩
     *
     * @param students
     */
    void printAvgScore(List<Student> students);

}
