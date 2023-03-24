package java_02;
import java.time.LocalDateTime;

public class Movie {
    private String 이름;
    private LocalDateTime 상영시간;
    private int 잔여석;
    private int 가격;
    
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
    
    public class Ticket {
        private String 이름;
        private LocalDateTime 상영시간;
        private int 인원수;
        private int 가격;

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

        public void 정보출력(){
            System.out.printf("영화이름 : %s, 상영시간 : %s, 인원수 : %d, 가격 : %d\n", get이름(), get상영시간(), get인원수(), get가격());
        }
    }
    
    public Ticket 예매(int 예매인원)
    {
        set잔여석(get잔여석() - 예매인원);
        Ticket ticket = new Ticket();
        ticket.set인원수(예매인원);
        ticket.set이름(get이름());
        ticket.set상영시간(get상영시간());
        ticket.set가격(get가격() * 예매인원);
        System.out.println("예매가 완료되었습니다.");
        return ticket;
    }
    
    public void 정보출력(){
        System.out.printf("영화 이름 : %s, 상영 시간 : %s, 잔여석 : %d, 가격 : %d\n", get이름(), get상영시간(), get잔여석(), get가격());
    }
    
    public static class User {
        private String 이름;
        private String 전화번호;
        private Movie.Ticket 티켓;
        private int 잔액;
    
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
    
        public Movie.Ticket get티켓() {
            return 티켓;
        }
    
        public void set티켓(Movie.Ticket 티켓) {
            this.티켓 = 티켓;
        }
    
        public int get잔액() {
            return 잔액;
        }
    
        public void set잔액(int 잔액) {
            this.잔액 = 잔액;
        }
    
        public void 예매(Movie movie, int 예매인원) {
            Movie.Ticket ticket = movie.예매(예매인원);
            set티켓(ticket);
            set잔액(get잔액() - ticket.get가격());
        }
    
        public void 정보출력() {
            System.out.printf("유저 정보 출력 : 이름 : %s, 전화번호 : %s, 티켓 : %s, 잔액 : %d \n", get이름(), get전화번호(), get티켓(), get잔액());
        }
    }
    public class Main {
        public static void main(String[] args) {
            Movie movie = new Movie();
            movie.이름 = "라라랜드";
            movie.가격 = 15000;
            movie.잔여석 = 50;
            movie.상영시간 = LocalDateTime.of(2023, 2, 6, 10, 50);
            
            User user = new User();
            user.이름 = "홍길동";
            user.전화번호 = "010-0000-000";
            user.잔액 = 100000;
    
            user.예매(movie, 4 );
            user.정보출력();
        }
    }
}

