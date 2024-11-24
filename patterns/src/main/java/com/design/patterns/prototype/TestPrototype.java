package com.design.patterns.prototype;

import java.util.List;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();

        List<String> list = empsNew.getEmpList();
        list.add("Camus");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Bonzo");

        System.out.println("emps list:" + emps.getEmpList());
        System.out.println("empsNew list:" + list);
        System.out.println("empsNew1 list:" + list1);
    }
}
