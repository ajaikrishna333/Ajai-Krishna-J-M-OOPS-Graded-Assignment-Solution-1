package DriverPackage;

import AdminPackage.AdminDepartment;
import HrPackage.HrDepartment;
import TechPackage.TechDeartment;

public class Driver {

    public static void main(String[] args) {

        AdminDepartment s1 = new AdminDepartment();
        HrDepartment s2 = new HrDepartment();
        TechDeartment s3 = new TechDeartment();

        System.out.println("Welcome to " + s1.departmentName());
        System.out.println(s1.getTodaysWork());
        System.out.println(s1.getWorkDeadline());
        System.out.println(s1.isTodayHoliday());

        System.out.println("\n");

        System.out.println("Welcome to " + s2.departmentName());
        System.out.println(s2.doActivity());
        System.out.println(s2.getTodaysWork());
        System.out.println(s2.getWorkDeadline());
        System.out.println(s2.isTodayHoliday());

        System.out.println("\n");

        System.out.println("Welcome to " + s3.departmentName());
        System.out.println(s3.getTodaysWork());
        System.out.println(s3.getWorkDeadline());
        System.out.println(s3.getTechStackInformation());
        System.out.println(s3.isTodayHoliday());

    }

}
