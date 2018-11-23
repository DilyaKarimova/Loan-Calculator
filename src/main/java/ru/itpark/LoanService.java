package ru.itpark;

public class LoanService {
    public int calculateLoan(int loanAmount, int interestRate, int loanTerm) {

        double monthlyInterestRate = interestRate / (100.0000 * 12);
        double additionalVariable = 1 - (Math.pow((1 + monthlyInterestRate), (-loanTerm)));
        int monthlyPayment = (int) (loanAmount * monthlyInterestRate / additionalVariable);
        int paymentAmount = monthlyPayment * loanTerm;

        System.out.println(monthlyPayment);
        System.out.println(paymentAmount - loanAmount);
        System.out.println(paymentAmount);

        return paymentAmount;

    }
}

