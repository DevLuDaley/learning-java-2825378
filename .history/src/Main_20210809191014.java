public class Main {

    public static void employeeSalaryCalc(double employeeWeekHours, double employeeHourlyRate, double vacationDaysUsed) {
        double employeeGrossAnnualSalary = employeeWeekHours * employeeHourlyRate * 52;
        System.out.println("The employee made " + employeeGrossAnnualSalary + " this year!");
    }
    public static void main(String[] args) {
        employeeSalaryCalc(40,39,0);
    }

}
