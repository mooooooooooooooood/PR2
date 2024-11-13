package PR2.tut1;
/**
 * This class implements a simple program that
 * will compute the amount of interest that is
 * earned on 17,000 invested at an interest
 * rate of 0.07 for one year. The interest and
 * the value of the investment after one year are
 * printed to standard output.
 */
public class InterestInvestment {
    public static void main(String[] args) {
         /* Declare the variables. */
         int principal;
         double rate;
         double interest;
         /* Do the computations. */
         principal = 17000;
         rate = 0.07;
         interest = principal * rate;
         principal = principal + (int) interest;
         /* Output the results. */
         System.out.print("The interest earned is ");
         System.out.println(interest);
         System.out.print("The value of the investment after one year is ");
         System.out.println(principal);
    }
}
