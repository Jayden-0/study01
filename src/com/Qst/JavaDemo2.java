package com.Qst;

class Employee {
    private long empno ;
    private String ename;
    private double salary;
    private double rate;
    public Employee() {}
    public Employee(long empno,String ename,double salary,double rate) {
        this.empno =empno;
        this.ename = ename;
        this.salary = salary;
        this.rate = rate;
    }
    public double salaryIncValue() {
        return this.salary * this.rate ;
    }

    public double salaryIncResult() {
        this.salary = this.salary * ( 1 + this.rate );
        return this.salary;
    }

    public String getInfo() {
        return "员工编号：" + this.empno + "，姓名：" + this.ename + "，基本薪资：" + this.salary
                + "，薪水增长率" + this.rate ;
    }
}

public class JavaDemo2 {
    public static void main(String[] args) {
        Employee emp = new Employee(7369L,"史密斯",3000.0,0.3);
        System.out.println(emp.getInfo());
        System.out.println("工资调整额度：" + emp.salaryIncValue());
        System.out.println("上调后工资：" + emp.salaryIncResult());
        System.out.println(emp.getInfo());
    }
}
