package QueueState;

import java.util.LinkedList;
import java.util.Queue;

public class StateQueueExample {
    public static void main(String[] args) {
        Queue<String> stateQueue = new LinkedList<>();

       
        stateQueue.add("Gujarat");
        stateQueue.add("Maharashtra");
        stateQueue.add("Uttar Pradesh");
        stateQueue.add("Tamil Nadu");
        stateQueue.add("Karnataka");

        String removedState = stateQueue.poll();
        System.out.println("Removed state: " + removedState);
        
        while (!stateQueue.isEmpty()) {
            System.out.println(stateQueue.poll());
        }
    }
}
