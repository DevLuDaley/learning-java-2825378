public class Main {

    public static void employeeSalaryCalc(double employeeWeekHours, double employeeHourlyRate, double vacationDaysUsed) {
        double employeeGrossAnnualSalary = employeeWeekHours * employeeHourlyRate * 52;
        System.out.println("The employee worked " + employeeWeekHours +  " hours"+ " at a rate of " + employeeHourlyRate + ". Employeee earned a total of " + employeeGrossAnnualSalary + " this week!");
    }
    public static void main(String[] args) {
        employeeSalaryCalc(40,30,0);
    }

}
