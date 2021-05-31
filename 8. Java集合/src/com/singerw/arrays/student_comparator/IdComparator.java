package com.singerw.arrays.student_comparator;

import java.util.Comparator;

/**
 * @ClassName: StudentComparator
 * @Description: //TODO Student外部比较器
 * @Author: CodeSleep
 * @Date: 2021-05-31 15:30
 * @Version: 1.0
 */
public class IdComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}
