
public class SortThread extends Thread {

    public SortThread() {
    }
//Override the run() method in Thread Class
    @Override
    public void run() {
        try {
            Quicksort.();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
