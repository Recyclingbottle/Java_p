package java_05;

import java_05.week.Month;
import java_05.week.Week;

public class week_m {
    public static void main(String args[])
    {
        Week today = Week.FRIDAY;
        Week tomorrow = Week.SATURDAY;

        Month mon1 = Month.DEC;
        System.out.printf("Today Month : %s\n", mon1.name());

        String day = today.name( ); // "FRIDAY" 반환
        System.out.printf("Today : %s\n", day);
        int ordinal = today.ordinal( ); // 4반환
        System.out.printf("Today Ordinal : %d\n", ordinal);
        int diff1 = today.compareTo(tomorrow); // -1 반환
        int diff2 = tomorrow.compareTo(today); // 1 반환

        System.out.printf("diff1 : %d\n", diff1);
        System.out.printf("diff2 : %d\n", diff2);

        Week weekend = Week.valueOf("SUNDAY"); // Week.SUNDAY
        System.out.printf("Weekend : %s\n", weekend.name());

        Week[] days = Week.values( );

        for(Week d : days) {
            System.out.println("week : " +d);
        }
    }
                
}
