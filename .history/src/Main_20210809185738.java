public class Main {

    public static void employeeSalaryCalc(double employeeWeekHours, double employeeHourlyRate) {
        double employeeGrossAnnualSalary = employeeWeekHours * employeeHourlyRate;
        System.out.println("The employee works " + employeeWeekHours + " at a rate of " + employeeHourlyRate + "EMployeee earned a total of " + employeeGrossAnnualSalary + " this week!");
    }
    public static void main(String[] args) {
        employeeSalaryCalc(40,30);
    }

}
