package QAP1_Java;

public class Account{
    private String id;
    private String name;
    private int balance;

    //Ccnstructor 1
    public Account(String id, String name){
        this.id =id;
        this.name =name;
        this.balance =0;
    }

    //Constructor 2
    public Account(String id, String name, int balance){
        this.id =id;
        this.name = name;
        this.balance =balance;
    }

    //get
    public String getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    //Credit add amount and return balance
    public int credit(int amount){
        balance += amount;
        return balance;
    }

    //debit amount - subtract amount - else "exceeds"
    public int debit(int amount){
        if (amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Amount exceeds balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount){
        if (amount <= balance){
            debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    //string
    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
   
}