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

    public long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }


    public long getElapsedTime() {
        return endTime-startTime;
    }
}
