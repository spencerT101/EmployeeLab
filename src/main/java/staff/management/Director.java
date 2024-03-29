package staff.management;

public class Director extends Manager {

    private Director director;
    private double budget;

    public Director(String name, String niNumber, int salary, String deptName, double budget) {
         super(name, niNumber, salary, deptName);
         this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        double salary = super.getSalary();
        return salary*0.02;
    }
}
