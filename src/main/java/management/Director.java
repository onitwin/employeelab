package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String ni, double salary, String dept, double budget){
        super(name, ni, salary,dept);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public double payBonus(){
        return this.getSalary() * 0.2;
    }
}
