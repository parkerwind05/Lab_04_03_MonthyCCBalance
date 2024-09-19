public class Main
{
    public static void main(String[] args)
    {
        double initialCCBalance = 5000;
        double interestRate = 0.17;
        double oneMonthBalance = initialCCBalance*interestRate+initialCCBalance;
        double twoMonthBalance = oneMonthBalance*interestRate+oneMonthBalance;

        System.out.println("Your initial credit card balance is $" + initialCCBalance + " and the interest rate is " + interestRate);
        System.out.println("Your one month credit card balance is $" + oneMonthBalance);
        System.out.println("Your two month credit card balance is $" + twoMonthBalance);




    }
}