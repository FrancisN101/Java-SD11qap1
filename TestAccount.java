package QAP1_Java;

public class TestAccount {
    public static void main(String[] args) {
        //setting up accounts
        Account a1 = new Account("1", "Account1", 5000);
        Account a2 = new Account("2", "Account2", 4000);


        //initial balance print statements
        System.out.println("Account Balance: " + a1.getBalance());
        System.out.println("Account Balance: " + a2.getBalance());
        
        //transfer 1000 from a1 to a2
        a1.transferTo (a2, 1000);

        //final balance print statments
        System.out.println("Account Balance: " + a1.getBalance());
        System.out.println("Account Balance: " + a2.getBalance());
    }
}




