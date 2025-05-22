package com.constructor;

public class Employee1 {
	String name;
    double salary;
    
    public Employee1(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    
    public void setSalary(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Name:" +this.name+",Salary:"+this.salary);
    }
    public static void main(String []args){
        Employee1 emp=new Employee1("Archana",543214.0);
        emp.display();
        emp.setSalary("Archana", 121324.0);
        emp.display();
    }
}

