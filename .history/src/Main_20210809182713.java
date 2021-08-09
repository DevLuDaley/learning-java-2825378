public class Main {

    public static void calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate
                                            //    double numOfPeople
                                               ) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is $" + result);


        System.out.println("Your total meal price is $" + result);
    }

    public static void main(String[] args) {
    calculateTotalMealPrice(12, .15, .05);
    calculateTotalMealPrice(15, .2, .08);
    calculateTotalMealPrice(25, .18, .08);
    calculateTotalMealPrice(100, .2, .08);
}

}
