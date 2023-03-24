package java_03;

public class User {
    private String 이름;
    private String 전화번호;
    private Ticket 티켓;
    private int 잔액;

    public void 예매(Movie movie, int 예약인원) {
        Ticket ticket = movie.예매(예약인원);
        티켓 = ticket;
        잔액 -= ticket.get가격();
    }

    public void 정보출력() {
        System.out.printf("유저 정보 출력 : 이름 : %s, 전화번호 : %s , 티켓 : %s, 잔액 : %d\n", 이름, 전화번호, 티켓, 잔액);
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public String get전화번호() {
        return 전화번호;
    }

    public void set전화번호(String 전화번호) {
        this.전화번호 = 전화번호;
    }

    public Ticket get티켓() {
        return 티켓;
    }

    public void set티켓(Ticket 티켓) {
        this.티켓 = 티켓;
    }

    public int get잔액() {
        return 잔액;
    }

    public void set잔액(int 잔액) {
        this.잔액 = 잔액;
    }
}
