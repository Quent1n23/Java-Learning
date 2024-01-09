package com.hspedu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);
        polyParameter.testWork(tom);
        polyParameter.testWork(milan);

    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    //testWork，如果是普通员工，则调用work方法，如果是经理，则调用manage方法
    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();//向下转型
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("不做处理");
        }
    }
}
