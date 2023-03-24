package java_03;
import java.time.LocalDateTime;
import java_03.*;
public class Movie {
    private String 이름;
    private LocalDateTime 상영시간;
    private int 잔여석;
    private int 가격;

    public Ticket 예매(int 예약인원) {
        잔여석 -= 예약인원;
        Ticket ticket = new Ticket();
        ticket.set인원수(예약인원);
        ticket.set이름(this.이름);
        ticket.set상영시간(this.상영시간);
        ticket.set가격(this.가격 * 예약인원);
        System.out.println("예매가 완료되었습니다.");
        return ticket;
    }

    public void 정보출력() {
        System.out.printf("영화 이름 : %s, 상영 시간 : %s, 잔여석 : %d, 가격 : %d\n", 이름, 상영시간, 잔여석, 가격);
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

    public int get잔여석() {
        return 잔여석;
    }

    public void set잔여석(int 잔여석) {
        this.잔여석 = 잔여석;
    }

    public int get가격() {
        return 가격;
    }

    public void set가격(int 가격) {
        this.가격 = 가격;
    }
}
