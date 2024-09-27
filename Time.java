package QAP1_Java;

public class Time {
    private int hour;
    private int minute;
    private int second;

    //constructor
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //get
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    //setting time perameters (0-23)(0-59)(0-59)
    public void setHour(int hour){
        if (hour >= 0 && hour <= 23){
            this.hour =hour;
        } else {
            System.out.println("Hours must be between 0 and 23.");
        }
    }

    public void setMinute(int minute){
        if (minute >=0 && minute <=59){
            this.minute = minute;
        } else{
            System.out.println("Minutes must be between 0-59");
        }
    }

    public void setSecond(int second){
        if (second >=0 && second <=59){
            this.second =second;
        } else {
            System.out.println("Seconds must be between 0 and 59");
        }
    }

    //setting up the time
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //next seconf function
    public Time nextSecond(){
        second++;
        if (second >= 60){
            second = 0;
            minute ++;
        if (minute >=60){
            minute = 0;
            hour ++;
        if (hour >=24){
            hour = 0;
        }
    }
}
    return this;
}
//previous second function
public Time previousSecond(){
    second--;
    if (second < 0){
        second = 59;
        minute --;
    if (minute < 0){
        minute = 59;
        hour --;
    if (hour < 0){
        hour = 23;
    }
}
}
return this;
}

//to string formatting
@Override
public String toString() {
    return String.format("%d:%02d:%02d", hour, minute, second);
}


}
