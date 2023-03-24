package java_03;

import java.time.LocalDateTime;

public class Ticket {
    private String 이름;
    private LocalDateTime 상영시간;
    private int 인원수;
    private int 가격;

    public void 정보출력() {
        System.out.printf("영화이름 : %s, 상영시간 : %s, 인원수 : %d, 가격 : %d\n", 이름, 상영시간, 인원수, 가격);
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public LocalDateTime get상영시간() {
        return 상영시간;
    }

    public void set상영시간(LocalDateTime 상영시간) {
        this.상영시간 = 상영시간;
    }

    public int get인원수() {
        return 인원수;
    }

    public void set인원수(int 인원수) {
        this.인원수 = 인원수;
    }

    public int get가격() {
        return 가격;
    }

    public void set가격(int 가격) {
        this.가격 = 가격;
    }
}
