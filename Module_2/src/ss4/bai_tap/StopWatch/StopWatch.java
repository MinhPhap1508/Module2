package ss4.bai_tap.StopWatch;

import java.time.LocalTime;

public class StopWatch {
//    public StopWatch(int startTime, int Time) {
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }

    private long startTime;
    private long endTime;

    public long getStart() {
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void  stop() {
        endTime = System.currentTimeMillis();
    }


    public long getElapsedTime() {
        return endTime-startTime;
    }
}
