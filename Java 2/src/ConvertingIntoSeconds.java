public class ConvertingIntoSeconds {
    static int seconds, hours, minutes, days;
    
    void convertIntoSeconds(int s)
    {
        days = s/86400;
        int remainingSeconds = s % 86400;
        hours = remainingSeconds / 3600;
        remainingSeconds = remainingSeconds % 3600;
        minutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;
        seconds = remainingSeconds;
    }
    
    public static void main(String[] args) {
        ConvertingIntoSeconds c = new ConvertingIntoSeconds();
        c.convertIntoSeconds(940000);
        System.out.println("Days: "+days);
        System.out.println("Hours: "+hours);
        System.out.println("Minutes: "+minutes);
        System.out.println("Seconds: "+seconds);
    }
    
}
