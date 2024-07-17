package com.dmitrygrinko;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.AWTException;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Mouse <interval_in_minutes>");
            return;
        }

        int intervalInMinutes = Integer.parseInt(args[0]);
        long intervalInMillis = intervalInMinutes * 60 * 1000;

        try {
            Robot robot = new Robot();
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                private int count = 0;

                @Override
                public void run() {
                    Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
                    robot.mouseMove(0, 0);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    robot.mouseMove(mouseLocation.x, mouseLocation.y);
                    count++;
                    System.out.println((count * intervalInMinutes) + " minutes");
                }
            };

            timer.scheduleAtFixedRate(task, 0, intervalInMillis);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}