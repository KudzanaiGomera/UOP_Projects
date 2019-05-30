package payrollsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] args) {
        ArrayList<Employee> arrEmp = new ArrayList<>();
        String varCont = "N";
        byte menuOption = 0;

        do {
            menuOption = showMenu();
            switch (menuOption) {
                case 1:
                    FullTime ft;
                    ft = readNewFullTime();
                    addEmployee(arrEmp, ft);
                    break;
                case 2:
                    PartTime pt;
                    pt = readNewPartTime();
                    addEmployee(arrEmp, pt);
                    break;
                case 3:
                    calcPayroll(arrEmp);
                    break;
                default:
                    break;
            }
            
        }while (menuOption != 4);
 }
                

    public static FullTime readNewFullTime() {

        int id = 0;
        String name = null;
        double sal = 0.0;
        double hourAndHalf = 0.0; //override
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter id: ");
        id = kbd.nextInt();
        System.out.println("\nEnter Name: ");
        name = kbd.next();
        System.out.println("\nEnter Salary: ");
        sal = kbd.nextDouble();
        System.out.println("\nEnter Bonus: ");
        hourAndHalf = kbd.nextDouble();
        FullTime ft1 = null;
        ft1 = new FullTime(id, name, sal, hourAndHalf, getVehicle());
        return ft1;
    }

    public static PartTime readNewPartTime() {

        int id = 0;
        String name = null;
        double rate = 0.0;
        double hoursWorked = 0.0; //override
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter id: ");
        id = kbd.nextInt();
        System.out.println("\nEnter Name: ");
        name = kbd.next();
        System.out.println("\nEnter Salary: ");
        rate = kbd.nextDouble();
        System.out.println("\nEnter Bonus: ");
        hoursWorked = kbd.nextDouble();
        Vehicle vi = null;
        PartTime pt1 = null;

        pt1 = new PartTime(id, name, rate, hoursWorked, getVehicle());
        return pt1;
    }

    public static byte showMenu() {
        byte menuOption = 0;
        Scanner kbd = new Scanner(System.in);

        System.out.println(""
                + "/*************************************************************************************************************/"
                + "\n/* 1.    Add FullTime                                                                                        "
                + "\n/* 2.    Add PartTime                                                                                        "
                + "\n/* 3.    Calculate Payroll                                                                                   "
                + "\n/* 4.    Exit                                                                                                "
                + "/*************************************************************************************************************");
        System.out.println("Input : ");
        menuOption = kbd.nextByte();
        return menuOption;
    }

    public static Vehicle getVehicle() {

        Scanner kbd = new Scanner(System.in);
        String hasVehicle = "N";

        System.out.println("\nDoes this emloyeee have a vehicle Y/N : /nInput : ");
        hasVehicle = kbd.next();
        if (hasVehicle.equalsIgnoreCase("Y")) {
            // creates and populate object Vehicle
            System.out.println("\nEnter plate number: ");
            String auxPlate = kbd.next();
            System.out.println("\nEnter vehicle colour: ");
            String auxColour = kbd.next();
            return (new Vehicle(auxPlate, auxColour));
        } else {
            return (null);
        }
    }

    public static void addEmployee(ArrayList<Employee> pArrEmp, Employee pEmp) {

        pArrEmp.add(pEmp);
    }

    public static void calcPayroll(ArrayList<Employee> pArrEmp) {

        double totalCompanyPay = 0.0;
        double individualPay;

        //calcuate salary = manipulating array only
        for (int i = 0; i < pArrEmp.size(); i++) {
            System.out.println("\n*************************************\n");
            individualPay = (pArrEmp.get(i)).calculatePay();
            Vehicle v = (pArrEmp.get(i)).getVehicle();
            String hasVehicle;

            if (v == null) {
                hasVehicle = "No";
            } else {
                hasVehicle = "Yes";
            }
            System.out.println("Employee Name: " + (pArrEmp.get(i)).getName());
            System.out.println("Has Vehicle: " + hasVehicle);

            if (v != null) {
                System.out.println("Place Number: " + v.getPlateNumber());
                System.out.println("Colour: " + v.getColour());
            }

            System.out.println("Take Home Pay: " + individualPay);

            totalCompanyPay = totalCompanyPay + individualPay;

        }
        System.out.println("----------------------\n Total payroll of the company: " + totalCompanyPay + "\n--------");
    }


}
