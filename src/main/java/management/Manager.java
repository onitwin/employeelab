package management;

import staff.Employee;

public class Manager extends Employee {
    private String dept;

    public Manager(String name, String ni,double salary,String dept){
        super(name,ni,salary);
        this.dept=dept;
    }

    public String getDept(){
        return this.dept;
    }
}
