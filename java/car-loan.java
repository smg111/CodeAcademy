/* calculates the monthly car payment a user should expect to make after taking out a car loan of 10000 for 3 years at 5% interest */

public class CarLoan {
	public static void main(String[] args) {

	int carLoan = 10000;
  int loanLength = 3;
  int interestRate = 5;
  int downPayment = 2000;
  
  if (loanLength <= 0 || interestRate <= 0) {
    System.out.println("Loan length and/or interest rate invalid.");
  }
else if (downPayment > carLoan) {
  System.out.println("Nice, you can pay the car in full.");
}
else {
  int remainingBalance = carLoan - downPayment;
  int months = loanLength*12;
  int monthlyBalance = remainingBalance/months;
  int interest = (monthlyBalance*interestRate)/100;
  int monthlyPayment = monthlyBalance+interest;
  System.out.println(monthlyPayment);
}
	}
}
