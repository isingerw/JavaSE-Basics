package com.singerw.day10;

/**
 * @ClassName: Employee
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-18 9:24
 */
public class Employee {
    private String empno;
    private String emname;
    private String deptname;
    private double salary;
    private String manager;

    /**
     * (这里用一句话描述这个构造函数的作用)
     *
     * @param
     * @Return
     */
    public Employee(String empno, String emname, String deptname, double salary, String manager) {
        this.empno = empno;
        this.emname = emname;
        this.deptname = deptname;
        this.salary = salary;
        this.manager = manager;
    }

    public void showInfo() {
        System.out.println("编号" + empno + "姓名" + emname + "部门名" + deptname + "工资" + salary + "经理" + manager);
    }
}
