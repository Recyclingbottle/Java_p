package java_02;
import java.time.LocalDateTime;

public class Movie {
    String 이름;
    LocalDateTime 상영시간;
    int 잔여석;
    int 가격;
    public class Ticket {
        String 이름;
        LocalDateTime 상영시간;
        int 인원수;
        int 가격;

        void 정보출력(){
            System.out.printf("영화이름 : %s, 상영시간 : %s, 인원수 : %d, 가격 : %d\n", 이름, 상영시간, 인원수, 가격);
        }
    }
    Ticket 예매(int 예매인원)
    {
        잔여석 -= 예매인원;
        Ticket ticket = new Ticket();
        ticket.인원수 = 예매인원;
        ticket.이름 = this.이름;
        ticket.상영시간 = this.상영시간;
        ticket.가격 = this.가격 * 예매인원;
        System.out.println("예매가 완료되었습니다.");
        return ticket;
    }
    void 정보출력(){
        System.out.printf("영화 이름 : %s, 상영 시간 : %s, 잔여석 : %d, 가격 : %d\n", 이름, 상영시간, 잔여석, 가격);
    }
    
    public static class User {
        String 이름;
        String 전화번호;
        Movie.Ticket 티켓;
        int 잔액;
    
        void 예매(Movie movie, int 예매인원)
        {
            Movie.Ticket ticket = movie.예매(예매인원);
            티켓 = ticket;
            잔액 -= ticket.가격;
        }
        void 정보출력()
        {
            System.out.printf("유저 정보 출력 : 이름 : %s, 전화번호 : %s, 티켓 : %s, 잔액 : %d \n", 이름, 전화번호, 티켓, 잔액);
        }
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
