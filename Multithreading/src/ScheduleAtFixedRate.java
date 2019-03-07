//8. Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleAtFixedRate {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        ((ScheduledExecutorService) executorService).scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("Scheduling after Fixed Delays");
            }
        }, 0, 5, TimeUnit.SECONDS);
        
        ((ScheduledExecutorService) executorService).scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Scheduling at fixed Rate");
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
}
