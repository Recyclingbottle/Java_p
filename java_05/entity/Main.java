package java_05.entity;
import java_05.exception.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try{
            Movie movie = new Movie();
            movie.set이름("라라랜드");
            movie.set가격(15000);
            movie.set잔여석(50);
            movie.set상영시간(LocalDateTime.of(2023, 2, 6, 10, 50));
            
            User user = new User();
            user.set이름("홍길동");
            user.set전화번호("010-1111-2222");
            user.set잔액(10000);
            user.예매(movie, 2);
            user.정보출력();
        }catch(PaymentException e) { e.printStackTrace();}
    }
}