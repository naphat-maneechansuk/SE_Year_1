package clock;

public class Clock {
    private int hour;
    private int minute;
    public Clock(int hour,int minute){
        setTime(hour,minute);
    }
    public void setTime(int hour,int minute){
        if (minute>=60||minute<=0){
           this.minute = 0;
            System.out.println("Minute is incorrect. Setting minute to 0.");
        } else {
            this.minute=minute;
        }
        if (hour<24&&hour>=0){
            this.hour=hour;
        }else {
            System.out.println("Hour is incorrect. Setting hour to 0.");
            this.hour=0;
        }
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
    public void increaseMinute(){
        minute++;
        if (minute>59){
            this.minute=0;
            increaseHour();
        }
    }public void increaseHour(){
        hour++;
        if (hour>23){
            this.hour=0;
        }
    }
    public String toString(){
        String timeStr = "";
        if (hour<10){
            timeStr+="0"+hour;
        }else {
            timeStr += hour;
        }
        timeStr += " : ";
        if (minute< 10){
            timeStr+="0"+minute;
        }else timeStr += minute;

        return timeStr;
    }
}
