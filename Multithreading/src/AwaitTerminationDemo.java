//7. Submit List of tasks to ExecutorService and wait for the completion of all the tasks.
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class AwaitTerminationDemo {
    public static void main(String[] args) {
        List<Callable<Integer>> myList = new ArrayList<>();
        
        myList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 12;
            }
        });
        
        myList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 15;
            }
        });
        
        myList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 17;
            }
        });
        
        myList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 20;
            }
        });
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Future<Integer>> myFutureList = null;
        try {
            myFutureList = executorService.invokeAll(myList);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
        for(Future<Integer> f: myFutureList)
        {
            try {
                System.out.println("Tasks are :"+f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
