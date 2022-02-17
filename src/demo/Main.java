package demo;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    int point = 100;
    //scanner kan godt sættes her

    public static void main(String[] args) {
        Main demo = new Main();
        demo.doubleUpIfMonday();
        demo.displayPoint();

    }

    public void doubleUpIfMonday() {
        //test
        LocalDate today = LocalDate.now();
        //hvis det er mandag så dobbelt point
        if (today.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
            point = point * 2;

        }
    }

    public void displayPoint() {
        System.out.println(point);
    }
}
