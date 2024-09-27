package QAP1_Java;

public class Date {

    private int day;
    private int month;
    private int year;

    // Constructor accepting day, month, and year
    public Date(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    // Getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Setters with validation
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid day. Day must be between 1 and 31.");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month. Month must be between 1 and 12.");
        }
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Invalid year. Year must be between 1900 and 9999.");
        }
    }

    // Setting date in one method
    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    // String representation of the date
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
