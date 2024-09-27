package QAP1_Java;

public class TestTime {
    
    public static void main(String[] args) {
        //set and define the two times
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);
        
        //call on next/previous functions
        t1.nextSecond();
        t2.previousSecond();
        
        // Corrected concatenation in println
        System.out.println("The first time is: " + t1 + " and the second time is: " + t2 + ".");
    }
}






