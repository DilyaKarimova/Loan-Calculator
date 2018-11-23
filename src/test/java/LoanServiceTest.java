import ru.itpark.LoanService;

class LoanServiceTest {

    @org.junit.jupiter.api.Test
    void calculateLoan() {
        {
            LoanService loanService = new LoanService();
            int paymentAmount = loanService.calculateLoan(1_000_000, 12, 12);
        }


        {
            LoanService loanService = new LoanService();
            int paymentAmount = loanService.calculateLoan(500_000, 7, 3);
        }
    }
}