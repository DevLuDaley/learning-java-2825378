public class Main {

    public static void employeeSalaryCalc(double employeeWeekHours, double employeeHourlyRate, double vacationDaysUsed) {
        double employeeGrossAnnualSalary = (employeeWeekHours - vacationDaysUsed) * employeeHourlyRate * 52;
        System.out.println("The employee made " + employeeGrossAnnualSalary + " this year!");
    }
    public static void main(String[] args) {
        employeeSalaryCalc(40,37,2);
    }

}
