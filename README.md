# 자바 프로그래밍

이 리포지토리는 자바 공부를 위한 리포지토리입니다.

| 주차   | 강의 주제        | 강의 내용                                      |
| ------ | ---------------- | --------------------------------------------- |
| 1주차  | 자바 개요 및 소개  | 자바 개발환경 설정, 간단한 프로그램 제작/사용 |
| 2주차  | 기본 프로그래밍       | 프로그램의 기본 구조, 표준 입력/출력                 |
| 3주차  | 반복문, 배열, 예외 처리 | 제어문, 반복문, 배열, 예외 처리 등                    |
| 4주차  | 클래스와 객체        | 클래스 작성, 객체와 객체 배열 생성, 객체 소멸과 가비지 컬렉션, static/final |
| 5주차  | 상속1             | 상속의 개념 이해, 서브 클래스 작성, 오버라이딩과 동적 바인딩 |
| 6주차  | 상속2             | 추상 클래스와 인터페이스                          |
| 7주차  | 컬렉션과 제네릭       | 개념 이해, 사용자 패키지 만들기, 자바의 다양한 패키지 다루기 |
| 9주차  | 자바 GUI 스윙 기초    | GUI 프로그래밍의 기초 이해, 스윙 프로그램 작성         |
| 10주차 | 이벤트 처리         | 이벤트 기반 프로그래밍 이해, 이벤트 리스너 작성, 스윙으로 키보드와 마우스 다루기 |
| 11주차 | 스윙 컴포넌트 활용     | 다양한 스윙 컴포넌트를 활용하여 GUI 프로그램 작성       |
| 12주차 | 스레드             | 자바 스레드, 멀티 스레드, 스레드 동기화에 대한 기초 개념 이해, 스레드 프로그램 작성 |
| 13주차 | 입출력 스트림, 파일 입출력 | 자바의 표준 입출력 스트림의 개념 이해, 텍스트/바이너리/파일 입출력 프로그램 작성 |
| 14주차 | 자바 소켓 프로그래밍   | 소켓을 사용하는 통신 프로그램 작성                      |

# 자바프로그래밍 정리

### 1주차

1. 자바개요 
2. 개발환경 구축

### 2주차

1. 변수와 자료형
2. 표현식과 연산자

### 3주차

1. 조건문, 반복문
2. 반복문

### 4주차

1. 클래스와 객체 
2. 메소드
3. 생성자

### 5주차

1. Static 멤버
2. 배열과 열거형
3. 예외처리 
4. 패키지 

### 6주차

1. 상속
2. 다형성

### 7주차

1. 추상클래스와 인터페이스
2. Class Diagram in UML

---

## 1주차

## 자바프로그래밍 개요

### 자바의 플랫폼 독립성, WORA

- WORA(Write Once Run Anywhere)
    - 한번 작성된 코드는 모든 플랫폼에서 바로 실행되는 자바의 특징
    - C/C++ 등 기존 언어가 가진 플랫폼 종속성 극복
        - OS 나 하드웨어에 상관없이 자바 프로그램이 동일하게 실행
    - 네트워크에 연결된 어느 클라이언트에서나 실행
        - 웹 브라우저나 분산 환경 시스템 지원
- WORA를 가능하게 하는 자바의 특징
    - 바이트 코드(byte code)
        - 자바 소스를 컴파일한 목적 코드
        - CPU 에 종속적이지 않은 중립적인 코드
        - JVM 에 의해 해석되고 실행됨
    - JVM(Java Virtual Machine)
        - 자바 바이트 코드를 실행하는 자바 가상 기계(소프트웨어)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/78cb22cb-d68c-4294-9127-5eeb9abcadef/Untitled.png)

### 자바 가상 기계와 자바 실행 환경

- 바이트 코드
    - 자바 가상 기계에서 실행 가능한 바이너리 코드
        - 바이트 코드는 컴퓨터 CPU에 의해 직접 실행되지 않음
        - 자바 가상 기계가 작동 중인 플랫폼에서 실행
        - 자바 가상 기계가 인터프리터 방식으로 바이트 코드 해석
    - 클래스 파일(.class) 에 저장
- 자바 가상 기계(JVM: JAVA Virual Machine)
    - 각기 다른 플랫폼에 설치
    - **동일한 자바 실행 환경 제공**
    - 자바 가상 기계 자체는 플랫폼에 종속적
        - 자바 가상 기계는 플랫폼마다 각각 작성된다
        - 예) 리눅스에서 동작하는 JVM 은 윈도우에서 안돌아감
    - 자바 가상 기계 개발 및 공금
        - 자바 개발사인 오라클 외 IBM, MS 등 다양한 회사에서 제작 공급
- 자바의 실행
    - 자바 가상 기계가 클래스 파일(.class) 의 바이트 코드를 실행한다

### 자바의 특징

- 객체지향 프로그래밍
    - 클래스,  추상화, 상속 등을 지원
- 플랫폼 독립성
    - 플랫폼(하드웨어 + 운영체제) 에 관계 없이 제작 및 실행 가능
    - 자바 가상 기계(JVM) 에서 바이트 코드 실행
- 멀티 스레드 기능 제공
    - 운영체제 도움 없이 멀티 스레드 지원
- 패키지 단위 관리
    - 관련 클래스를 패키지 단위로 묶어서 관리
- 손쉬운 GUI 프로그래밍
    - Swing, JAVA FX 등을 사용하여 GUI 프로그래밍 가능

### 자바 실행 환경

자바 소스 코드 → 컴파일(javac) → 바이트 코드(.class) → 자바가상기계 - 운영체제 - 하드웨어

### 자바 API

- JDK 에 포함된 클래스 라이브러리
- 개발자는 API 를 이용하여 쉽고 빠르게 자바 프로그램 개발

### 자바 패키지(Package)

- 서로 관련된 클래스들을 분류하여 묶어 놓은 것
- 계층 구조로 되어 있음
    - 클래스의 이름에 패키지 이름 포함
    - 다른 패키지에 동일한 이름의 클래스 존재 가능
- 자바 API(클래스 라이브러리) 는 JDK 에 패키지 형태로 제공됨
    - 필요한 클래스가 속한 패키지만 import 하여 사용
- 개발자 자신의 패키지 생성 가능

---

## 2주차

## 변수와 자료형

### 변수

- 데이터를 저장하는 메모리 공간을 구분하기 위해 사용하는 이름
- 메모리 주소 대신 이름을 사용하여 데이터를 저장 또는 참조하기 위해 메모리 공간에 접근 할 수 있음

### 변수명 작명 규칙

- 식별자(클래스, 변수, 상수, 메소드 등) 의 일종
- 작명 규칙
    - 유니코드 사용(한글 사용 가능
    - _ 및 $ 사용 가능
    - 첫 번째 숫자 사용불가
    - 자바 언어의 키워드 사용불가
    - 대소문자 구별
    - 길이 제한 없음

### 변수 선언

- 변수를 사용하기 위해 메모리에 사용할 공간을 확보하는 과정
- 형식 = 자료형 변수명
- 예제
    - int sum;
    - double area;

### 자료형

- 기본 자료형
    - 기본 데이터 타입은 크기는 CPU나 운영체제에 따라 변하지 않음
    - 논리형 : boolean
    - 문자형 : char
    - 정수형 : byte, short, int, long
    - 실수형 : float, double

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/303d7fdb-1bed-41db-b19b-9b750ae2be1c/Untitled.png)

- 참조 자료형
    - class에 대한 래퍼런스
    - 인터페이스에 대한 레퍼런스
    - 배열에 대한 레퍼런스
    - 기본형에 대한 레퍼런스

---

## 표현식과 연산자

```jsx
import java.util.Scanner;
	public class 원화환전 {
		public static void main(String [] args) {
		int 미화, 원화, 거스름돈;

		Scanner s = new Scanner(System.in);
		System.out.print("원화(원)? ");
		
		원화 = s.nextInt();
		미화 = 원화 / 1120;
		거스름돈 = 원화 - (미화 * 1120); -> **거스름돈 = 원화 % 1120;**
		System.out.println(원화 + "(원) => $" + 미화 + "(" + 거스름돈 + "원)");
	}
}
```

### 표현식

- 계산의 결과를 얻기 위한 계산식
- 연산자와 피연산자의 조합으로 주성
- 항상 계산 결과가 존재함

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c82f8be6-5225-4517-b3aa-0efa0e2d159f/Untitled.png)

### 연산자

| 구분  | 연산자 | 예 |
| --- | --- | --- |
| 산술연산자 | +, -, *, /, % | 5+2, 5-2, 5*2, 5/2 |
| 비교연산자 | >, <, >=, <=, ==, ≠ | 5<2, 5>=2, 5==2,5!=2 |
| 논리연산자 | &&, ||, !, ^ | (5>2)&&(5!=2), !(5>2) |
| 대입연산자 | =, +=, -=, *=, /= | sum=5+2, val+=5 |
| 증감연산자 | ++, — | num++, --num |
| 비트연산자 | &, |, ^, ~ | 127&63, 0b1111^0b1100 |
| 시프트연산자 | >>, <<, >>> | num>>2, num<<3 |

```jsx
public class 표현식 {
	public static void main(String [] args) {
		int 결과1;
		boolean 결과2, 결과3;

		결과1 = 3 + 5 / 2 - 1;
		결과2 = (13*4) == 30;
		결과3 = ((3<=5) && (9<4)) || (7>8);

		System.out.println(결과1);
		System.out.println(결과2);
		System.out.println(결과3);
	}
}
```

### 실습

- 사용자가 입력한 정수가 홀수면 false, 짝수면 true를 출력하는 프로그램을 작성하시

```jsx
import java.util.Scanner;
public class 홀수짝수 {
	public static void main(String args[]) {
		int 입력;
		boolean 결과;
		Scanner s = new Scanner(System.in);
		System.out.print("1개의 정수 입력? ");
		입력 = s.nextInt();
		s.close();
		**결과 = 입력%2==0;**
		System.out.println(입력 + ": " + 결과);
	}
}
```

### 연산자 정리

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e1d3ff0d-7e40-43dd-afa7-937624e19683/Untitled.png)

---

## 3주차

### 조건문 : if 구문

문제 : 등교 시간이 오전 9시 이전(미만)이면 “좋은 아침”이라고 출력하는프로그램을 작성하시오. 시간은 24시간제를 사용하여 하나의 숫자로 표시한다. 예를 들어, 720은 오전 7시 20분을 의미한다

```jsx
import java.util.Scanner;
public class 등교시간 {
	public static void main(String [] args) {
		int 시간;
		Scanner s = new Scanner(System.in);
		System.out.print("등교시간(08:30은 830으로 입력)? ");
		시간 = s.nextInt();
		s.close();
		/* add your code here */
		**if(시간 < 900) {
			System.out.println("좋은 아침");
	}**
}
```

- 상황에 따른 유연성 부여

두 가지 모두 출력(순차 구조) or 한 가지만 출력(조건 구조) 

```jsx
import java.util.Scanner;
public class 등교시간 {
	public static void main(String [] args) {
		int 시간;
		Scanner s = new Scanner(System.in);
		System.out.print("등교시간(08:30은 830으로 입력)? ");
		시간 = s.nextInt();
		s.close();

		if( 시간 < 900 ) {
			System.out.println( "좋은 아침" );
		}
		if( 시간 >= 900 ) {
			System.out.println( "지각" );
		}
	}
}
```

### if ~ else 구문

- 조건이 만족되지 않은 경우에 대한 실행 문장을 추가

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3ff5eb20-9566-453a-b635-038621536740/Untitled.png)

문제 : 등교 시간이 오전 9시 이후(이상)이면 “지각”, 오전 9시 이전(미만)이면 “좋은 아침”이라고 출력하는 프로그램을 작성하시오.
( 단, if ~ else 구문을 사용하시오.)

```jsx
import java.util.Scanner;
public class 등교시간 {
	public static void main(String [] args) {
		int 시간;
		Scanner s = new Scanner(System.in);
		System.out.print("등교시간(08:30은 830으로 입력)? ");

		시간 = s.nextInt();
		s.close();

		if( 시간 < 900 ) {
			System.out.println( "좋은 아침" );
		}
		if( 시간 >= 900 ) {
			System.out.println( "지각" );
		}
	}
}
```

문제 : 90이상이면 “A 등급”, 80이상이면 “B 등급”, 70이상이면 “C 등급”,70미만이면 “D 등급”을 출력하는 프로그램을 작성하시오.
(단, 기본형 if 구문만을 사용하시오) 

```jsx
import java.util.Scanner;
public class 등급 {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("점수? ");
		int 점수 = s.nextInt();
		s.close();
	
		if( 점수 >= 90 )
			System.out.println( "A 등급" );
		if( 점수 >= 80 )
			System.out.println( "B 등급" );
		if( 점수 >= 70 )
			System.out.println( "C 등급" );
		if( 점수 < 70 )
			System.out.println( "D 등급" );
		}
	}
}
```

```jsx
import java.util.Scanner;
public class 등급 {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("점수? ");
		int 점수 = s.nextInt();
		s.close();

		if( 90 <= 점수 <= 100 )
			System.out.println( "A 등급" );
		if( 80 <= 점수 < 90 )
			System.out.println( "B 등급" );
		if( 70 <= 점수 < 80 )
			System.out.println( "C 등급" );
		if( 점수 < 70 )
			System.out.println( "D 등급" );
	}
}
```

```jsx
import java.util.Scanner;

public class week_02_08 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수? ");
        int 정수 = s.nextInt();
        s.close();
        
        if( 정수 >= 1000 )
            System.out.println( "큰 수" );
        else if( 정수 >= 100 )
            System.out.println( "3자리 수" );
        else if( 정수 >= 10 )
            System.out.println( "2자리 수" );
        else if( 정수 >= 0 )
            System.out.println( "1자리 수" );
        else
            System.out.println( "음수" );
    }
        
}
```

---

## 반복문 : 순차구조를 반복구조로(1)

### 반복문

- 반복문(loop)의 기능
    - 조건을 만족하는 동안 일정한 문장들을 반복 실행하기 위한 구문
- 반복문 삼총사
    - while 구문
    - do ~ while 구문
    - for 구문

### while 구문

- 기본 원리

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c44756a5-0f17-4b45-945f-353a6ef37756/Untitled.png)

### for 구문

- 기본 원리

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/94e41153-1643-4f00-a4d0-6cf9cc9a5ca2/Untitled.png)

### for-each 구문

- 기본 원리

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cff83799-823d-48c7-9ed5-49a44a611529/Untitled.png)

```jsx
public static void main(String[] args)
    {
        int i = 0;
        while(i<10)
        {
            System.out.println("행복한 하루");
            i++;
        }
    }
```

```jsx
public static void main(String[] args)
    {
        int i = 0;
        for(int i = 0; i < 10; i++)
				{
					System.out.println( "행복한 하루" );
				}
    }
```

- 구구단 출력 하는 프로그램 작성

```jsx
public class 구구단역순출력 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("출력 단 입력 : ");
        int num = s.nextInt();
        s.close();

        for(int i = 9; i>0;i--)
        {
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bae9ddc3-551e-490c-add1-5edb667165e2/Untitled.png)

```jsx
public class week_02_11 {
    public static void main(String[] args)
    {
        String[] 과일들 = new String[]{"사과", "바나나", "딸기", "수박", "오렌지"};

        for(String f : 과일들){
            System.out.printf("%s\n", f);
        }
				int i = 0;
				while(i < 과일들.length){
					System.out.printf("%s\n", 과일들[i]);
					i++;
				}
				for(int i = 0; i < 과일들.length; i++){
					System.out.printf("%s\n", 과일들[i]);
				}
    }
}
```

- 4의 지수승 출력 프로그램

```jsx
public class week_02_10 {
     public static void main(String[] args)
     {
            int i = 1; 
            int a = 1;
            while(i < 10)
            {
                System.out.printf("4 ^ %d = ", i);
                for(int k = 0; k<i;k++)
                {
                    if(k==0){
                        System.out.printf("4");
                        a = 4;
                    }    
                    else{
                        System.out.printf("*4");
                        a = a*4;
                    }
                }
                System.out.printf(" = %d \n", a);
                i++;
            }
        }
    }
```

---

## 4주차

## 클래스와 객체

- 구조적 프로그래밍과 객체지향프로그래밍의 차이점을 설명할 수 있다
- 객체의 개념을 설명할 수 있다
- 추상화 개념을 설명할 수 있다
- 자바에서 클래스를 정의할 수 있다

### 구조적 프로그래밍

- 컴퓨터의 처리 작업을 일련의 작업(기능) 순서로 표현
- 함수들의 집합으로 프로그램 작성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/80011cda-9a0e-4be6-a8f0-132c5375ba3e/Untitled.png)

### 객체 지향 프로그래밍

- 클래스 또는 객체들의 집합으로 프로그램 작성
- 컴퓨터가 수행하는 작업을 객체간의 상호 작용으로 표현

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2fc25d1b-6cf1-492c-a2f3-2ca8ef3f6b60/Untitled.png)

### 객체(object)

- 컴퓨터 시스템에서 현실 세계의 사물이나 개념을 사용할 수 있도록 만든 소프트웨어 모델
- 속성, attributes, properties
    - 객체의 특성을 표현하는 정적인 요소
    - 자바에선 필드field 라고 함
- 행동 messages, behaviors
    - 객체 내부의 일을 처리 하거나 객체들간의 서로 영향을 주고 받는 동적인 행위를 처리
    - 자바에서 메소드라 함
    

### 추상화

- 현실 세계 객체에서 해결할 컴퓨터 프로그래밍 문제와 관련 있는 요소(측면) 만을 주목하여 설명하는 방식
    - 현실 세계의 객체에서 필요한 요소만을 찾아 클래스 생성
    - 속성과 행동으로 추상화 실현

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/177fe71f-efbd-4d0e-9fcb-c499c51673f6/Untitled.png)

- **필드**와 **메소드**를 **캡슐화**하여 **정보 은닉**하는 하는 과정
- 추상화를 통한 생성 결과물 → 객체(클래스)

### 캡슐화 encapsulation

- 객체 와 객체 간의 의사 소통을 위한 정보만을 노출
    - 내부의 자세한 구조나 속성 및 행동 방식은 외부로부터 숨김
- 추상화 과정에서 클래스를 정의할 떄
    - 객체의 속성과 행동을 클래스 단위로 하나로 묶고
    - 실제 내부 구현 내용은 감추는 것
- 캡슐화를 하는 이유
    - 객체의 내부구현이 변경되어도 객체를 사용하는 코드가 수정될 필요가 없음
    - 객체를 사용하는 코드는 의사소통에 필요한 내용만 알 수 있음

### 정보은닉  information hiding

- 사적 공간
- 공용 공간
- 공개 공간

⇒ 캡슐화 과정에서 클래스의 내부 구현을 숨김

### 요약

- 자바에서 추상화를 구현하기 위한 키워드는 **Class 및 Interface** 이다

### 클래스와 객체

- 클래스
    - 객체를 만들기 위한 틀 or 설계도
    - 객체를 만들려면 반드시 객체의 다양한 특성을 표현할 수 있는 모형인 클래스가 필요
- 객체(object)
    - 클래스의 구체적인 하나의 실례instance적 클래스
- 예 : 계좌(클래스) → 영수의 계좌(객체) , 붕어빵 틀(클래스) → 붕어빵(객체)

### 클래스 구성

접근 지시자, 키워드, 클래스 이름, 필드와 메소드 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/82212757-6522-4775-ac85-675e488ccef8/Untitled.png)

### 예제 1 : 원 클래스

```jsx
public class 원 {
    int 반지름; 
    String 이름;
 
    public double 면적계산() { 
        return 3.14*반지름*반지름;
    }
  public static void main(String[] args) {
        원 작은원; 
        작은원 = new 원(); 
        작은원.반지름 = 10;
        작은원.이름 = "동전"; 
        double 면적 = 작은원.면적계산();
        System.out.println(작은원.이름 + "의 면적은 " + 면적);
    }
}
```

⇒ 원 이라는 클래스를 만들고 객체로 작은 원 생성. 원 클래스의 필드는 반지름(int), 이름(String) 이 있고, 메소드에는 면적계산() 이 있다.

### 객체의 치환 ⇒ Swap 이 가능하다

```jsx
원 다른원;
다른원 = 작은원;
큰원 = 작은원; 
```

### 객체 생성과 소멸

- 객체 생성
    - new 연산자에 의해 객체 생성 → Heap 영역
- 객체 소멸
    - 객체 메모리를 자바 가상 기계에게 되돌려 주는 행위
    - 자바는 객체 (강제) 삭제 기능이 없다.

### 가비지 컬렉션(garbage collection)

- 더 이상 참조가 없는 객체 메모리를 가용 메모리에 포함하는 과정
- JVM의 가비지 컬렉터가 자동으로 가비지를 수집하여 반환
- 개발자에 의한 강제 가비지 컬렉션
    - System 또는 Runtime 객체의 gc() 메소드 호출 - System.gc()
    - 가비지 컬렉션을 요청할 수 있지만 가비지 컬렉션 시점은 JVM 에서 전적으로 판단함

```jsx
public class 책 {
    String 이름;
    String 저자;
    Boolean 대출중;
    
    public void 대여(){
        대출중 = true;
    }
    public void 반납(){
        대출중 = false;
    }
    public void 정보출력(){
        System.out.printf("책 이름 : %s, 저자 : %s, 대출 여부 : %s\n", 이름, 저자, 대출중);
    }
    public static void main( String[] args ) {
        책 책객체 = new 책();
        책객체.이름 = "명품 자바 에센셜";
        책객체.저자 = "황기태";
        책객체.대출중 = false;
        책객체.정보출력();
        책객체.대여();
        책객체.정보출력();
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/eeff8059-64c7-4789-b238-e36f15c5693e/Untitled.png)

### 접근 지시자 (access specifiers) - 중요!!!!

| default | 동일 패키지 내부 클래스에서 접근 가능 |
| --- | --- |
| private  | 정의된 클래스 내부에서만 접근 가능 |
| protected | - 동일 패키지 내부 클래스에서 접근 가능
- 상속 관계의 서브 클래스에서 접근 가능 |
| public | 패키지 내-외부 클래스에서 접근 가능 |

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/880f56a9-b0dc-4455-b54c-fb57782ec93a/Untitled.png)

---

## 메소드(1)

- 영화 클래스 정의

```jsx
import java.time.LocalDateTime;

public class Movie {
    String 이름;
    LocalDateTime 상영시간;
    int 잔여석;
    int 가격;

    void 예매(){
        잔여석--;
        System.out.println("예매가 완료되었습니다.");
    }

    void 정보출력(){
        System.out.printf("영화 이름 : %s, 상영 시간 : %s, 잔여석 : %d, 가격 : %d\n", 이름, 상영시간, 잔여석, 가격);
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.이름 = "라라랜드";
        movie.가격 = 15000;
        movie.잔여석 = 50;
        movie.상영시간 = LocalDateTime.of(2023, 2, 6, 10, 50);
        movie.예매();
        movie.정보출력();
    }
}
```

- 티켓 클래스 정의
    - 티켓.java

```jsx
import java.time.LocalDateTime;

public class 티켓 {
    String 영화이름;
    LocalDateTime 상영시간;
    int 가격;
    int 인원수;

    void 정보출력(){
        System.out.printf("영화 이름: %s, 상영시간: %s, 가격: %d, 인원수: %d\n", 영화이름, 상영시간, 가격, 인원수);
    }
}
```

- 영화.java

```jsx
import java.time.LocalDateTime;

public class 영화 {
    String 이름;
    LocalDateTime 상영시간;
    int 잔여석;
    int 가격;

    티켓 예매(int 인원수){
        if (잔여석 < 인원수) {
            System.out.println("죄송합니다. 잔여석이 부족합니다.");
            return null;
        }

        잔여석 -= 인원수;

        티켓 ticket = new 티켓();
        ticket.영화이름 = 이름;
        ticket.상영시간 = 상영시간;
        ticket.가격 = 가격 * 인원수;
        ticket.인원수 = 인원수;

        System.out.println("예매가 완료되었습니다.");
        return ticket;
    }

    void 정보출력(){
        System.out.printf("영화 이름 : %s, 상영 시간 : %s, 잔여석 : %d, 가격 : %d\n", 이름, 상영시간, 잔여석, 가격);
    }

    public static void main(String[] args) {
        영화 movie = new 영화();
        movie.이름 = "라라랜드";
        movie.가격 = 15000;
        movie.잔여석 = 50;
        movie.상영시간 = LocalDateTime.of(2023, 2, 6, 10, 50);

        티켓 ticket = movie.예매(2);
        if (ticket != null) {
            ticket.정보출력();
        }
        movie.정보출력();
    }
}
```

- 유저 클래스 정의
    - User.java
    
    ```jsx
    public class User {
        String 이름;
        String 전화번호;
        Ticket 티켓;
        int 잔액;
    
        void 예매(Movie movie, int 인원수) {
            if (잔액 < movie.가격 * 인원수) {
                System.out.println("잔액이 부족합니다.");
                return;
            }
    
            티켓 = movie.예매(인원수);
            if (티켓 != null) {
                잔액 -= 티켓.가격;
                System.out.println("예매가 완료되었습니다.");
            }
        }
    
        void 정보출력() {
            System.out.println("이름: " + 이름);
            System.out.println("전화번호: " + 전화번호);
            System.out.println("잔액: " + 잔액);
            if (티켓 != null) {
                System.out.println("예매 정보:");
                티켓.정보출력();
            } else {
                System.out.println("예매한 내역이 없습니다.");
            }
        }
    
        public static void main(String[] args) {
            Movie movie = new Movie();
            movie.이름 = "라라랜드";
            movie.가격 = 15000;
            movie.잔여석 = 50;
            movie.상영시간 = LocalDateTime.of(2023, 2, 6, 10, 50);
    
            User user = new User();
            user.이름 = "홍길동";
            user.전화번호 = "010-0000-1111";
            user.잔액 = 100000;
    
            user.예매(movie, 2);
            user.정보출력();
        }
    }
    ```
    
    - 영화.java
    
    ```jsx
    import java.time.LocalDateTime;
    
    public class 영화 {
        String 이름;
        LocalDateTime 상영시간;
        int 잔여석;
        int 가격;
    
        티켓 예매(int 인원수){
            if (잔여석 < 인원수) {
                System.out.println("죄송합니다. 잔여석이 부족합니다.");
                return null;
            }
    
            잔여석 -= 인원수;
    
            티켓 ticket = new 티켓();
            ticket.영화이름 = 이름;
            ticket.상영시간 = 상영시간;
            ticket.가격 = 가격 * 인원수;
            ticket.인원수 = 인원수;
    
            System.out.println("예매가 완료되었습니다.");
            return ticket;
        }
    
        void 정보출력(){
            System.out.printf("영화 이름 : %s, 상영 시간 : %s, 잔여석 : %d, 가격 : %d\n", 이름, 상영시간, 잔여석, 가격);
        }
    
        public static void main(String[] args) {
            영화 movie = new 영화();
            movie.이름 = "라라랜드";
            movie.가격 = 15000;
            movie.잔여석 = 50;
            movie.상영시간 = LocalDateTime.of(2023, 2, 6, 10, 50);
    
            티켓 ticket = movie.예매(2);
            if (ticket != null) {
                ticket.정보출력();
            }
            movie.정보출력();
        }
    }
    ```
    
    - 티켓.java
    
    ```jsx
    import java.time.LocalDateTime;
    
    public class 티켓 {
        String 영화이름;
        LocalDateTime 상영시간;
        int 가격;
        int 인원수;
    
        void 정보출력(){
            System.out.printf("영화 이름: %s, 상영시간: %s, 가격: %d, 인원수: %d\n", 영화이름, 상영시간, 가격, 인원수);
        }
    }
    ```
    

### 메소드, method

- 모든 메소드는 반드시 클래스 안에 위치해야함(캡슐화)
- 접근 지시자(access specifiers)
    - public, private, protected
    - default - 접근 지시자를 생략한 경우

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/89d56d10-3534-42dc-a934-ec889b1d79ca/Untitled.png)

---

## 메소드(2)

- 접근 지시자의 역할
- Getter 와  Setter 의 역할
- 인자 전달 방식을 구분
- 오버로딩의 개념

### 메소드, method

- 모든 메소드는 반드시 클래스 안에 위치해야한다 (캡슐화)
- 접근 지시자 (access specifiers)
    - public, private, protected
    - default - 접근 지시자 생략한 경우

### 접근 지시자 - 중요!!

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/85a6015e-86fd-4d4a-967a-509d8b6e3bf3/Untitled.png)

동일 패키지 가능 default, protected, public

다른 패키지 가능 public 

- default : 동일 패키지 내부 클래스 에서 접근 가능
- private : 정의된 클래스 내부에서만 접근 가능
- protected : 동일 패키지의 내부 클래스는 접근 가능, 상속 관계 서브 클래스에서 접근 가능
- public : 패키지 내-외부 클래스에서 접근 가능

### 클래스의 정의

- 하나의 파일에서 클래스는 여러 개 존재 할 수 있음
- 하나의 파일에서 public 클래스는 2개 이상 존재할 수 없음
- public 클래스의 이름은 파일 이름과 동일해야함

- 간단한계산기사용.java

```jsx
class 간단한계산기 {
    int 입력1, 입력2;

    public int 덧셈( ) {
        int 결과;
        결과 = 입력1 + 입력2;
        return 결과;
    }
}
public class 간단한계산기사용 {
    public static void main(String [] args) {
        간단한계산기 객체;
        객체 = new 간단한계산기();
        객체.입력1 = 3;
        객체.입력2 = 4;
        int 결과 = 객체.덧셈( );
        System.out.printf("%d + %d = %d \n",객체.입력1, 객체.입력2, 결과);
    }
}
```

→ **Public 클래스의 이름**은 java파일의 **파일명**과 동일!

### Gettter, Setter

- 필드를 private 로 수정하면 오류가 발생한다.
- 왜? Private으로 수정하면 다른 객체에서 필드에 직접 접근이 불가능하기 때문이다
- 자바에서는 Getter 및 Setter 를 사용해 필드 값을 가져오거나 변경이 가능하다.

### 예시)

```jsx
public class User {
    private String 이름;
    private String 전화번호;
    private 티켓 티켓;
    private int 잔액;

    public void 예매(Movie movie, int 예약인원) {
        티켓 ticket = movie.예매(예약인원);
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

    public 티켓 get티켓() {
        return 티켓;
    }

    public void set티켓(티켓 티켓) {
        this.티켓 = 티켓;
    }

    public int get잔액() {
        return 잔액;
    }

    public void set잔액(int 잔액) {
        this.잔액 = 잔액;
    }
}
```

### 인자 전달 방식

- 기본 타입의 값을 전달하는 경우 → Call by VALUE
    - 값이 복사되 어 전달 (값 기반 함수 호출)
- 객체 또는 배열을 전달하는 경우 → Call by REFERENCE
    - 참조가 전달 (참조 기반 함수 호출)

### Call by VAULE

```jsx
public class 테스트 {
    public static void main(String[] args) {
        int 값 = 7;
        값 = 증가(값);
        System.out.printf("값: %d \n", 값);
    }

    static int 증가(int 값) {
        값 += 1;
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/91735903-c47c-482b-acad-e9c64dfa658a/Untitled.png)

⇒ 값이 변경되지 않음 

### Call by REFERENCE : 객체

```jsx
class 원 {
    public int 반지름;
}

public class 테스트 {
    public static void main(String[] args) {
        원 객체 = new 원();
        객체.반지름 = 5;
        증가(객체);
        System.out.printf("값: %d \n", 객체.반지름);
    }

    static void 증가(원 객체) {
        객체.반지름 += 1;
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/225c141e-947c-4c41-9295-73bd11150a91/Untitled.png)

⇒ 객체를 넘겨주어 객체의 필드 값을 변경했기 때문에 값이 변경 된다.

### Call by REFERENCE : 배열

```jsx
public class 테스트 {
    public static void main(String[] args) {
        int[] 배열 = { 1, 2, 3, 4, 5 };
        증가(배열);
        for (int n = 0; n < 배열.length; n++) {
            System.out.printf("[%d] %d \n", n, 배열[n]);
        }
    }

    static void 증가(int[] 배열) {
        for (int n = 0; n < 배열.length; n++) {
            배열[n] += 1;
        }
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ed69516a-17a5-4697-8ef1-8871266909bd/Untitled.png)

⇒ 메소드 인자로 int 형 배열을 넘겨 주었기 때문에 배열 내 값이 변경 된다.

### 오버로딩 : overloading

- 메소드 중복 정의
    - 한 클래스 내에서 이름이 같은 두 개 이상의 메소드 정의
- 시그니처 변경
    - 매개변수의 개수, 자료형, 순서가 상이해야함
    - 반환형만 다른 경우에는 해당하지 않음

```jsx
public class 간단한계산기 {
    public int 덧셈(int 입력1, int 입력2) {
        int 결과;
        결과 = 입력1 + 입력2;
        return 결과;
    }

    public double 덧셈(double 입력1, double 입력2) {
        double 결과;
        결과 = 입력1 + 입력2;
        return 결과;
    }

    public static void main(String[] args) {
        간단한계산기 객체;
        객체 = new 간단한계산기();
        int 정수결과 = 객체.덧셈(3, 4);
        double 실수결과 = 객체.덧셈(3.5, 4.7);
        System.out.printf("%d + %d = %d \n", 3, 4, 정수결과);
        System.out.printf("%f + %f = %f \n", 3.5, 4.7, 실수결과);
    }
}
```

⇒ **`덧셈()`**메서드는 int 타입과 double 타입을 모두 처리할 수 있도록 오버로딩 되었다.

---

## 생성자

- 생성자의 역할을 설명할 수 있다
- 생성자를 정의할 수 있다.

### this 레퍼런스

- 현재 객체 자기 자신을 가르킴
    - 같은 클래스 내에서 클래스 멤버, 변수를 접근할 때 객체 이름을 생략하면 묵시적으로 this 로 가정한다.

```jsx
class Point {
	private int x, y;
	public Point(int a, int b){
		x = a;
		y = b;
	}
	. . .
}
```

```jsx
class Point {
	private int x, y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	. . .
}
```

### 생성자, Constructor

- 클래스 이름과 동일한 특수 메소드
- new 연산자에 의해 객체가 생성될 때 자동으로 실행
- 오버로딩 가능
- 반환형 없음
- 반드시 하나 이상 정의되어야함
    - 개발자가 생성자를 정의하지 않으면 컴파일러에 의해 자동으로 기본 생성자가 정의됨

```java
public class 원 {
    int 반지름;
    String 이름;

    public double 면적계산() {
        return 3.14 * 반지름 * 반지름;
    }

    public static void main(String[] args) {
        원 작은원;
        **작은원 = new 원(); // => public 원() {}**
        작은원.반지름 = 10;
        작은원.이름 = "동전";
        double 면적 = 작은원.면적계산();
        System.out.println(작은원.이름 + "의 면적은 " + 면적);
    }
}
```

### 실습

- User 클래스에 기본 생성자 추가하기

```java
public class User {
    private String 이름;
    private String 전화번호;
    private Ticket 티켓;
    private int 잔액;

    **public User() {
        this.이름 = "손님";
        this.잔액 = 0;
        this.전화번호 = "010-0000-1111";
    }**
//...중략..
}
```

- User 클래스에 기본 생성자 외에 생성자 하나 더 추가

```java
public class User {
    private String 이름;
    private String 전화번호;
    private Ticket 티켓;
    private int 잔액;

    public User() {
        this.이름 = "손님";
        this.잔액 = 0;
        this.전화번호 = "010-0000-1111";
    }

    **public User(String 이름, String 전화번호, int 잔액) {
        this.이름 = 이름;
        this.전화번호 = 전화번호;
        this.잔액 = 잔액;
    }**
//...중략...//
}
```

### this()

- 생성자에서 다른 생성자 호출
- 생성자 내에서만 사용 가능
- 반드시 생성자 코드의 제일 처음에 수행해야함

```java
public class User {
    private String 이름;
    private String 전화번호;
    private Ticket 티켓;
    private int 잔액;

    public User() {
        this("손님", "010-0000-1111", 0);
    }

    public User(String 이름, String 전화번호, int 잔액) {
        **this.이름 = 이름;
        this.전화번호 = 전화번호;
        this.잔액 = 잔액;**
    }
}
```

```java
class rectangle {
  private int x, y, width, height;
  
  public rectangle() {
    x = y = 0;
    width = height = 1;
  }
  
  public rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    
    if (width > 0) {
      this.width = width;
    } else {
      System.out.println("사각형 가로 길이는 음수가 될 수 없습니다.");
      this.width = 1;
    }
    
    if (height > 0) {
      this.height = height;
    } else {
      System.out.println("사각형의 세로 길이는 음수가 될 수 없습니다.");
      this.height = 1;
    }
  }
  
  public void set(int x, int y, int width, int height) {
    if (width < 0 || height < 0) {
      System.out.println("사각형 크기는 음수가 될 수 없습니다.");
    } else {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
    }
  }
  
  public int 면적() {
    int 면적 = width * height; // 면적 계산
    return 면적;
  }
  
  public void printInfo() {
    System.out.printf("좌표: (%d, %d), 크기: (%d, %d), ", x, y, width, height);
    System.out.printf("면적: %d \n", 면적());
  }
  
  public boolean equals(rectangle x) {
    // 두 사각형의 가로와 세로 길이가 동일하면 같은 사각형으로 인정
    // 회전된 경우도 동일한 사각형으로 처리 가능
    if ((this.width == x.width) && (this.height == x.height))
      return true;
    else
      return false;
  }
}
public class rectangleTest {
  public static void main(String[] args) {
    rectangle r = new rectangle();
    rectangle s = new rectangle(1, 2, 10, 15);
    
    r.printInfo();
    s.printInfo();
    
    System.out.println(s.면적());
    
    r.set(-3, 2, -1, 4);
    r.printInfo();
    
    if (r.equals(s))
      System.out.println("두 사각형은 같습니다.");
    else
      System.out.println("두 사각형은 다릅니다.");
  }
}
```

---

## 5주차

## Static 멤버

- Static 멤버의 특성

```java
import java.util.Scanner;

public class 홀짝판정 {
    public boolean checkEven(int num) {
        return ((num % 2) == 0);
    }

    public static void main(String args[]) {
        int 입력;
        boolean 결과;

        Scanner s = new Scanner(System.in);
        System.out.print("1개의 정수 입력? ");

        입력 = s.nextInt();
        s.close();
        
        if (checkEven(입력))
            System.out.println(입력 + ": 짝수");
        else
            System.out.println(입력 + ": 홀수");
    }
}
```

⇒ 오류, checkEven 메서드를 호출할 때 클래스 이름인 홀짝판정을 붙이지 않음

- 방법1, 객체 하나 만들기

```java
홀짝판정 obj = new 홀짝판정();
        if (obj.checkEven(입력))
            System.out.println(입력 + ": 짝수");
        else
            System.out.println(입력 + ": 홀수");
    }
```

- 방법2,  Static 활용

```java
import java.util.Scanner;

public class 홀수짝수 {
    public **static** boolean checkEven(int num) { <<< Static 사용
        return ((num % 2) == 0);
    }

    public static void main(String args[]) {
        int 입력;
        boolean 결과;
        Scanner s = new Scanner(System.in);
        System.out.print("1개의 정수 입력? ");
        입력 = s.nextInt();
        s.close();
        
        if (checkEven(입력))
            System.out.println(입력 + ": 짝수");
        else
            System.out.println(입력 + ": 홀수");
    }
}
```

⇒ 에러 없이 동작함.

### 정적static 멤버의 활용

- **전역 변수와 전역 함수**를 만들 때 사용
- **공유 멤버**를 만들고자 할 때
    - static 으로 선언한 멤버는 클래스의 객체들이 공유함

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9835e1c3-16e3-4ad8-a13f-4d524d72a75a/Untitled.png)

⇒ 정적(static) 멤버들은 클래스에 속한 전역 변수 또는 함수처럼 사용될 수 있으며, 객체를 생성하지 않아도 클래스 이름을 통해 직접 접근할 수 있다

```java
정적(static) 멤버는 객체가 생성되기 전 클래스에 미리 할당되는 멤버로, 
객체를 생성하지 않아도 클래스 이름을 통해 직접 접근할 수 있습니다. 
이러한 특징으로 인해 정적 멤버는 객체 간의 데이터를 공유할 수 있습니다. 
이를 "공유 멤버"라고 합니다.

공유 멤버의 가장 대표적인 예시는 전역 변수(global variable)입니다. 
전역 변수는 모든 객체에서 공유되는 변수로, 
클래스 내에서 static 키워드를 사용하여 정적 멤버로 선언할 수 있습니다. 
이렇게 선언된 전역 변수는 클래스의 모든 객체가 공유하게 되므로, 
한 객체에서 값을 변경하면 다른 객체에서도 그 값을 참조할 수 있습니다.

또한, 공유 멤버로 선언된 정적 메서드(static method)는 객체가 생성되지 않아도 
클래스 이름을 통해 호출할 수 있습니다. 
이러한 특성으로 인해 유틸리티 함수, 상수 등을 구현하는 데 유용하게 사용됩니다.

공유 멤버를 사용하면, 객체 간의 데이터 공유가 용이해지고 메모리 
사용을 줄일 수 있습니다. 그러나 이러한 장점들에도 불구하고, 
정적 멤버의 과용은 의존성과 결합도를 높이며 객체 지향적인 설계와 
구현을 방해할 수 있으므로, 적절하게 사용해야 합니다.
```

### 정적 static 메소드의 제약 조건

- static 멤버만 접근 가능
    - 객체가 생성되지 않은 상황에서도 사용이 가능하므로 객체에 속한 비정적 멤버에 대한 접근 불가
    - 비정적 메소드는 정적 멤버들을 모두 사용 가능
- this 키워드를 사용할 수 없음
    - 객체가 생성되지 않은 상황에서도 호출이 가능하기 때문에 현재 실행 중인 객체를 가리키는 this 레퍼런스를 사용할 수 없음

```java
public class 구구단 {
	static int 출력단;
	String 이름;
	public void 정보() {
	    **System.out.println("단: " + 출력단); // 정적 멤버 접근 가능
	    System.out.println(이름); // 비정적 멤버 접근 가능**
	}
	
	public static void 출력() {
	    int n;
	    **System.out.println(이름); // 비정적 멤버 접근 불가**
	    **정보(); // 비정적 멤버 접근 불가**
	    for(n=1; n<10; n++) {
	        System.out.printf("%d * %d = %d \n", 출력단, n, 출력단*n);
	    }
	}
}
```

⇒ 오류가 발생한다. 

**`정보()`** 메서드에서는 정적(static) 멤버인 **`출력단`** 변수에 접근할 수 있지만, **`출력()`** 메서드에서는 인스턴스 멤버인 **`이름`** 변수에 접근할 수 없습니다. 이유는 인스턴스 멤버는 객체가 생성된 후에 사용 가능한 반면, 정적 멤버는 클래스가 로딩되면서 생성되므로 객체를 생성하지 않고도 사용 가능하기 때문입니다.

따라서, **`출력()`** 메서드에서 **`이름`** 변수를 사용하려면 인스턴스 변수가 아닌 매개변수로 전달하거나, **`static`**으로 선언해야 합니다.

## 배열과 열거형

- 1~10 사이의 정수를 각 변수에 저장

```java
int [] 정수배열;
정수배열 = new int[10]; 

int n;
for( n=0; n<10; n+=1 ) {
	정수배열[n] = n;
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/02d7bd6f-76ab-4f93-a609-f87de1ff8158/Untitled.png)

### 1차원 배열 생성

- 배열 생성 예시

```java
int [] 정수배열;
정수배열 = new int[10];

char [] 문자배열;
문자배열 = new char[20];

float [] 실수배열; 
실수배열 = new float[5];

int [] 정수배열 = new int[10];
Char [] 문자배열 = new char[20];
Float [] 실수배열 = new float[5];

int 정수배열 [] = new int[10];
char 문자배열 [] = new char[20];
float 실수배열 [] = new float[5];
```

- 선언 및 초기화

```java
int [] 정수배열 = {0,1,2,3,4,5,6,7,8,9};

int 정수배열[5]; // 오류
```

```java
int [] 정수배열; // 
정수배열 = new int[5]; // 
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/84da9a4f-8ebe-4b45-89a6-565d7a75ca42/Untitled.png)

### 배열 원소 접근

```java
int [] 정수배열 = new int[5]; // 인덱스 0~4 가능
정수배열[0] = 5; // 원소 0에 5 저장
정수배열[3] = 6; // 원소 3에 6 저장
int n = 정수배열[3]; // 원소 3의 값을 읽어 n에 저장

//오류
int n = 정수배열[-2]; // 인덱스로 음수 사용 불가
int m = 정수배열[5]; // 5는 인덱스의 범위(0~4) 초과
```

### 배열 길이 확인 - length 사용

```java
int [] 정수배열 = new int[5]; 
int n;
for( n=0; n<정수배열.length; n+=1 ) {
	정수배열[n] = n;
}
```

### 실습

- 사용자로부터 5개의 정수를 입력 받아 합산 결과와 평균을 출력하시오

```java
import java.util.Scanner;

public class 합산평균계산 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] 입력배열 = new int[5];
		int 합산 = 0;
		double 평균 = 0.0;
    for (int n = 0; n < 입력배열.length; n++) {
        System.out.print("정수 입력? ");
        입력배열[n] = in.nextInt();
    }
    
    for (int n = 0; n < 입력배열.length; n++) {
        합산 += 입력배열[n];
    }
    
    평균 = (double) 합산 / 입력배열.length;
    System.out.println("합산 결과: " + 합산);
    System.out.println("평균: " + 평균);
    
    in.close();
}
```

### for-each 구문

```java
int[] num = { 1,2,3,4,5 };
int sum = 0;
**for (int k : num)** {
	sum += k;
}
System.out.println("합은 " + sum);
=> 합은 15

String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };
**for (String s : names)** {
	System.out.print(s + " ");
}
=> 사과 배 바나나 체리 딸기 포도
```

### 2차원 배열 생성

```java
int [][] 정수배열;
정수배열 = new int[3][5];
char [][] 문자배열;
문자배열 = new char[7][20];
float [][] 실수배열;
실수배열 = new float[5][8];
```

```java
int [][] 정수배열 = new int[3][5];
char [][] 문자배열 = new char[7][20];
float [][] 실수배열 = new float[5][8];

int 정수배열 [][] = new int[10][5];
char 문자배열 [][] = new char[7][20];
float 실수배열 [][] = new float[5][8];
```

- 선언 및 초기화

```java
int [][] 정수배열 = {{0,1,2},{3,4,5},{6,7,8}};
```

- 2차원 배열의 length 필드

```java
int [][] 정수배열 = new int[3][5];
```

- 정수배열.length ⇒ 행의 개수이며 3
- 정수배열[n].length ⇒ n번째 행의 열 개수
    - 정수배열[0].length ⇒ 0번째 행의 열의 개수 5

### 실습1 - 5명의 학생의 7과목의 점수를 랜덤으로 생성하고 합계와 평균을 구하시오.

```java
import java.util.Random;

public class 학생성적 {

    public static void main(String[] args) {
        int[][] scores = new int[5][7]; // int[학생수][과목수]
        int[] sum = new int[scores.length]; // 합계
        double[] avg = new double[scores.length]; // 평균

        // 5명의 학생에게 7과목 점수 랜덤 생성
        Random rand = new Random();
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = rand.nextInt(101);
            }
        }

        // 각 학생의 합계, 평균 구하고 출력하기
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                sum[i] += scores[i][j];
            }
            avg[i] = (double) sum[i] / scores[i].length;
            System.out.println((i + 1) + "번 학생의 점수의 합계는 " + sum[i] + "점, 평균은 " + avg[i] + "점입니다.");
        }
    }
}
```

### 실습2 - 정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수) 정수배열을 생성하고, 이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라. 배열에는 같은 수가 없도록 하고 배열을 출력하라

```java
import java.util.Scanner;
import java.util.Random;

public class 정수배열 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("저장할 정수의 개수를 입력하세요(100보다 작은 수): ");
        int n = in.nextInt();
        while (n > 100) {
            System.out.print("100보다 작은 수를 입력하세요: ");
            n = in.nextInt();
        }

        int[] arr = new int[n];
        boolean[] check = new boolean[101]; // 중복 확인을 위한 배열

        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(100) + 1; // 1부터 100까지 범위의 난수 생성
            while (check[num]) { // 중복된 수가 있으면 다시 난수 생성
                num = rand.nextInt(100) + 1;
            }
            arr[i] = num; // 중복된 수가 없으면 배열에 저장
            check[num] = true; // 해당 수를 사용했음을 표시
        }

        System.out.print("배열: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        in.close();
    }
}
```

### 열거형 이해

- 일부 한정된 값만을 가지는 경우 사용하는 자료형
    - 월 화 수 목 금 토 일
    - 봄 여름 가을 겨울

Week.java

```java
public enum Week {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
```

WeekTest.java

```java
public class WeekTest {
Week today;
today = null;
today = Week.FRIDAY;
. . .
}
```

### 열거 객체의 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4edf66f6-e07b-4e58-9daf-8fe65015d9e4/Untitled.png)

```java
public static void main(String[] args) {
        Week today = Week.FRIDAY;
        Week tomorrow = Week.SATURDAY;

        String day = today.name(); // "FRIDAY" 반환
        int ordinal = today.ordinal(); // 4반환
        int diff1 = today.compareTo(tomorrow); // -1 반환
        int diff2 = tomorrow.compareTo(today); // 1 반환
        Week weekend = Week.valueOf("SUNDAY"); // Week.SUNDAY
        Week[] days = Week.values();
        for (Week d : days) {
            System.out.println(d);
        }
    }
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5d834169-9a87-4486-96fb-2d8a8eeaaba7/Untitled.png)

## 예외처리

### 예외, exception

- 오류error : 문법적 오류 및 논리적 오류
- 실행 중 발생하는 논리적 에러는 컴파일러가 알 수 없음
- 자바에서 실행 오류를 예외로 처리한다
- 응용프로그램에서 예외로 처리하지 않으면 프로그램은 강제 종료된다.

- 어떻게 처리하는 가?
    - try  ~ catch ~ finally
    - 상위 메소드로 전달 (throws)
    
    ```java
    import java.util.Scanner;
    public class ExceptionExample1 {
    	public static void main (String[] args) {
    		Scanner s = new Scanner(System.in);
    
    		System.out.print("분자 입력: ");
    		int 분자 = s.nextInt();
    		System.out.print("분모 입력: ");
    		int 분모 = s.nextInt();
    
    		System.out.println(분자+ "/" + 분모 + "의 몫: "+ 분자/분모);
    		s.close();
    	}
    }
    ```
    
    → 실행결과
    
    ```java
    나뉨수를 입력하시오:100
    나눗수를 입력하시오:0
    Exception in thread "main" java.lang.ArithmeticException: / 
    by zero at ExceptionExample1.main(ExceptionExample1.java:11)
    ```
    
    ### try-catch-finally 문
    
    ```java
    try {
    	예외가 발생할 가능성이 있는 실행문 
    	(try 블록)
    }
    catch (처리할 예외 타입 선언){
    	예외 처리문
    	(catch 블록)
    }
    finally{ //생략 가능
    	예외 발생 여부와 무관하게 항상 실행되는 문장
    	(finally 블록)
    }
    ```
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8f4685cc-a92f-4ad6-90f6-dcd92006bfc2/Untitled.png)
    

### throw :: 상위 메소드로 예외 전달

- throws 키워드는 메서드 레벨에서 사용하며, 메서드 안에서 발생한 오류를 메서드 안에서 잡지 않고, 메서드를 호출한 상위 메서드에서 잡겠다는 것을 의미하는 키워드이다

```java
public static void main(String[] args){
	try{
		File file = new File(“…”);
	}catch(IOException e){ … }
}

File() throws IOException{
// …
}
```

- File() 메서드(생성자) 가 IOException 을 throws 했기 때문에 File() 메서드를 호출한 main 에서 IOException을 잡아줘야한다

### Exception vs RuntimeException

- 자바에서는 Checked Exception 과 UnChecked Exception 이 존재함
- Unchecked Exception 은 RuntimeException 을 상속한 Exception 이고, 나머지는 모두 Checked Exception 이다
- Checked Exceoption 과 다르게  UnChecked Exception 은 컴파일 단계에서 반드시 예외처리를 해줄 필요가 없음

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c2d699d5-7159-4ed0-9f03-b26c586735c9/Untitled.png)

### Custom Exception

- 자바에서 Exception을 커스터마이징해서 사용이 가능하다
- 예외를 발생 시킬 때 표준 예외로 예외를 표현하기 어려운 때 사용한다
- SoldOutException.java

```java
public class SoldOutException extends RuntimeException{
    public SoldOutException(String message) {
    super(message);
    }
}
```

- Movie.java

```java
public class Movie {
    public Ticket 예매(int 예약인원) throws SoldOutException{
    
        if(잔여석- 예약인원 < 0) throw new SoldOutException("잔여석이 부족합니다.");
        잔여석-= 예약인원;
        Ticket ticket = new Ticket();
        ticket.set인원수(예약인원);
        ticket.set이름(this.이름);
        ticket.set상영시간(this.상영시간);
        ticket.set가격(this.가격 * 예약인원);
        System.out.println("예매가 완료되었습니다.");
        return ticket;
    }
}
```

### 실습

- PaymentException.java

```java
public class PaymentException extends RuntimeException{
	public PaymentException(String message) {
		super(message);
		}
}
```

- User.java

```java
public class User {
	// … 중략 …
	public void 예매(Movie movie, int 예약인원){
		Ticket ticket = movie.예매(예약인원);
		티켓 = ticket;
		if(잔액 - ticket.get가격() < 0){
			throw new PaymentException("잔액이 부족합니다.");
		}
			잔액 -= ticket.get가격();
		}
		// … 중략 …
}
```

- Main.java

```java
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
		user.set잔액(100000);
		user.예매(movie, 2);
		user.정보출력(); 

	}catch(PaymentException e){ e.printStackTrace();}
}
```

## 패키지package

### 패키지

- 연관된 클래스 파일(.class)들을 하나의 디렉토리에 묶어 놓은 것
- 하나의 응용프로그램은 여러 개의 패키지로 구성 가능
- 패키지는 jar 파일로 압축 할 수 있다
    - JDK에서 제공하는 표준 패키지는 rt.jar 에 압축

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b3e0ca4d-3068-4dea-8453-a0f0768594fe/Untitled.png)

### 주요 패키지

- java.lang
    - 자바 language 패키지
    - 자동으로 import
- java.util
    - 자바 유틸리티 패키지
    - 날짜, 시간, 벡터, 해쉬 테이블 등
- java.io
- java.awt
- javax.swing

### 패키지 오류 예시

- 원.java

```java
package 모양;
public class 원 {
	int 반지름;
	String 이름;
	public double 면적계산() {
	return 3.14*반지름*반지름;
	}
}
```

- 사각형.java

```java
package 모양;
public class 사각형 {
	int 너비, 높이;
	String 이름;
	public int 면적계산() {
		return 너비*높이;
	}
}
```

- 모양테스트.java

```java
package 모양테스트;
import 모양.원;
import 모양.사각형;

public class 모양테스트 {
    public static void main(String[] args) {
        원 원객체;
        원객체 = new 원();
        원객체.반지름 = 10; // 오류
        원객체.이름 = "동전"; // 오류
        double 원면적 = 원객체.면적계산();
        System.out.println("원면적: " + 원면적);
        
        사각형 사각객체;
        사각객체 = new 사각형();
        사각객체.너비 = 8; // 오류
        사각객체.높이 = 7; // 오류
        사각객체.이름 = "메모지"; // 오류
        int 사각면적 = 사각객체.면적계산();
        System.out.println("사각면적: " + 사각면적);
    }
}
```

⇒ 오류 가 발생한다 해결 방법은?

- 생성자를 사용한 필드 값 설정
- setter 및 getter 를 사용한 필드 값 설정 및 읽기
- 접근 지시자 종류 변경 → public(권장하지 않음)

해결한 코드

- 원.java

```java
package 모양;
public class 원 {
    private int 반지름;
    private String 이름;

    public int get반지름() {
        return 반지름;
    }

    public void set반지름(int 반지름) {
        this.반지름 = 반지름;
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public double 면적계산() {
        return 3.14 * 반지름 * 반지름;
    }
}
```

- 사각형.java

```java
package 모양;
public class 사각형 {
    private int 너비, 높이;
    private String 이름;

    public int get너비() {
        return 너비;
    }

    public void set너비(int 너비) {
        this.너비 = 너비;
    }

    public int get높이() {
        return 높이;
    }

    public void set높이(int 높이) {
        this.높이 = 높이;
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public int 면적계산() {
        return 너비 * 높이;
    }
}
```

- 모양테스트.java

```java
package 모양테스트;
import 모양.원;
import 모양.사각형;

public class 모양테스트 {
    public static void main(String[] args) {
        원 원객체 = new 원();
        원객체.set반지름(10);
        원객체.set이름("동전");
        double 원면적 = 원객체.면적계산();
        System.out.println("원면적: " + 원면적);

        사각형 사각객체 = new 사각형();
        사각객체.set너비(8);
        사각객체.set높이(7);
        사각객체.set이름("메모지");
        int 사각면적 = 사각객체.면적계산();
        System.out.println("사각면적: " + 사각면적);
    }
}
```

### 패키지의 특징

- 클래스 파일의 관리가 쉬워짐
- 패키지별 접근 제한
    - default 접근자 : 동일 패키지 내의 클래스에 대한 접근 허용
- 동일한 이름의 클래스와 인터페이스 사용
    - 서로 다른 패키지에 이름이 같은 클래스와 인터페이스 존재 가능
- 높은 소프트웨어 재사용성

---

## 6주차

## 상속

- 상속의 필요성
- 상속을 사용하여 클래스 정의
- 상속 관계의 클래스에서의 생성자 실행 순서를 설명 할 수 있다.

### 상속,inheritance 의 필요성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/de8d653d-4635-4bd1-a66d-b4624be5855e/Untitled.png)

→ 각 클래스(승용차, 트럭, 택시) 에 메소드들이 각각 중복된 것이 존재함

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2ec799b4-c114-47e1-9032-929b76d93223/Untitled.png)

→ 상속을 사용하므로써 더 좋은 구조.

자동차 = 기초, 슈퍼 클래스, 승용차, 택시, 트럭 = 파생, 서브 클래스 라고 한다.

### 상속선언 - extends

```java
public class 자동차 {
...
}
public class 승용차 extends 자동차 {
...
}
public class 택시 extends 승용차 {
	...
}
```

### 자바 상속의 특징

- 다중 상속 지원하지 않음
    - 인터페이스의 다중 상속은 허용
- 상속의 횟수는 무제한
- 상속의 최상위 조상 클래스는 java.lang.Object 클래스

### 예제 1.

```java
class 점 {
    private int x, y;

    public void 좌표설정(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void 정보출력() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class 색상점 extends 점 {
    private String 색상;

    public void 색상설정(String 색상) {
        this.색상 = 색상;
    }

    public void 상세정보출력() {
        System.out.print(색상);
        정보출력();
    }
}

public class 점테스트 {
    public static void main(String[] args) {
        점 점객체 = new 점();
        점객체.좌표설정(5, 7);
        점객체.정보출력();

        색상점 색점객체 = new 색상점();
        색점객체.좌표설정(2, 9);
        색점객체.색상설정("파랑");
        색점객체.상세정보출력();
    }
}
```

### 슈퍼 클래스의 멤버에 대한 서브 클래스의 접근

- 슈퍼 클래스의 private 멤버
    - 서브 클래스에서 접근 할 수 없음
- 슈퍼 클래스의 디폴트 멤버
    - 서브 클래스가 동일한 패키지에 있을 때 접근 가능
- 슈퍼 클래스의 public 멤버
    - 서브 클래스는 항상 접근 가능
- 슈퍼 클래스의 protected 멤버
    - 같은 패키지 내의 모든 클래스 접근 허용
    - 패키지 여부와 상관없이 서브 클래스는 접근 가능

### 슈퍼 클래스 멤버의 접근 지정자 - 중요

| 슈퍼 클래스 멤버에 접근 하는 클래스 종류  | private  | 디폴트  | protected | public  |
| --- | --- | --- | --- | --- |
| 같은 패키지의 클래스  | x | o | o | o |
| 다른 패키지의 클래스  | x | x | x | o |
| 같은 패키지의 서브 클래스 | x | o | o | o |
| 다른 패키지의 서브 클래스  | x | x | o | o |

### protected 멤버

- protected 멤버에 대한 접근
    - 같은 패키지의 모든 클래스 허용
    - 상속되는 서브 클래스(같은 패키지든 다른 패키지든 상관 없음) 에게 허용
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3ce4db02-6851-4ac4-8cf4-6897b7859b83/Untitled.png)
    

### 슈퍼 클래스와 서브 클래스의 생성자 호출 및 실행 관계 - 중요!!!!

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a4fb3da1-b731-4061-a65a-e196c54bf647/Untitled.png)

### 서브 클래스와 슈퍼 클래스의 생성자 선택

- 슈퍼 클래스와 서브 클래스
    - 각각 여러 개의 생성자 작성 가능
- 서브 클래스의 객체가 생성될 때
    - 슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개가 실행
- 서브 클래스의 생성자와 슈퍼 클래스의 생성자가 결정되는 방식
    1. 개발자의 명시적 선택
    - 서브 클래스 개발자가 슈퍼 클래스의 생성자 명시적 선택
    - super() 키워드를 이용하여 선택
    1. 컴파일러가 기본생성자 선택
    - 서브 클래스 개발자가 슈퍼 클래스의 생성자를 선택하지 않는 경우
    - 컴파일러가 자동으로 슈퍼 클래스의 기본 생성자 선택
- 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d2464f32-ddb2-4b68-bc47-f35cfb35ca2c/Untitled.png)

```java
class 자동차 {
    public 자동차() {
        System.out.println("자동차");
    }

    public 자동차(int 숫자) {
        System.out.println("자동차(숫자)");
    }
}

class 승용차 extends 자동차 {
    public 승용차() {
        System.out.println("승용차");
    }

    public 승용차(int 숫자) {
        System.out.println("승용차(숫자)");
    }
}

class 택시 extends 승용차 {
    public 택시() {
        System.out.println("택시");
    }

    public 택시(int 숫자) {
        System.out.println("택시(숫자)");
    }
}

public class 자동차테스트 {
    public static void main(String[] args) {
        택시 택시객체 = new 택시(3);
    }
}
```

### super()

- 서브 클래스에서 명시적으로 슈퍼 클래스의 생성자를 선택 호출할 때 사용
- 사용방식
    - super(parameter);
    - 반드시 서브 클래스 생성자 코드의 첫 번째 라인에 위치 해야함
- 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b454b241-5018-4504-ac9a-b0d0353b81d2/Untitled.png)

```java
class 자동차 {
    public 자동차() {
        System.out.println("자동차");
    }

    public 자동차(int 숫자) {
        System.out.println("자동차(숫자)");
    }
}

class 승용차 extends 자동차 {
    public 승용차() {
        System.out.println("승용차");
    }

    public 승용차(int 숫자) {
        super(숫자);
        System.out.println("승용차(숫자)");
    }
}

class 택시 extends 승용차 {
    public 택시() {
        System.out.println("택시");
    }

    public 택시(int 숫자) {
        super(숫자);
        System.out.println("택시(숫자)");
    }
}

public class 자동차테스트 {
    public static void main(String[] args) {
        택시 택시객체 = new 택시(3);
    }
}
```

```java
자동차(숫자)
승용차(숫자)
택시(숫자)
```

### 예제 2. 점테스트.java

```java
class 점 {
    private int x, y;

    public 점(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void 정보출력() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class 색상점 extends 점 {
    private String 색상;

    public 색상점(int x, int y, String 색상) {
        super(x, y);
        this.색상 = 색상;
    }

    public void 상세정보출력() {
        System.out.print(색상);
        정보출력();
    }
}

public class 점테스트 {
    public static void main(String[] args) {
        점 점객체 = new 점(5, 7);
        점객체.정보출력();

        색상점 색점객체 = new 색상점(2, 9, "파랑");
        색점객체.상세정보출력();
    }
}
```

```java
(5,7)
파랑(2,9)
```

### 실습 1. shape, Rectangle 클래스 정의

- ShapeTest.java

```java
class Shape {
    protected String name;
    protected int x, y;

    public Shape(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void ShowInfo() {
        System.out.println("===== 정보출력 ==================");
        System.out.println("이름: " + name);
        System.out.printf("좌표: %d, %d \n", x, y);
    }
}

class Rectangle extends Shape {
    protected int width, height;

    public Rectangle(String name, int x, int y, int width, int height) {
        super(name, x, y);
        this.width = width;
        this.height = height;
    }

    public void ShowDetailInfo() {
        System.out.println("===== 상세 정보출력 ===============");
        System.out.println("너비: " + width);
        System.out.println("높이: " + height);
    }
}

public class ShapeTest {
    public static void main(String args[]) {
        Shape s_obj = new Shape("도형", 9, 3);
        s_obj.ShowInfo();
        Rectangle r_obj = new Rectangle("사각형", 7, 5, 11, 13);
        r_obj.ShowInfo();
        r_obj.ShowDetailInfo();
    }
}
```

### 실습 2.

- 다음 요구사항을 만족하는 프로그램을 작성
    - Circle, Rectangle, Sphere, Box 클래스 정의
    - 상속을 사용하여 각각 클래스 정의( 최상위 super class : Shape)
    - 필드 :
        - 이름, 좌표, 반지름, 너비, 높이, 깊이 등
        - 모든 필드의 접근 지시자는 protected 으로 지정
    - 생성자 : super() 메소드 사용
        - 기본 생성자 : 기본값으로 각 클래스의 필드 설정
        - 파라미터 있는 생성자 : 전달된 값으로 각 클래스의 필드 설정
    - 메소드
        - ShowInfo() : 클래스의 공통 속성 출력
        - ShowDetailInfo2D( ): Circle, Rectangle의 필드 출력
        - ShowDetailInfo3D( ): Sphere, Box의 필드 출력
        - setter 및 getter

```java
class Shape {
    protected String name;
    protected int x, y;

    public Shape() {
        this("도형", 0, 0);
    }

    public Shape(String name) {
        this(name, 0, 0);
    }

    public Shape(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void ShowInfo() {
        System.out.println("===== 정보출력 ==================");
        System.out.println("이름: " + name);
        System.out.printf("좌표(2D): %d, %d \n", x, y);
    }
}

class Circle extends Shape {
    protected int radius;

    public Circle() {
        super("원");
        radius = 0;
    }

    public Circle(String name) {
        super(name);
        radius = 0;
    }

    public Circle(String name, int x, int y, int radius) {
        super(name, x, y);
        this.radius = radius;
    }

    public void ShowDetailInfo2D() {
        ShowInfo();
        System.out.printf("반지름: %d \n", radius);
    }
}

class Sphere extends Circle {
    protected int z;

    public Sphere() {
        super("구");
        this.z = 0;
    }

    public Sphere(String name, int x, int y, int z, int radius) {
        super(name, x, y, radius);
        this.z = z;
    }

    public void ShowDetailInfo3D() {
        ShowDetailInfo2D();
        System.out.printf("좌표(z축): %d \n", z);
    }
}

class Rectangle extends Shape {
    protected int width, height;

    public Rectangle() {
        super("사각형", 0, 0);
        this.width = this.height = 0;
    }

    public Rectangle(String name) {
        super(name, 0, 0);
        this.width = this.height = 0;
    }

    public Rectangle(String name, int x, int y, int width, int height) {
        super(name, x, y);
        this.width = width;
        this.height = height;
    }

    public void ShowDetailInfo2D() {
        ShowInfo();
        System.out.printf("너비, 높이: %d, %d \n", width, height);
    }
}

class Box extends Rectangle {
    protected int z;
    protected int depth;

    public Box() {
        super("육면체");
        this.z = 0;
        this.depth = 0;
    }

    public Box(String name, int x, int y, int z, int width, int height, int depth) {
        super(name, x, y, width, height);
        this.z = z;
        this.depth = depth;
    }

    public void ShowDetailInfo3D() {
        ShowDetailInfo2D();
        System.out.printf("좌표(z축): %d \n", z);
        System.out.printf("깊이: %d \n", depth);
    }
}
```

## 다형성

- 업 캐스팅 및 다운 캐스팅의 개념을 설명 할 수 있다.
- 메소드 오버라이딩 개념과 방법을 설명할 수 있다.

### 업캐스팅(upcasting)

- 서브 클래스 레퍼런스를 슈퍼 클래스 레퍼런스에 대입
    - 슈퍼 클래스의 멤버만 접근 가능

```java
class Shape {
	. . .
}
class Circle extends Shape {
	. . .
}

Circle c_obj = new Circle();
Shape s_obj = c_obj; // 업캐스팅 (자동타입변환)
```

- 오류 코드 예시

```java
class Shape {
    protected int x, y;

    public void ShowInfo() {
        // ...
    }
}

class Circle extends Shape {
    protected int radius;

    public void ShowDetailInfo() {
        // ...
    }
}

public class UpcastingEx {
    public static void main(String[] args) {
        Shape s_obj;
        Circle c_obj = new Circle();
        s_obj = c_obj; // 업캐스팅
        s_obj.x = 10;
        s_obj.y = 15;
        s_obj.radius = 7; // 컴파일 오류
    }
}

이 코드의 오류는 s_obj가 Shape 클래스 타입의 참조 변수이기 때문에, 
Shape 클래스에 정의되지 않은 radius 필드에 접근하려고 하면 컴파일 오류가 발생합니다. 
radius 필드는 Circle 클래스에서만 정의되어 있으므로, Shape 클래스의 객체에는 접근할 수 없습니다.

업캐스팅을 통해 Circle 객체를 Shape 참조 변수로 할당한 후에는, 
Shape 클래스에 정의된 필드와 메소드에만 접근할 수 있습니다. 
이 문제를 해결하려면 명시적으로 다운캐스팅을 수행해야 합니다.

예시) 
public class UpcastingEx {
    public static void main(String[] args) {
        Shape s_obj;
        Circle c_obj = new Circle();
        s_obj = c_obj; // 업캐스팅
        s_obj.x = 10;
        s_obj.y = 15;
        ((Circle) s_obj).radius = 7; // 다운캐스팅
    }
}
```

### 다운캐스팅(downcasting)

- 슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입
- 업캐스팅된 것을 다시 원래대로 되돌리는 것
- 명시적인 타입 변환 필요

```java
class Shape {
. . .
}
class Circle extends Shape {
. . .
}
Circle c_obj = new Circle();
Shape s_obj = c_obj; // 업캐스팅 (자동타입변환)
Circle nc_obj = (Circle)s_obj; // 다운캐스팅 (강제타입변환)
```

```java
class Shape {
    protected int x, y;

    public void ShowInfo() {
        // ...
    }
}

class Circle extends Shape {
    protected int radius;

    public void ShowDetailInfo() {
        // ...
    }
}

public class UpcastingEx {
    public static void main(String[] args) {
        Shape s_obj;
        Circle c_obj = new Circle();
        s_obj = c_obj; // 업캐스팅
        s_obj.x = 10;
        s_obj.y = 15;
        Circle nc_obj = (Circle) s_obj; // 다운캐스팅
        nc_obj.radius = 7;
    }
}
```

### instanceof 연산자

- 래퍼런스가 가르키는 객체의 타입 식별

```java
obj_reference instanceof class_type
```

- 예시

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0f949a10-1eb2-491b-8d19-ba6e59256f06/Untitled.png)

```java
Rectangle3D s = new Rectanlge3D();
if(s instanceof Rectanlge3D) // true
if(s instanceof Rectangle) // true
if(s instanceof Shape) // true
if(s instanceof Circle) // false
```

```java
Shape s = new Rectanlge3D();
if(s instanceof Rectanlge3D) // true
if(s instanceof Rectangle) // true
if(s instanceof Shape) // true
if(s instanceof Circle) // false
```

```java
new Rectangle3D() → Shape, Rectangle, Rectangle3D
new Rectangle() → Shape, Rectangle
new Circle() → Shape, Circle
new Shape() → Shape
```

!!주의점!!

기본 자료형에는 사용 불가능!!

```java
if("java" instanceof String) // true
if(3 instanceof int) // 문법 오류
```

### 메소드 재정의, method overriding

- 슈퍼 클래스의 메소드를 서브 클래스에서 재정의하는 것
    - 슈퍼 클래스의 메소드 이름, 매개변수 타입 및 개수, 리턴 타입을 모두 동일하게 정의해야함
- 동적 바인딩 발생
    - 호출하는 메소드를 실행 시점에 결정

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/291f07ca-41dc-4142-a740-10e4d2717ec0/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/44a61c3e-fc42-4546-b1e9-947df6bf83a8/Untitled.png)

→ 각 클래스에 정의된 Show…. 을 모두 하나로 ShowInfo 메소드를 재정의하여 클래스에 맞게 바꾸어 사용이 가능하다

```java
정적 바인딩 (Static Binding):
컴파일 시간에 메소드 호출이 결정되고, 객체의 타입을 바탕으로 결정됩니다. 
주로, 오버로딩 된 메소드와 같이 컴파일러가 어떤 메소드를 호출해야 할지 
결정할 수 있는 경우에 사용됩니다.

Shape s_obj = new Shape();
s_obj.ShowInfo();

위 코드에서 s_obj는 Shape 타입의 객체를 참조하고 있으며, 
컴파일 시점에 ShowInfo() 메소드가 Shape 클래스의 메소드임을 알 수 있습니다. 
따라서 이 경우 정적 바인딩이 발생합니다.

동적 바인딩 (Dynamic Binding):
메소드 호출이 실행 시간에 결정되며, 객체의 실제 타입을 기반으로 결정됩니다. 주로, 오버라이딩 된 메소드와 같이 실행 시간에 어떤 메소드를 호출할지 결정해야 하는 경우에 사용됩니다.

Shape r_obj = new Rectangle();
r_obj.ShowInfo();

위 코드에서 r_obj는 Shape 타입의 참조 변수이지만, 실제로 Rectangle 객체를 참조하고 있습니다.
컴파일 시점에는 r_obj가 Shape 타입이기 때문에 어떤 ShowInfo() 메소드가 호출될지 확정할 수 없습니다.
실행 시간에 r_obj가 참조하는 객체가 Rectangle임을 알게 되고, 
그에 따라 오버라이딩 된 Rectangle 클래스의 ShowInfo() 메소드가 호출됩니다. 
따라서 이 경우 동적 바인딩이 발생합니다.
```

### 메소드 재정의(method overriding 의 조건)

1. 슈퍼 클래스 메소드와 동일한 이름, 매개변수 타입 및 개수, 반환형을 가져야함
2. 재정의 메소드의 접근 지정자는 슈퍼 클래스의 메소드의 접근 지정자 보다 좁아질 수 없음
    - public > protected > private
3. static, private, final 메소드는 재정의 할 수 없음

```java
class Shape {
	protected int x, y;
	public Shape() { }
	public void ShowInfo () { }
}
class Rectangle extends Shape {
	protected int width, height;
	public Rectangle() { }
	public void ShowInfo () { } // 성공

	public int ShowInfo () { } // 1번 조건 위배

	protected void ShowInfo () { } // 2번 조건 위배
}
```

### 예제 – 다형성 실현

```java
public class ShapeTest {
	static void ShowInfo( Shape s ) {
		s.ShowInfo(); // 동적 바인딩
}
public static void main(String[] args) {
		ShowInfo(new Shape());
		ShowInfo(new Rectangle());
		ShowInfo(new Circle());
		ShowInfo(new Rectangle3D());
	}
}
```

### 다형성

- 다형성(polymorphtism) 이란?
    - 한 클래스 내에서 같은 이름이지만 다르게 동작하도록 구현 ⇒ method overloading
    - 동일한 이름의 동작(메소드)을 클래스에 따라 다르게 구현 ⇒ method overriding
        - 슈퍼 클래스의 메소드를 서브 클래스에서 각각 목적에 맞게 다르게 구현

### overloading vs. overriding - 중요!!!!!

| 구분 | 메소드 오버로딩 | 메소드 오버라이딩 |
| --- | --- | --- |
| 정의 | 클래스 내부에서 동일 이름의 메소드 중복 작성 | 상속 관계에서 동일 이름의 메소드 재작성 |
| 목적 | 사용 편리성 향상 | 슈퍼 클래스 메소드의 기능을 서브 클래스에서 재정의 |
| 조건 | 메도스 이름은 동일하지만 매개변수 개수와 타입이 다름 | 메소드 이름, 매개변수 개수와 타입, 반환형이 모두 동일 |
| 바인딩 | 정적 바인딩(컴파일 시에 호출되는 메소드 결정) | 동적 바인딩(실행 시간에 메소드 찾아 호출) |

### super 키워드

- 서브클래스에서 슈퍼 클래스의 멤버를 접근할 때 사용하는 슈퍼클래스 타입의 레퍼런스
- 상속관계에 있는 서브 클래스에서만 사용됨
- 재정의된 슈퍼 클래스의 메소드 호출 시 사용

```java
class Shape {
	protected String name;
	protected int x, y;
	public Shape() { }
	public void ShowInfo () {
		System.out.println("=== 정보출력 ==========");
		System.out.println("이름 " + name);
		System.out.println("x: " + x + "y: " + y);
	}
}
class Rectangle extends Shape {
	protected int width, height;

	public Rectangle() { }

	public void ShowInfo () {
		super.name = "사각형";
		super.ShowInfo();
		System.out.printf("가로(%d), 세로(%d) \n", width, height);
	}
}
```

### final 키워드

- final 클래스 - 클래스 상속 불가능
- final 메소드 - 오버라이딩 불가능
- final 필드 - 값을 변경할 수 없음(상수 정의)

---

## 7주차

## 추상 클래스와 인터페이스

- 추상 메소드와 추상 클래스의 필요성과 용도
- 추상 클래스의 선언 방법과 특성을 설명할 수 있다
- 인터페이스 용도와 사용 방법

### 추상 메소드, abstract method

- 선언되어 있으나 구현되어 있지 않은 메소드
- 추상 메소드 선언
    - abstract 키워드 사용
    - ex) public abstract int getValue();
- 서브 클래스에서 재정의(overriding)하여 구현해야 함

### 추상 클래스, abstract class

1. 추상 메소드를 하나라도 가진 클래스
    - 클래스 앞에 반드시 abstract 라고 선언해야함
2. 추상 메소드가 하나도 없지만 클래스 앞에 abstract 라고 선언한 경우 

### 추상 클래스의 두 가지 형태

```java
// 1. 추상 메소드를 가진 추상 클래스
abstract class Shape {
	public String name;
	public Shape() { name = null; }
	abstract public void draw(); // 추상 메소드 선언
}
// 2. 추상 메소드 없는 추상 클래스
abstract class Person {
	public String name;
	public Person(String name) { this.name = name; }
	public String getName() { return name; }
}
```

### 추상 클래스 필요성

- 계층적 상속 관계를 갖는 클래스 구조를 만들 때
- 설계와 구현을 분리
    - 슈퍼 클래스에서는 개념적 특징 정의(규격 마련)
    - 서브 클래스에서 구체적 행위 구현
- 설계의 동일성 확보
    - 클래스 설계자가 여러 명인 경우 필드명과 메소드명을 동일하게 지정 가능

### 추상 클래스 특성

- 추상 클래스의 객체는 생성 불가
    - 래퍼런스 변수 타입으로 사용가능
- 추상 클래스의 상속
    - 추상 클래스를 상속할 때 추상 메소드 미구현 ⇒ 서브 클래스도 추상 클래스 됨
        - 서브 클래스도 abstract 로 선언해야 함

### 추상 클래스의 인스턴스 생성 불가

```java
abstract class Shape { // 추상 클래스 선언
	public String name;
	public Shape() { name = null; }
	abstract public void draw(); // 추상 메소드 선언
}
public class ShapeTest {
	public static void main(String [] args) {
		Shape s;
		s = new Shape(); // 컴파일 오류
	}
}
Cannot instantiate the type DObject 오류 
```

### 추상 클래스의 활용 예

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cf5c3008-cdae-4c46-a951-2a40599c78a8/Untitled.png)

### 실습

```java
abstract class Shape {
    int x, y;

    public void translate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}

class Rectangle extends Shape {
    int width, height;

    public void draw() {
        System.out.println("사각형 그리기 메소드");
    }
}

class Circle extends Shape {
    int radius;

    public void draw() {
        System.out.println("원 그리기 메소드");
    }
}

public class AbstractTest {
    public static void main(String args[]) {
        // Shape s1 = new Shape(); // 오류!!
        Shape s2 = new Circle(); // OK!!
        s2.draw();
    }
}
```

### 인터페이스

- 시그니처가 변하지 않는 것을 전제로 하여 다형성을 정의하는 객체간의 규약
    - 클래스의 상세 설계를 몰라도 사용 가능
    - 인터페이스의 메소드만 알고 있으면 가능
- 역할
    - 기능 명세서
    - 작성 코드가 클래스에 종속되지 않도록 함 ⇒ 클래스를 쉽게 교체 가능

### 인터페이스 구성 가능 멤버

- 상수 필드
    - 모든 필드는 public static fianl 로 가정
- 추상 메소드
    - 추상 메소드는 public abstract 로 가정
- 디폴트 메소드
    - 실행 블록을 가지는 메소드
    - default 키워드를 반드시 사용
    - public 으로 가정
- 정적 메소드
    - public 으로 가정

예시)

```java
public interface Clock {
	(abstract public) int getMinute();
	(abstract public) int getHour();
	(abstract public) void setMinute(int i);
	(abstract public) void setHour(int i);
}
```

```java
public interface RemoteController {
	(public static final) int MIN_VOLUMN = 0;
	(public static final) int MAX_VOLUMN = 100;

	(abstract public) void UpVolumn();
	(abstract public) void DownVolumn();

	(public) default void GetVolumn() {
		System.out.println("현재 볼륨을 확인합니다.");
	}
}
```

### 인터페이스 구현

- implements 키워드 사용

```java
public interface Clock {
	(abstract public) int getMinute();
	(abstract public) int getHour();
	(abstract public) void setMinute(int i);
	(abstract public) void setHour(int i);
}
public class DigitalClock implements Clock {
	public int getMinute() {  };
	public int getHour() {  };
	public void setMinute(int i) {  };
	public void setHour(int i) {  };
	// 메소드 추가
	public int getSecond() {  };
	public void setSecond(int i) {  };
}
```

```java
interface RemoteControl {
    void turnOn();
    void turnOff();

    public default void printBrand() {
        System.out.println("Remote Control 가능 TV");
    }
}

class Television implements RemoteControl {
    boolean on;

    public void turnOn() {
        on = true;
        System.out.println("TV가 켜졌습니다.");
    }

    public void turnOff() {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }

    @Override
    public void printBrand() {
        System.out.println("Power Java TV입니다.");
    }
}

public class TestInterface {
    public static void main(String args[]) {
        RemoteControl obj = new Television();
        obj.turnOn();
        obj.turnOff();
        obj.printBrand();
    }
}
```

### 인터페이스의 특징

- 객체 생성 불가
    - 레퍼런스 변수 타입으로 사용 가능
- 다중 상속 가능
- 다중 구현 가능
- 동시에 상속과 구현 가능

### 다중 상속 지원

```java
public interface Clock {
. . .
}
public interface RemoteController {
. . .
}
public interface ClockRemoteController extends Clock, RemoteController {
. . .
}
```

### 다중 구현 지원

```java
public interface Clock {
. . .
}
public interface RemoteController {
. . .
}
public class ClockRemoteController implements Clock, RemoteController {
. . .
}
```

### 상속 및 구현 동시 적용

```java
public class Phone {
	public void SendCall() {   }
	public void ReceiveCall() {  }
}
public interface MP3 {
	(abstract public) void play();
	(abstract public) void stop();
}

public class SmartPhone extends Phone implements MP3 {
. . .
}
```

### 추상 클래스와 인터페이스 비교

| 비교  | 내용 |
| --- | --- |
| 추상 클래스  | - 상수, 변수 필드 포함 가능
- 모든 서브 클래스에 공통된 메소드가 있는 경우는 추상 클래스가 적합
- 단일 상속만 지원 |
| 인터페이스  | - 상수 필드만 포함 가능
- 객체 간의 규약을 정의하는 경우에는 인터페이스 사용
- 다중 상속 지원 |

### 추상클래스 vs 인터페이스

- 인터페이스와 추상클래스의 두드러진 차이
    - 추상클래스는 구현된 메소드를 포함 할수 있고 인터페이스는 그렇지 못하다는 것입니다. 하지만 JAVA 8부터는 default interface method 기능을 제공해 구현된 메서드를 포함할 수 있습니다.
    - 추상클래스로 정의된 타입을 구현하는 클래스는 반드시 추상클래스의 하위 클래스가 되야 한다는 것입니다. 이와 달리 인터페이스를 구현하는 클래스의 경우는, 인터페이스에 정의된 모든 메소드를 구현하고 인터페이스 구현 계약을 지키면 됩니다.
        - 이건 클래스 상속과는 무관합니다. 자바에서 클래스 간의 상속은 단일 상속만을 허용하기 때문에 추상 클래스로 타입을 정의할때는 심한 제약이따릅니다

⇒ 기본적으로 interface를 사용하되 , 자식이 공통된 필드를 가지고 있다면 추상 클래스를 사용하는 것을 고려하는 것이 일반적

### 인터페이스를 쓰는 이유

- 개발 시간의 단축
    - 실제 인터페이스를 구현하는 사람과 가져다 쓰는 사람이 동시에 개발 진행 가능
- 표준화 가능
    - 프로젝트에 사용되는 기본 틀을 인터페시으로 작성한 수, 개발자에게 인터페이스를 구현하여 프로그램을 작성하도록 하여, 보다 일관되고 정형화된 프로그램 개발 가능
- 서로 관계없는 클래스를 연결 시켜줌(strategy pattern)
    - 아무 관계도 없지만 하나의 인터페이스를 공통으로 구현함으로써 관계를 맺어줄 수 있음
- 독립적인 프로그래밍 이 가능
    - 선언과 구현을 분리 → 독립적인 프로그램 작성 가능
    - 결과적으로 한 클래스의 변경이 다른 클래스에 영향을 미치지 않음

### 인터페이스는 언제 제일 좋을 까?

- 인터페이스는 믹스인 을 정의하는데 이상적이다
    - 믹스인이란 클래스가 자신의 본래 타입에 추가하여 구현할 수 있는 타입으로써, 선택 간읗나 기능을 제공하며, 그 기능을 제공 받고자 하는 클래스에서 선언함

---

## 과제

# 자바프로그래밍 과제#1

## CSV 파일 읽기

- 개요
    - **첨부된csv 파일을 Scanner생성자를 이용하여 읽어들여서 salary field의 값을 모두 더하여 그 합을 구하 는 프로그램을 완성하라.**
    - **소스코드와 그 결과값 출력부분을 보고서안에 첨부하도 록 할것.**
    - **필요시 주요 부분에 대한 설명을 추가할 것.**

```jsx
import java.io.File;
import java.util.Scanner;
public class Java_HW1 {
    public static void main(String[] args) throws Exception {
        File csv = new File("Salaries.csv");
        Scanner sc = new Scanner(csv);
        int salary_sum = 0;
        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            String[] s = line.split(",");
            if (s.length >= 6 && s[5].matches("\\d+")) {
                int salary = Integer.parseInt(s[5]);
                salary_sum += salary;
            }
        }
        System.out.println("합계: " + salary_sum);
        sc.close();
    }
}
```

# 자바프로그래밍 과제#2

## 객체지향 개념 설명하기

### (1) 자바에서 객체지향언어의 개념을 그림을 도식하면서 설명

주요 단어 언급 - 객체, 클래스, 인터페이스, 속성과 행동, 필드와 메소드, 캡슐화, 정보 은닉, 추상화

### (2) 자바가 다른 언어 대비 객체 지향의 장단점에 대한 설명

1. 간단하다
2. 코드 재사용성과 유연성이 높다 
3. 보안성이 높은 자바 
4. 플랫폼 독립적 언어이다
5. 멀티 스레드를 지원한다 

단점 : 성능이 느리다. 다른 언어에 비해 메모리 소비

# 자바프로그래밍 과제#3

## 학생 관리 프로그램 완성하기

### 미완성 코드를 가지고 학생관리 프로그램을 완성하라

[과제 개요]

객체지향 개념을 이해하고, Java 언어를 활용하여 Student 클래스를 설계하고, 간단한 학생 관리 프로그램을 작성해 보는 것을 목적으로 합니다. 배열을 이용하여 Student 객체를 관리하는 방법을 적용해 보세요.

제공되는 코드는 간단한 학생 관리 프로그램을 구현한 것입니다. Student 클래스와 StudentManager 클래스를 사용하여 학생 정보를 추가, 조회, 수정, 삭제 및 전체 학생 목록을 출력하는 기능을 제공합니다. 사용자로부터 입력을 받아 처리하고, 배열을 사용하여 학생 객체를 관리합니다.

[요구 사항]

1. Student 클래스 (현재 완성되지 않은 부분 완성)

학생의 이름, 학번, 전공, 학년을 포함해야 함

생성자를 이용하여 객체를 생성할 때, 학생의 정보를 초기화함

각 멤버 변수에 대한 getter와 setter 메소드를 작성

학생 정보를 문자열 형태로 반환하는 toString 메소드를 구현

1. 학생 관리 클래스 구현 (현재 완성되지 않은 부분 완성)

학생 객체를 저장하는 배열을 생성. 배열 크기는 적절한 크기로 설정  (초기화 또는 구현 필요)

다음 기능들이 필수로 포함되어야 함.

1. a) 학생 정보 추가: 새로운 학생 객체를 배열에 추가합니다. (그대로 사용)
2. b) 학생 정보 조회: 주어진 학번을 이용하여 학생 정보를 조회합니다. (구현필요)
3. c) 학생 정보 수정: 주어진 학번을 이용하여 학생 정보를 수정합니다. (구현필요)
4. d) 학생 정보 삭제: 주어진 학번을 이용하여 학생 정보를 삭제합니다. (구현필요)
5. e) 전체 학생 목록 출력: 저장된 모든 학생 정보를 출력합니다. (그대로 활용)

사용자로부터 입력을 받아 위의 기능을 수행하는 메뉴를 구현 (이 부분 제시된 코드를 그대로 활용)

예외 처리를 통해 사용자의 잘못된 입력을 처리해야함.

- Student(미완성).java

```jsx
public class Student {
    private String name;
    private String studentId;
    private String major;
    private int grade;

    public Student(String name, String studentId, String major, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.grade = grade;
    }

    
}
```

- StudentManager(미완성).java

```jsx
import java.util.Scanner;

public class StudentManager {
	
    //private static final int MAX_STUDENTS
    //private static Student[] students
    //private static int studentCount 
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    modifyStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nStudent Management System:");
        System.out.println("1. Add Student");
        System.out.println("2. Search Student");
        System.out.println("3. Modify Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Display All Students");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter major: ");
        String major = scanner.nextLine();
        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        students[studentCount++] = new Student(name, studentId, major, grade);
        System.out.println("Student added successfully!");
    }

    private static void searchStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        for (Student student : students) {
           // 약 3~4라인 
		}
		System.out.println("Student not found.");
	}

	private static void modifyStudent() {
		System.out.print("Enter student ID: ");
		String studentId = scanner.nextLine();

		for (Student student : students) {
			// 약 10~15라인  
		}
		System.out.println("Student not found.");
	}

	private static void deleteStudent() {
		System.out.print("Enter student ID: ");
		String studentId = scanner.nextLine();

		for (int i = 0; i < studentCount; i++) {
			// 약 4~10라인 
		}
		System.out.println("Student not found.");
	}

	private static void displayAllStudents() {
		System.out.println("Student List:");
		for (int i = 0; i < studentCount; i++) {
			System.out.println((i + 1) + ". " + students[i].toString());
		}
	}
}
```

- [Student.java](http://Student.java)(getter 와 setter 만을 추가함)

```jsx
package HW;
public class Student {
    private String name;
    private String studentId;
    private String major;
    private int grade;
    public Student(String name, String studentId, String major, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String toString() {
        return "이름: " + name + " 학번 : " + studentId + " 전공 : " + major + " 학점 " + grade;
    }
}
```

- StudentManager.java
```
package HW;
import java.util.Scanner;
public class StudentManager {   
    private static final int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int studentCount = 0 ;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    modifyStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void printMenu() {
        System.out.println("\nStudent Management System:");
        System.out.println("1. Add Student");
        System.out.println("2. Search Student");
        System.out.println("3. Modify Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Display All Students");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
    private static void addStudent() {
        try {
            if (studentCount >= MAX_STUDENTS) {
                throw new Exception("학생 수는 100을 넘길 수 없습니다.");
            }
    
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student ID: ");
            String studentId = scanner.nextLine();
            System.out.print("Enter major: ");
            String major = scanner.nextLine();
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer
    
            students[studentCount++] = new Student(name, studentId, major, grade);
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void searchStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student != null && student.getStudentId().equals(studentId)) {
                System.out.println(student.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
	}
	private static void modifyStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        boolean found = false;
    
        for (Student student : students) {
            if (student != null && student.getStudentId().equals(studentId)) {
                //검색할려는 학번이 같다면...
                //뭘 수정해야하는가? 학번은 제외
                //Name, Major, Grade 
                System.out.println("Name : ");
                String name = scanner.nextLine();
                student.setName(name);
    
                System.out.println("Major : ");
                String major = scanner.nextLine();
                student.setMajor(major);
    
                System.out.println("Grade : ");
                int grade = scanner.nextInt();
                student.setGrade(grade);
                found = true;
                break;
            }
        }
    
        if (!found) {
            System.out.println("Student not found.");
        }
    }
	private static void deleteStudent() {
		System.out.print("Enter student ID: ");
		String studentId = scanner.nextLine();
		for (int i = 0; i < studentCount; i++) {
			// 약 4~10라인 
            if (students[i].getStudentId().equals(studentId)) {
                students[i] = null;
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null; 
                System.out.println("삭제했습니다.");
                return;
            }
        }
		System.out.println("Student not found.");
	}
	private static void displayAllStudents() {
		System.out.println("Student List:");
		for (int i = 0; i < studentCount; i++) {
			System.out.println((i + 1) + ". " + students[i].toString());
		}
	}
}
```
## Object 클래스

### 개요

- 모든 자바 클래스는 Object 클래스를 상속함
    - 컴파일 단계에서 자동으로 상속함
    - 모든 클래스가 상속받는 공통 메소드 포함
- 주요 메소드

| 메소드  | 설명 |
| --- | --- |
| boolean equals(Obect obj) | obj가 가리키는 객체와 현재 객체를 비교하여 같으면 true 리턴 |
| Class getClass() | 현 객체의 런타임 클래스를 리턴  |
| int hashCode() | 현 객체에 대한 해스 코드 값 리턴 |
| String toString() | 현 객체에 대한 문자열 표현을 리턴 |
| void notify() | 현 객체에 대해 대기하고 있는 하나의 쓰레드를 깨운다 |
| void notifyAll() | 현 객체에 대해 대기하고 있는 모든 쓰레드를 깨운다 |
| void wait() | 다른 쓰레드가 깨울 때까지 현재 스레드를 대기하게 한다 |

### 속성 관련 메소드

- Object 클래스는 객체의 속성을 나타내는 메소드 제공
    - hachCode() 메소드
        - 객체의 해시코드 값 리턴, 객체 마다 다름(같은 클래스라고 같은 값 아님)
    - getClass() 메소드
        - 객체의 클래스 정보를 담은 Class 객체 리턴
        - Class 객체의 getName() 메소드는 객체의 클래스 이름 리턴
        - 예시) r.getClass().getName()
    - toString() 메소드
        - 객체를 문자열로 리턴
        - getClass().getName() + ‘@’ + 객체의 해쉬코드

### 예제 : 객체 속성 알아내기

객체의 클래스 명, 해시 코드 값, 객체의 문자열 출력

```java
Class Rect {
	int width, height;
	public Rect(int width, int height){
		this.width = width; this.height = height;
	}
}
pulic class ObjectPropertyEx{
	public static void main(String [] args){
		Rect p = new Rect(15,20);
		System.out.println(p.getClass().getName()); //클래스 이름
		System.out.println(p.hashCode()); //해시 코드 값
		System.out.println(p.toString()); //객체의 문자열
	}
}
```

실행결과

```java
Rect
22281029
Rect@1513F13
```

### toString() 메소드

- 객체에 대한 정보를 문자열로 제공(반환)
    - 서브 클래스에서 Overriding 하여 자신만의 문자열 제공 가능
- 컴파일러에 의한 toString() 자동 변환
    - 객체를 출력하면 해당 객체의 toString()을 자동 호출

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/59a18479-13cc-490d-96ae-dc809862bb6d/Untitled.png)

### 예제 : toString() 재정의

```java
class Rect {
	int width, height;
	public Rect(int width, int height) {
	    this.width = width;
	    this.height = height;
	}
	public String toString() {
	    return "Rect(" + width + "," + height + ")";
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Rect p = new Rect(15, 20);
		System.out.println(p.toString());
		System.out.println(p); // p는 p.toString()으로 자동 변환됨
	}
}
```

실행결과 

```java
Rect(15,20)
Rect(15,20)
```

### 객체 비교(==) 와 equals() 메소드

- == 연산자
    - 객체 레퍼런스 비교
    
    ```java
    Rect a = new Rect(15,20);
    Rect b = new Rect(15,20);
    Rect c = a;
    if(a == b) // false
    	System.out.println("a==b");
    if(a == c) // true
    	System.out.println("a==c");
    ```
    
    실행 결과 
    
    ```java
    a == c
    ```
    

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c32ab297-d391-444e-bbd1-6552d37ffb72/Untitled.png)

- boolean eqauls(Object obj)
    - 두 객체의 내용 비교
    - 객체의 내용물을 비교하기 위해 클래스의 멤버로 작성

### equals() 재정의

Rect 클래스의 width, height가 동일한 경우 true 반환

```java
class Rect {
    int width, height;
    
    public Rect(int width, int height) {
        this.width = width; 
        this.height = height;
    }
    
    public boolean equals(Rect p) {
        if(width == p.width && height == p.height) 
            return true;
        else 
            return false;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        Rect a = new Rect(15,20);
        Rect b = new Rect(15,20);
        Rect c = new Rect(20,30);
        
        if(a == b) 
            System.out.println("a==b");
        if(a.equals(b)) 
            System.out.println("a is equal to b");
        if(a.equals(c)) 
            System.out.println("a is equal to c");
    }
}
```

실행결과

```java
a is equal to b
```

### equals() 와 hashCode()

- equals() 를 재정의하는 경우에는 반드시 hashCode() 도 함께 재정의 해야한다.
    - equals() 로 true 가 나온 두 객체는 해쉬코드도 같아야 하기 때문에, equals()를 재정의할 때 반드시 hashcode() 도 재정의 해주도록 한다.

```java
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(이름, user.이름) && Objects.equals(전화번호, user.전화번호);
}

@Override
public int hashCode() {
    return Objects.hash(이름, 전화번호);
}
```

**`equals(Object o)`** 메서드:

- 먼저 이 메서드는 입력받은 객체 o가 현재 객체(this)와 동일한지 확인합니다. 만약 동일하다면, 즉 같은 메모리 주소를 가리킨다면 true를 반환합니다.
- 다음으로, 입력받은 객체 o가 null이거나 현재 객체와 클래스 타입이 다르다면 false를 반환합니다. 이를 통해 불필요한 ClassCastException을 방지합니다.
- 그 후, 객체 o를 User 클래스 타입으로 캐스팅한 후 현재 User 객체의 이름과 전화번호 필드가 캐스팅된 객체의 이름과 전화번호와 동일한지 확인합니다.

**`hashCode()`** 메서드:

- 이 메서드는 객체의 해시 코드를 반환합니다. 여기서는 이름과 전화번호 필드를 이용하여 해시 코드를 생성합니다.
- **`Objects.hash(Object... values)`** 메서드는 하나 이상의 입력 값을 받아 해시코드를 계산하고 이를 반환합니다.

## Wrapper 클래스

### Wrapper 클래스

- 자바 기본 데이터 타입을 클래스화한 8개 클래스
- 기본 데이터 타입을 사용하지 못하고 객체만 사용하는 경우(컬렉션 등) 에 사용가능

| 기본 자료형 | byte | short | int  | long  | char  | float | double | boolean |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Wrapper 클래스 | Byte | Short | Integer | Long | Character | Float | Double | Boolean |

### Wrapper 객체 생성

```java
Integer i = new Integer(10);
Character c = new Character('c');
Float f = new Float(3.14f);
Boolean b = new Boolean(true);

Boolean b = new Boolean("false");
Integer I = new Integer("10");
Double d = new Double("3.14");
```

문자열을 생성자 인자로 사용 ➡ Boolean, Short, Byte, Integer, Long, Double, Float

(Character 클래스만 제외)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d6e0d9e2-390b-49c3-85be-129dd9fe985b/Untitled.png)

https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html

생성자를 보면은 정수값, 문자열도 되는 

클래스마다 다르다 Integer 는 둘다 되네요 

캐릭터는 안된다?

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5bd0e3c3-1018-4f0a-8b52-e9bead6a65f3/Untitled.png)

문자열이 아니라 벨류값 들어간다

### 기본 자료형 값으로 변환

```java
Integer n = new Integer(20);
int n2 = n.intValue();

Character c = new Character('c');
char c2 = c.charValue();

Float f = new Float(3.14f);
float f2 = f.floatValue();

Boolean b = new Boolean(true);
boolean b2 = b.booleanValue();

int n = Integer.parseInt("231"); // n = 231
boolean b = Boolean.parseBoolean("true"); // b = true
float f = Float.parseFloat("3.141592" ); // f = 3.141592

String s1 = Integer.toString(123); // 정수 123 → 문자열 "123"
String s2 = Integer.toHexString(123); // 정수 123 →문자열 "7b"
String s3 = Float.toString(3.14f); // 실수 3.14 → 문자열 "3.14"
String s4 = Charater.toString(a); // 문자 'a' →"a" 로 변환
String s5 = Boolean.toString(true); // 불린 값 true → 문자열 "true"
```

### 예제 : Wrapper Ex

```java
public class WrapperEx {
    public static void main(String[] args) {
		    // Character 사용
        System.out.println(Character.toLowerCase('A')); // 'A'를 소문자로 변환
        char c1='4', c2='F';
        if(Character.isDigit(c1)) // 문자 c1이 숫자이면 true
            System.out.println(c1 + "는 숫자");
        if(Character.isAlphabetic(c2)) // 문자 c2가 영문자이면 true
            System.out.println(c2 + "는 영문자");

        // Integer 사용
        System.out.println(Integer.parseInt("28")); // 문자열 "28"을 10진수 변환
        System.out.println(Integer.toString(28)); // 정수 28을 2진수 문자열 변환
        System.out.println(Integer.toBinaryString(28)); // 28을 16진수 문자열 변환
        System.out.println(Integer.bitCount(28)); // 28에 대한 2진수의 1의 개수
        Integer i = new Integer(28);
        System.out.println(i.doubleValue()); // 정수를 double 값으로 변환. 28.0

        // Double 사용
        Double d = new Double(3.14);
        System.out.println(d.toString()); // Double을 문자열 "3.14"로 변환
        System.out.println(Double.parseDouble("3.14")); // 문자열을 실수 3.14 변환

        // Boolean 사용
        boolean b = (4>3); // b는 true
        System.out.println(Boolean.toString(b)); // true를 문자열 "true" 변환
        System.out.println(Boolean.parseBoolean("false")); // 문자열을 false 변환
    }
}
```

실행결과

```java
a
4는 숫자
F는 영문자
28
28
11100
3
28.0
3.14
3.14
true
false
```

### 박싱과 언박싱

- 박싱(boxing)
    - 기본 자료형을 Wrapper 클래스 객체로 변환
- 언박싱(unboxing)
    - 박싱의 반대 변환

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/703b8cb6-3ee1-41d8-8327-8a2849a98957/Untitled.png)

### Auto boxing & unboxing

- JDK 1.5부터 지원
- 자동 박싱(Auto boxing)
    - 기본 자료형의 값을 자동으로 Wrapper 객체로 변환
- 자동 언박싱(Auto unboxing)
    - Wrapper 객체를 자동으로 기본 자료형 값으로 변환

```java
//JDK 1.5부터 
Integer ten = 10; //자동 박싱
int i = ten; // 자동 언박
```

## String 관련 클래스

### String 클래스 개요

- String 클래스는 문자열을 저장하고 처리
- 문자열 리터럴(literal) 은 String 객체로 처리
- 문자열 사용 예제
    
    ```java
    String str1 = "java";
    char data[] = {'j', 'a', 'v', 'a'};
    String str2 = new String(data);
    String str3 = new String("java");
    System.out.println("abc"); String cde = "cde";
    System.out.println("abc" + cde);
    String c = "abc".substring(2,3);
    String d = cde.substring(1, 2);
    ```
    
    실행결과 
    
    1. **`String str1 = "java";`**
        - 변수 **`str1`**에 문자열 "java"가 할당됩니다.
    2. **`char data[] = {'j', 'a', 'v', 'a'};`**
        - 문자 배열 **`data`**에 'j', 'a', 'v', 'a'라는 문자들이 순서대로 저장됩니다.
    3. **`String str2 = new String(data);`**
        - 문자 배열 **`data`**를 이용하여 새로운 문자열 객체 **`str2`**를 생성합니다. **`str2`**에는 "java"라는 문자열이 할당됩니다.
    4. **`String str3 = new String("java");`**
        - 문자열 "java"를 이용하여 새로운 문자열 객체 **`str3`**를 생성합니다. **`str3`**에는 "java"라는 문자열이 할당됩니다.
    5. **`System.out.println("abc");`**
        - 콘솔에 "abc"라는 문자열이 출력됩니다.
    6. **`String cde = "cde";`**
        - 변수 **`cde`**에 문자열 "cde"가 할당됩니다.
    7. **`System.out.println("abc" + cde);`**
        - 콘솔에 "abccde"라는 문자열이 출력됩니다. 문자열 연결 연산자인 '+'를 사용하여 "abc"와 변수 **`cde`**의 값인 "cde"가 연결되어 출력됩니다.
    8. **`String c = "abc".substring(2,3);`**
        - 문자열 "abc"에서 인덱스 2부터 인덱스 3 이전까지의 부분 문자열을 추출하여 변수 **`c`**에 할당합니다. 따라서 **`c`**에는 "c"라는 문자열이 할당됩니다.
    9. **`String d = cde.substring(1, 2);`**
        - 변수 **`cde`**에서 인덱스 1부터 인덱스 2 이전까지의 부분 문자열을 추출하여 변수 **`d`**에 할당합니다. 따라서 **`d`**에는 "d"라는 문자열이 할당됩니다.
    
    결과적으로 위 코드를 실행하면 "abc"라는 문자열이 콘솔에 출력되고, 변수 **`str1`**, **`str2`**, **`str3`**, **`cde`**, **`c`**, **`d`**에는 각각 "java", "java", "java", "cde", "c", "d"라는 문자열이 할당됩니다.
    

### 문자열 리턴럴과 new String()

- 문자열 리터럴
    - String s = “java”;
    - 자바 가상 기계 내부에서 리터럴 테이블에 저장되고 관리됨
    - 응용프로그램에서 공유됨
- new String() 으로 생성된 문자열
    - String s = new String(”java”);
    - String 객체는 힙에 생성되고 공유되지 않음

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/681b6aed-9555-4f7d-a96c-b6fea5d44e3c/Untitled.png)

### 문자열 비교

```java
if("java".equals("java")) {
	System.out.println("동일함(0)");
}

String str1 = "java";
String str2 = "java";
if(str1 == str2) {
	System.out.println("동일함(1-1)");
}
if(str1.equals(str2)) {
	System.out.println("동일함(1-2)");
}

String str3 = new String("java");
String str4 = new String("java");
if(str3 == str4) {
	System.out.println("동일함(2-1)");
}
if(str3.equals(str4)) {
	System.out.println("동일함(2-2)");
}
```

### String 메소드 활용

- int compareTo(String str)
    - 0(동일), 음수(사전 순서 먼저), 양수(사전 순서 이후)
    
    ```java
    String android = "android";
    String java= "java";
    int result = android.compareTo(java);
    System.out.println("비교 결과: " + result);
    
    ```
    
    실행결과 > 비교 결과: -9
    
- String concat(CharSequence cs)
    - 문자열 결합
    
    ```java
    String src = "Hello ";
    String result = src.concat("Java");
    System.out.println("결과: " + result);
    ```
    
    실행결과 > Hello Java
    
- static String format(String format, … )
    - 형식화된 문자열 반환
    
    ```java
    String result = String.format("0x%X: %s", 0xff0000, "빨강");
    System.out.println(result);
    ```
    
    실행결과  > 0xFF0000: 빨강
    
- String replace(CharSequece old, CharSequece new)
    - 부분 문자열 대치
    
    ```java
    String src = "C++는 재미있고 C++는 쉽다";
    String result = src.replace("C++", "Java");
    System.out.println(result);
    ```
    
    실행결과 > Java는 재미있고 Java는 쉽다
    
- String [] split(String regex)
    - 정규식 기반으로 문자열 분리
    
    ```java
    String src = "ㅁ3ㅁ+ㅁㅁ5ㅁ*9";
    String [] result = src.split("[+-/*]");
    for(String s : result)
    	System.out.println(s);
    ```
    
    실행결과 > 
    
    3
    5
    9
    
- String trim()
    - 문자열 앞-뒤 공백 제거
        
        ```java
        String src = "5";
        String result = src.trim();
        System.out.println(result);
        ```
        
        실행결과 > 5
        
- String substring(int index)
    - 부분 문자열 반환
    
    ```java
    String src = "Have a nice day!";
    String result = src.substring(5);
    System.out.println(result);
    ```
    
    실행결과 > a nice day!
    
- String substring(int s_idx, int e_idx)
    - 부분 문자열 반환
    
    ```java
    String src = "Have a nice day!";
    String result = src.substring(7,11);
    System.out.println(result);
    ```
    
    실행결과 > nice
    

### StringBuffer, StringBuilder 클래스

- 문자열의 내용을 변경하는 경우 높은 성능 제공
- StringBuilder
    - 문자열 결합 연산을 수행하는 경우 String 객체를 StringBuilder 객체로 자동 변환
    - 동기화 미지원
    - StringBuffer
    - 문자열이 수정이 많은 경우에 적합
    - append(), insert(), replace() 등의 메소드 제공
    - 동기화 지원(StringBuilder와의 주요 차이점)

## Math클래스

### Math 클래스 개요

- 기본 수학적 연산을 위한 다양한 기능들을 포함
    - 지수, 로그, 제곱근, 삼각 함수 등
    - 모든 메소드는 정적 메소드(Static method) 형태로 존재
- 유형별 메소드 구분
    - 기본 함수: abs(), ceil(), floor(), min(), max(), round(),
    sqrt(), pow() 등
    - 삼각 함수: sin(), cos(), asin(), atan(), sinh(), cosh() 등
    - 각도 변환: toDegrees(), toRadians()
    - 지수 로그 함수: exp(), log(), log10() 등

### 난수 생성

- Math.random()메소드
    - 0 ≤ val < 1 사이의 난수 발생
    - 1월에서 12월 사이의 달 생성
        
        ```java
        int(Math.random*() * 12 + 1)
        ```
        
    
- java.util.Random 클래스 사용 가능
    
    
    | 메소드 | 설명 |
    | --- | --- |
    | int nextInt() | 지정된 범위 내의 int 반환(음수 포함) |
    | int nextInt(int bound) | [0, bound) 범위의 int 반환 |
    | double nextDouble() | [0.0, 1.0 범위의 double 반환 |
    | double nextGuassian() | 정규 분포(평균 : 0.0, 분산 : 1.0) 을 따르는 [0.0, 1.0) 사이의 double 반환 |
    | void setSeed(long seed) | 시드 값 설정 |

### 실습

- 문제
    - 공백을 포함하는 계산식을 입력 받아 계산 결과 출력
    
    ```java
    예시) 
    계산식>> 3 + 4.7 - 9 * 6.1 / 2
    피연산자 분리 결과:
    3
    4.7
    9
    6.1
    2
    (숫자들만의 합 계산결과: 24.8) 
    (계산식에 의한 계산결과: -19.75)
    ```
    
    ```java
    import java.util.Scanner;
    
    public class StringTest {
        public static void main(String[] args) {
            String soperand[];
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("계산식>> ");
            String line = scanner.nextLine();
    
            scanner.close();
    
            soperand = line.split("[+*/-]");
            System.out.println("피연산자 분리 결과");
    
            for (int n = 0; n < soperand.length; n++) {
                soperand[n] = soperand[n].trim();
                System.out.println(soperand[n]);
            }
    
            double[] operand;
            operand = new double[soperand.length];
            System.out.println("피연산자 실수 변환 결과");
    
            for (int n = 0; n < soperand.length; n++) {
                operand[n] = Double.parseDouble(soperand[n]);
                System.out.println(operand[n]);
            }
        }
    }
    ```
    

---

## 컬렉션(1)

- 컬렉션의 개념
- Collection 인터페이스의 주요 기능
- Vector 및 ArrayList 클래스의 기능
- Iterator 의 기능

### 컬렉션(Collection)

- 자료 구조를 구현한 클래스
    - 리스트, 큐, 스택, 집합, 해쉬 테이블 등
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d6a04f9f-cd48-48c5-96ad-1fbfb085c205/Untitled.png)
    
- 가변 길이(개수) 의 객체 모음
    - 컬렉션 원소는 객체만 가능 → 기본 타입은 Wrapper 클래스 사용
- 다양한 객체들의 삽입, 삭제, 검색 등에 대한 관리 용이
    - 원소의 개수에 따라 자동 크기 조절
    - 원소 삽입 및 삭제에 따른 자동 이동 관리
    - 인터페이스 와 클래스 구분

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e65d518e-35ef-4e03-83db-1f009cdd92e7/Untitled.png)

### Collection 인터페이스의 주요 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/16a4a68d-fac2-4582-b208-0188db000d62/Untitled.png)

### 컬렉션과 제네릭

- 컬렉션은 제네릭(generics) 기법으로 구현
- 제네릭(generics)
    - 클래스나 메소드를 정의할 때 구체적인 자료형을 정해두지 않고 객체 생성 또는 메소드 호출할 때 자료형을 지정하는 일반화 기법
    - 원소의 자료형을 변수로 표시 → 타입 매개 변수(type parameter)
    - JDK 1.5에서 도입
    - C++ 의 템플릿 과 동일한 개념

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/117f1518-56be-42fd-afc8-020e42f16211/Untitled.png)

### ArrayList<E> 클래스

- 효율적인 삽입, 삭제, 검색 기능 제공(java.util.ArrayList)
- 데이터(원소) 추가
    - 마지막 또는 임의의 중간 위치에 추가(자동으로 크기 증가)
    - 중간에 추가 : 이후 데이터는 자동으로 뒤로 하나씩 자리 이동
- 데이터(원소) 제거
    - 데이터 제거 후 자동으로 앞으로 하나씩 자리 이동
    - 자동으로 크기 감소
- 삽입 가능 자료형
    - 객체, null
    - 기본 타입(Wrapper 객체 사용 또는 자동 박싱/언박싱 사용)
- 생성자

| ArrayList() | 객체 생성(용량 : 10)
10개 크기의 ArrayList 객체 생성 |
| --- | --- |
| ArrayList(int initalCapacity) | 객체 생성(용량 : capacity)
initialCapacity 개 크기의 ArrayList 객체 생성 |
|  ArrayList(Collection <T> c) | 컬렉션 c의 원소들을 모두 포함하는 ArrayList 객체 생성 |
- 주요 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5754e08c-50f3-4e62-9572-3d98f83b5a30/Untitled.png)

```java
ArrayList<Integer> v = new ArrayList<Integer>(3);
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/633e0dba-3a46-4f77-95f2-5ba2a19d88cc/Untitled.png)

```java
v.add(new Integer(7)); //v의 capacity -> 3 , v.size() -> 2
v.add(3);
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c26f39e6-198f-4162-9250-63af290332e9/Untitled.png)

```java
v.add(-5); //**V의 capacity ➡ 6**
v.add(19); //v.size() ➡ 4
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e7b92383-c229-4e0f-a679-80151c5cc1f3/Untitled.png)

```java
v.add(2, 31);
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/db59f237-b402-4601-b860-409205f672a7/Untitled.png)

```java
v.set(1, -5);
v.set(4, 7);
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4e6cc76b-e9fc-4455-aab2-cfef38644210/Untitled.png)

```java
Integer nObj = v.get(3); //nObj ➡ Integer(-5)
int n = nObj.intValue();//n ➡ -5
int m = v.get(0); //m ➡ 7
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c79082e4-39cf-4e51-9059-3e8dfe6aaa74/Untitled.png)

```java
v.remove(new Integer(-5)); //V의 capacity➡ 6
v.remove(2); //v.size() ➡ 3
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3b64385e-6f60-4aa6-beb9-3ee0cf7af409/Untitled.png)

```java
n = v.indexOf(new Integer(7)); //n ➡ 0
m = v.lastIndexOf(new Integer(7)); //m ➡ 2
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/936186f8-bdbc-40c1-a5ad-a92edc476ed7/Untitled.png)

```java
v.clear(); //V의 capacity ➡ 6 , v.size() ➡ 0
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f5196b32-3380-4a5b-ad6b-ddb07d1de64e/Untitled.png)

### 예제 1: 정수를 저장하는 ArrayList 사용

```java
import java.util.ArrayList;

public class IntegerVectorEx {
	public static void main(String[] args) {
		ArrayList<Integer> v = new ArrayList<>();

		v.add(3);
		v.add(7);
		v.add(2);
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
			sum += n;
		}
		System.out.println("모든 원소 합: " + sum);
	}
}
```

실핼결과 

```java
3
7
2
모든 원소 합: 12
```

### 예제 2: Point 객체를 저장하는 Vector 사용

```java
class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
			return "(" + x + ", " +y + ")";
	}
};

import java.util.ArrayList;

public class PointArrliEx {
	public static void main(String[] args) {
		ArrayList<Point> v = new ArrayList<>();
		v.add(new Point(5, 5));
		v.add(new Point(2, 9));
		v.add(new Point(-7, -8));
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
	}
}
```

실행 결과

```java
(5, 5)
(2, 9)
(-7, -8)
```

### 컬렉션 순차 검색을 위한 Iterator

- Iterator<E> 인터페이스
    - 리스트 구조의 컬렉션에서 원소의 순차 검색을 위한 메소드 제공
- 주요 메소드

| 메소드 | 설명 |
| --- | --- |
| boolean hasNext() | 다음 반복에서 사용될 원소가 있으면 True 반환 |
| E next() | 다음 원소 반환 |
| void remove() | 마지막으로 반환된 원소 제거  |
- Iterator() 메소드
    - Collection 인터펭스 구현 객체에서 Iterator 객체를 얻을 수 있음
    - Iterator 객체를 이용하여 인덱스 없이 순차적 검색 가능
    
    ```java
    Vector<Integer> v = new Vector<Integer>();
    Iterator<Integer> it = v.iterator();
    while(it.hasNext()){
     int n = it.next();
    	...
    }
    ```
    

### 예제 3: Iterator 를 사용한 합 구하기

```java
import java.util.*;

public class IteratorEx{
	public static void main(String [] args) {
		ArrayList<Integer> v = new ArrayList<>();
		v.add(3);
		v.add(7);
		v.add(2);

		// Iterator를 사용하여 모든 원소 출력
		Iterator<Integer> it = v.iterator();
		int sum = 0;
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
			sum += n;
		}
		System.out.println("모든 원소 합: " + sum);
	}
}
```

실행 결과 

```java
3
7
2
모든 원소 합: 12
```

### 실습

- 문제
    - 무작위로 1~100 사이의 정수를 12개 생성하여 ArrayList 객체에 저장
    - 인덱스 2 및 5 원소 제거
    - 첫 번째 및 8번째 원소를 새로운 원소로 대체 (무작위 정수
    - 모든 원소의 합과 평균을 계산하여 출력
- 방법1

```java
import java.util.Random;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        int sum = 0;
        double average = 0.0;
        Random randObj = new Random();

        for (int n = 0; n < 12; n++) {
            v.add(randObj.nextInt(100));
        }

        System.out.println("Before removing...");
        for (int n = 0; n < v.size(); n++) {
            int val = v.get(n);
            System.out.print(val + " ");
        }
        System.out.println("");

        v.remove(5);
        v.remove(2);

        System.out.println("After removing...");
        for (int n = 0; n < v.size(); n++) {
            int val = v.get(n);
            System.out.print(val + " ");
        }
        System.out.println("");

        v.set(0, randObj.nextInt(100));
        v.set(7, randObj.nextInt(100));

        System.out.println("After replacing...");
        for (int n = 0; n < v.size(); n++) {
            int val = v.get(n);
            System.out.print(val + " ");
        }
        System.out.println("");

        for (int n = 0; n < v.size(); n++) {
            int val = v.get(n);
            sum += val;
        }
        average = (double) sum / v.size();

        System.out.println("합: " + sum);
        System.out.println("평균: " + average);
    }
}
```

- 방법2

```java
import java.util.Random;
import java.util.ArrayList;

public class ArrayListTest {
    **public static void print(ArrayList<Integer> v) {
        for (int n = 0; n < v.size(); n++) {
            int val = v.get(n);
            System.out.print(val + " ");
        }
        System.out.println("");
    }**

    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<Integer>();
        int sum = 0;
        double average = 0.0;
        Random randObj = new Random();

        for (int n = 0; n < 12; n++) {
            v.add(randObj.nextInt(100));
        }

        System.out.println("Before removing...");
        print(v);

        v.remove(5);

        System.out.println("After removing...");
        print(v);

        v.set(0, randObj.nextInt(100));
        v.set(7, randObj.nextInt(100));

        System.out.println("After replacing...");
        print(v);

        for (int n = 0; n < v.size(); n++) {
            int val = v.get(n);
            sum += val;
        }
        average = (double) sum / v.size();

        System.out.println("합: " + sum);
        System.out.println("평균: " + average);
    }
}
```

## 컬렉션(2)

- HashMap 클래스 사용법
- LinkedList 클래스 사용법
- Set 관련 클래스의 종류와 사용법
- Collections 클래스의 기능

### HashMap<K,V>

- java.util.HashMap
- 키(key)를 사용하여 원소에 접근하는 컬렉션
    - 키는 해시 함수에 의해 해시 맵에서 원소 위치 결정
- 빠른 삽입 및 검색이 가능
    - 원소 검색 : get() 메소드, 원소 삽입 : put() 메소드
- 동기화를 지원하지 않음

```java
HashMap<String, String> h = new HashMap<String, String>();
h.put("apple", "사과"); // 키: "apple", 원소: "사과"
String v = h.get("apple"); // "apple" 키로 원소 검색, v에는 "사과" 저장
```

### 생성자

| HashMap() | HashMap 객체 생성(용량 16)
16개 단위로 HashMap 크기 변경 |
| --- | --- |
| HashMap(int capacity) | HaschMap 객체 생성 (용량 capacity)
capacity 개 단위로 HashMap 크기 변경 |
| HashMap(Map map) | map 의 모든 원소를 포함하는 HashMap 객체 생성 |

HashTable 과 비교 

1. Hashtable():
    - 기본적으로 11개의 항목을 수용할 수 있는 빈 Hashtable을 생성합니다.
2. Hashtable(int initialCapacity):
    - 지정된 초기 용량을 가진 빈 Hashtable을 생성합니다.
    - initialCapacity는 Hashtable이 수용할 수 있는 항목의 초기 크기를 의미합니다.
    - 크기는 해시 테이블에 저장할 수 있는 항목 수를 나타냅니다.
3. Hashtable(int initialCapacity, float loadFactor):
    - 지정된 초기 용량과 로드 팩터를 가진 빈 Hashtable을 생성합니다.
    - 로드 팩터는 해시 테이블의 크기를 자동으로 조정하는 데 사용되는 비율을 나타냅니다.
4. Hashtable(Map<? extends K,? extends V> t):
    - 주어진 Map과 동일한 매핑을 가진 Hashtable을 생성합니다.
    - 다른 Map에서 기존 데이터를 복사하여 Hashtable을 초기화할 수 있습니다.

### Map 인터페이스의 주요 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cf751404-9a22-4c08-ad6c-246d79d59771/Untitled.png)

```java
HashMap<String, String> h = new HashMap<String, String>(5);
//initial capacity: 5
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bac04246-c57c-490b-ba1c-a1bd76b633f9/Untitled.png)

```java
h.put("sugar", "설탕");
h.put("salt", "소금");
h.put("pepper", "후추");
//h.size() ➡ 3
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4e3ed6ce-722d-4e23-b932-ec7278d390c9/Untitled.png)

```java
m
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0ce104ba-70a8-45a5-939b-116a5131ad62/Untitled.png)

```java
str = h.remove("salt"); //str ➡ "소금"
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9255f6f7-9eb5-4827-9f32-f70e40fa5d70/Untitled.png)

### 예제 1 : 간단한 용어 사전

```java
import java.util.*;

public class HashMapTermEx {
    public static void main(String[] args) {
        HashMap<String, String> term = new HashMap<String, String>();
        
        // 3개 원소 저장
        term.put("binary", "2진법");
        term.put("octal", "8진법");
        term.put("decimal", "10진법");
        
        // 모든 (key, value) 쌍 출력
        Set<String> keys = term.keySet(); // Set 리턴
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = term.get(key);
            System.out.println("(" + key + ", " + value + ")");
        }
    }
}
```

실행결과 : 입력 순서와 출력 순서가 다름

```java
(octal, 8진법)
(binary, 2진법)
(decimal, 10진법)
```

### 예제 2 : 직원 정보 저장

```java
import java.util.*;

class Employee {
    int id;
    String dept;

    public Employee(int id, String dept) {
        this.id = id;
        this.dept = dept;
    }
}

public class HashMapEmpEx {
    public static void main(String[] args) {
        HashMap<String, Employee> map = new HashMap<String, Employee>();
        map.put("Lee", new Employee(101, "sales"));
        map.put("Park", new Employee(102, "personnel"));
        map.put("Kim", new Employee(103, "planning"));
        System.out.println("원소 개수: " + map.size());

        Set<String> names = map.keySet();
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            Employee emp = map.get(name);
            System.out.println(name + ": " + emp.id + " " + emp.dept);
        }
    }
}
```

실행결과 

```java
원소 개수: 3
Lee: 101 sales
Kim: 103 planning
Park: 102 personnel
```

### LinkedList<E>

- java.util.LinkedLIst
- 양방향 연결 리스트를 제공
- List 와 DeQueue 인터페이스를 구현
- 원소 삽입/삭제
    - 맨 앞(위), 맨 뒤에 추가/삭제 가능 → 스택이랑 큐로 사용 가능
    - 인데스를 이용하여 중간에 삽입/삭제 가능 → 리스트

### LinkedList<E> 의 주요 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b55717b3-fa3e-46dc-b16f-c94907f9a8b9/Untitled.png)

### LinkedList<String> 내부 구성

```java
LinkedList<String> lList = new LinkedList<String>();
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d96c32e3-72ec-4eca-99d4-0c00dc9ea567/Untitled.png)

### 예제 3 : String 객체를 저장하는 LinkedList

```java
import java.util.*;

class LLinkTest {
    public static void main(String[] args) {
        LinkedList<String> llink = new LinkedList<String>();
        llink.add("MILK");
        llink.add("BREAD");
        llink.add("BUTTER");
        llink.add(1, "APPLE");
        llink.set(2, "GRAPE");
        llink.remove(3);
        
        for (int n = 0; n < llink.size(); n++) {
            System.out.println(llink.get(n));
        }
    }
}
```

### 예제 4 : LinkedList 에서의 iterator 사용

```java
import java.util.*;

class LLinkIteratorTest {
    public static void main(String[] args) {
        LinkedList<String> llink = new LinkedList<String>();
        llink.add("MILK");
        llink.add("BREAD");
        llink.add("BUTTER");
        llink.add(1, "APPLE");
        llink.set(2, "GRAPE");
        llink.remove(3);
        
        Iterator<String> it = llink.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
```

실행결과

```java
MILK
APPLE
GRAPE
```

### HashSet

- java.util.Hashset
- 집합에 대한 기능 제공
    - 집합은 원소의 순서가 없고 중복을 허용하지 않음
- Set 인터페이스를 구현한 클래스

- Hash Table 을 사용하여 원소 저장
    - 성능면에서 우수
    - 원소들의 순서가 일정하지 않음

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c6fe4760-f138-48c5-8bef-377ac0414ecb/Untitled.png)

### 예제 5 : HashSet 사용

```markdown
import java.util.*;

class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("YOGURT");
        set.add("MILK");
        set.add("BREAD");
        set.add("BUTTER");
        set.add("MILK");
        set.add("BUTTER");
        set.add("CHEESE");
        set.remove("BUTTER");
        
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
```

### HashSet 관련 클래스

- TreeSet
    - Set 인터페이스 구현
    - 이진 탐색 트리(Binary Search Tree)의 일종인 블랙 트리(red-black tree) 에 원소를 저장
    - 알파벳 순으로 순서가 결정되지만 HashSet보다는 느림
- LinkedHashSet
    - Set 인터페이스 구현
    - 해시 테이블과 연결 리스트를 겨합
    - 원소들의 순서는 삽입되었던 순서와 동일2
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d9f5bc7e-0fe1-4b76-a22c-d43b75878a09/Untitled.png)
        

### Set의 대량 연산 메소드

- s1.containsAll(s2)
    - s2가 s1의 부분 집합이면 true
- s1.addAll(s2)
    - s1을 s1 과 s2 의 합집합으로 변경
- s1.retainAll(s2)
    - s1 을 s1과 s2의 교집합으로 변경
- s1.removeAll(s2)
    - s1을 s1 과 s2의 차집합으로 변경

```java
import java.util.*;

public class SetJunkOpTest {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        HashSet<String> set2 = new HashSet<String>();
        
        set1.add("Milk");
        set1.add("Bread");
        set1.add("Butter");
        
        set2.add("Cheese");
        set2.add("Ham");
        set2.add("Bread");
        
        HashSet<String> union = new HashSet<String>(set1);
        union.addAll(set2);
        
        HashSet<String> inter = new HashSet<String>(set1);
        inter.retainAll(set2);
        
        System.out.println("합집합: " + union);
        System.out.println("교집합: " + inter);
    }
}
```

실행결과

```java
합집합: [Ham, Butter, Cheese, Milk, Bread]
교집합: [Bread]
```

### Collections 클래스

- java.util 패키지에 포함
- 컬렉션에 대해 연산을 수행한 후 결과 컬렉션 반환
- 모든 메소드는 Static 타입
- 주요 메소드
    - 컬렉션에 포함된 원소들을 정렬하는 sort() 메소드
    - 원소의 순서를 반대로 하는 reverse() 메소드
    - 원소들의 최대, 최솟값을 찾아내는 max(), min() 메소드
    - 원소들의 순서를 섞는 shuffle() 메소드
    - 특정 값을 검색하는 binarySearch() 메소드

### 예제 : Collections 클래스의 활용

```java
import java.util.*;

public class CollectionsEx {
    static void printList(LinkedList<String> l) {
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            String separator;
            if (iterator.hasNext())
                separator = " -> ";
            else
                separator = "\n";
            System.out.print(e + separator);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("사과");
        myList.add("바나나");
        myList.add("포도");
        myList.add(0, "망고");
        myList.add(2, "감귤");
        
        Collections.sort(myList); // 정렬
        printList(myList);
        
        Collections.reverse(myList); // 역순
        printList(myList);
        
        int index = Collections.binarySearch(myList, "사과") + 1;
        System.out.println("사과는 " + index + "번째 원소입니다.");
    }
}
```

```java
감귤 -> 망고 -> 바나나 -> 사과 -> 포도
포도 -> 사과 -> 바나나 -> 망고 -> 감귤
사과는 2번째 원소입니다.
```

### Lab.

- 무작위로 10개의 정수(-50 ~ 50) 를 생성하여 Vector 객체에 저장한 후 오름차순으로 정렬하여 출력
    - 방법1 : Collections.sort() 메소드 사용
    - 방법 2 : TreeSet(중복x) 또는 PriorityQueue(중복 O) 클래스 사용

```java
import java.util.*;

public class SortingExample {
    public static void main(String[] args) {
        Random rand = new Random();
        Vector<Integer> v = new Vector<Integer>();

        for (int n = 0; n < 10; n++) {
            int num = rand.nextInt(101) - 50;
            v.add(num);
        }

        System.out.println("정렬 전: ");
        System.out.println(v);

        // 방법 1: Collections.sort() 메소드 사용
        Collections.sort(v);
        System.out.println("정렬 후: ");
        System.out.println(v);

        // 방법 2: TreeSet 또는 PriorityQueue 클래스 사용
        TreeSet<Integer> treeSet = new TreeSet<Integer>(v);
        System.out.println("<중복 미허용>");
        System.out.println(treeSet);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(v);
        System.out.println("<중복 허용>");
        System.out.println(priorityQueue);
    }
}
```

---

## 자바 GUI - 개요

- SWING 패키지 특징
- component 와 container 구분
- 프레임 생성

### 개요

- 자바 GUI 프로그래밍 특징
    - 강력하고 쉬운 GUI 프로그래밍과 컴포넌트
    - 컴포넌트란?
- 자바 GUI 프로그래밍 방법
    - AWT 패키지와 Swing 패키지
        - AWT - java.awt 패키지
        - Swing - javax.swing 패키지

### 자바 FX

- 자바FX(JavaFX)는 데스크톱 애플리케이션과 리치 인터
넷 애플리케이션(RIA)을 개발하고 배포하는 소프트웨어
플랫폼으로, 다양한 장치에서 실행 가능

FX 가 있다 만 알고 계시구요.

### Example

```java

import javax.swing.JFrame;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("MyFrame");

        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/30adf9eb-d18c-4105-8554-5f7391121607/Untitled.png)

컴포넌트로 되어있다 

다음 과 같이 붙일 수 있음 

```java
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame frame;
        Container contentPane;
        JLabel label;

        frame = new JFrame("MyFrame");
        frame.setSize(500, 300);

        contentPane = frame.getContentPane();
        label = new JLabel("Hello, WORLD!");
        contentPane.add(label);

        frame.setVisible(true);
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7bdeecf2-bf55-42a1-a300-3aa678472a88/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3b8d30dd-ef31-4390-924e-6c7fb4135b97/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5440b4ae-67fc-4c3f-a0c2-0413f28f6e4d/Untitled.png)

운영체제가 그리는가 자바 자체에서 그리는 가 차이 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b6ee00f2-c2cf-4ca0-a6d4-c155d3e09907/Untitled.png)

레이아웃, 스타일, 애플리케이션 로직이 분리 개발 

### SWING 컴포넌트

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ea291731-2739-414c-917b-954668aacccb/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f8a9bece-9a18-4970-a754-2842563f287b/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e78a8102-81c6-47b8-a092-f93d795549dd/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/387f1e32-85e2-4f48-afb5-ed8fc08a1896/Untitled.png)

### GUI 라이브러리 계층 구조

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e478aff0-4ef6-4274-a9d3-f50628bbd56d/Untitled.png)

awt 무거움

Swing 가벼움

jcomponent 

### Swing 클래스의 특징

- 두 가지 유형으로 구분 가능: Component vs. Container
- Component
    - JComponent를 상속하는 클래스: 대부분의 스윙 컴포넌트
        - JComponent: Swing의 대표 추상 클래스
            - Swing 컴포넌트의 공통적인 속성 구현
            - AWT의 Component를 상속함

컴포넌트들을 컨테이너에 넣는다

- Container
    - AWT의 Container를 상속하는 클래스
        - JApplet, JDialog, JFrame 등

### Component

- 화면에 출력하는 GUI 객체
- 순수 컴포넌트와 컨테이너로 구분
- 순수 컴포넌트는 컨테이너 에 포함 되어야만 출력가능

- 모든 GUI 컴포넌트의 최상위 클래스
    - java.awt.Component
- 스윙 컴포넌트의 최상위 클래스
    - javax.swing.JComponent

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cd773032-8119-4798-9e45-ce0d5ce92c5c/Untitled.png)

### Container

- 다른 component를 포함할 수 있는 GUI component
    - java.awt.Container를 상속받음
- 다른 container에 포함될 수 있음
    - 최상위 container를 제외하고는 다른 container에 포함되어야 함
    - AWT container
    • Panel, Frame, Applet, Dialog, Window
    - Swing container
    • JPanel, JFrame, JApplet, JDialog, JWindow
- 최상위 container
    - 다른 컨테이너에 속하지 않고 독립적으로 존재 가능한 컨테이너
    - 화면에 자신을 출력
    - JFrame, JDialog, JApplet

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/41b8cf55-468a-42d4-bc47-7f30fc859f1e/Untitled.png)

### JFrame

- Frame(java.awt.Frame)과 Content Pane으로 구성
    - Frame: window의 골격 구성 (title bar를 포함)
    - Content Pane: 화면에 출력되는 모든 component를 부착하는 공간
    
    ```java
    import javax.swing.JFrame;
    
    public class SimpleFrame {
        public static void main(String[] args) {
            JFrame frame;
            frame = new JFrame("MyFrame");
            frame.setSize(500, 300);
            frame.setVisible(true);
        }
    }
    ```
    
    프레임 생성 **권장** 방법
    
    ```java
    import javax.swing.*;
    
    public class SimpleFrame2 extends JFrame {
        SimpleFrame2(String title) {
            setTitle(title);
            setSize(500, 300);
            setVisible(true);
        }
    
        public static void main(String[] args) {
            SimpleFrame2 frame = new SimpleFrame2("MyFrame");
        }
    }
    ```
    

### 프레임에 컴포넌트 추가

```java
frame = new JFrame("MyFrame");
contentPane = frame.getContentPane();
label = new JLabel("Hello, WORLD!");
contentPane.add(label);
```

```java
frame = new JFrame("MyFrame");
label = new JLabel("Hello, WORLD!");
frame.add(label);
//JDK 1.5 이상 지원
```

### 여러 개의 component 부착

```java
import javax.swing.*;

public class SimpleFrame2 extends JFrame {
    SimpleFrame2(String title) {
        setTitle(title);
        add(new JButton("OK"));
        add(new JButton("Cancel"));
        add(new JButton("Ignore"));
        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleFrame2 frame = new SimpleFrame2("MyFrame");
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d214a004-d346-4892-9487-74d914ea3fbd/Untitled.png)

배치 관리자가 없어서 다음과 같이 뜸 

```java
import javax.swing.*;
import java.awt.FlowLayout;

public class SimpleFrame2 extends JFrame {
    SimpleFrame2(String title) {
        setTitle(title);
        setLayout(new FlowLayout());
        add(new JButton("OK"));
        add(new JButton("Cancel"));
        add(new JButton("Ignore"));
        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleFrame2 frame = new SimpleFrame2("MyFrame");
    }
}
```

### 스윙 어플리케이션의 종료

- 응용프로그램 내에서 스스로 종료하는 방법
    - System.exit(0)
- 프레임의 오른쪽 상단의 종료버튼(X)을 클릭?
    - 프레임 윈도우 제거되지만 응용프로그램은 여전히 실행되고 있음
        - 키보드나 마우스 입력을 더 이상 받지 못함
        - 다시 setVisible(true)를 호출하면, 보이게 되고 이전 처럼 작동함
- 프레임 제거와 함께 프로그램을 종료시키는 방법
    - frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

## 자바 GUI 배치

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c2f21e76-d918-4e9f-ae9f-303ae550d0ed/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3f8755a4-cc09-4d24-9d04-8acadcb39ce1/Untitled.png)

### 디폴트 배치 관리자

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9de1d522-fa89-4d80-aeee-e19ccee67be6/Untitled.png)

### 배치 관리자 설정

```java
contentPane = frame.getContentPane();
contentPane.setLayout(new FlowLayout());

OR

(frame.)setLayout(new FlowLayout());
```

### FlowLayout

- 컨테이너 공간 내에 **왼쪽에서 오른쪽**, **위에서 아래 방향**
으로 배치

```java
container.setLayout(new FlowLayout());
container.add(new JButton("add"));
container.add(new JButton("sub"));
container.add(new JButton("mul"));
container.add(new JButton("div"));
container.add(new JButton("Calculate"));
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/04aa78be-5f05-40d8-8806-fcd40140597c/Untitled.png)

- 컨테이너 크기가 변하면 배치 관리자에 의해 재배치됨

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2fa26205-946e-4ef5-91c0-9c54df0d5479/Untitled.png)

- FlowLayout()
- FlowLayout(int align)
- FlowLayout(int align, int hGap, int vGap)
    - align : 컴포넌트 정렬 방식 (주요 3 가지)
        - FlowLayout.LEFT, FlowLayout.RIGHT, FlowLayout.CENTER(디폴트)
    - hGap : 좌우 두 컴포넌트 사이의 수평 간격, 픽셀 단위(디폴트 : 5)
    - vGap : 상하 두 컴포넌트 사이의 수직 간격, 픽셀 단위(디폴트 : 5)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/376f7292-514f-4e5a-ba9f-228af372a614/Untitled.png)

```java
import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    FlowLayoutEx() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        // 왼쪽 정렬, 수평 간격 30, 수직 간격 40 픽셀
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        contentPane.add(new JButton("add"));
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));
        contentPane.add(new JButton("div"));
        contentPane.add(new JButton("Calculate"));
        setSize(300, 200); // 프레임 크기 300x200
        setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/767387a1-78f8-42b1-b19f-64c9694526a8/Untitled.png)

### BorderLayout

- 컨테이너 공간을 5 구역으로 분할하여 배치
    - East, West, South, North, Center
- add(Component comp, int index)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d8533d5c-ab38-46b6-b120-48aea9aee521/Untitled.png)

- BorderLayout()
- BorderLayout(int hGap, int vGap)
    - hGap : 좌우 두 컴포넌트 사이의 수평 간격, 픽셀 단위(디폴트 : 0)
    - vGap : 상하 두 컴포넌트 사이의 수직 간격, 픽셀 단위(디폴트 : 0)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b22be58d-71c2-4d6b-bc97-fe9668d776c7/Untitled.png)

### 예제 8-4

```java
import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    BorderLayoutEx() {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x 누르면 꺼지게 
        Container contentPane = getContentPane();
        // 컨텐트팬에 BorderLayout 배치관리자 설정
        contentPane.setLayout(new BorderLayout(30, 20));
        contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);
        contentPane.add(new JButton("add"), BorderLayout.NORTH);
        contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
        contentPane.add(new JButton("mul"), BorderLayout.EAST);
        contentPane.add(new JButton("div"), BorderLayout.WEST);
        setSize(300, 200); // 프레임 크기 300x200 설정
        setVisible(true); // 프레임을 화면에 출력
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8dd559be-aefe-4a18-902a-b886ec41d247/Untitled.png)

### GridLayout

- 컨테이너 공간을 동일한 사각형 격자로 분할한 후 각 셀
에 하나의 컴포넌트 배치
- GridLayout()
- GridLayout(int rows, int cols)
- GridLayout(int rows, int cols, int hGap, int vGap)
    - rows : 격자의 행수 (디폴트 : 1)
    - cols : 격자의 열수 (디폴트 : 1)
    - hGap : 좌우 두 컴포넌트 사이의 수평 간격, 픽셀 단위(디폴트 : 0)
    - vGap : 상하 두 컴포넌트 사이의 수직 간격, 픽셀 단위(디폴트 : 0)

### 예제 8-5

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1cdd4559-0066-4f9e-bcbd-51da6f2659e3/Untitled.png)

```java
import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        // 1x10의 GridLayout 배치관리자
        contentPane.setLayout(new GridLayout(1, 10));
        
        for (int i = 0; i < 10; i++) {
            // 10개 버튼 부착
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            contentPane.add(button);
        }
        
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4c4761b4-246e-43d2-b62c-965d46d9af44/Untitled.png)

```java
import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    GridLayoutEx() {
        setTitle("GridLayout Sample");
        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);
        setLayout(grid);

        add(new JLabel(" 이름"));
        add(new JTextField(""));
        add(new JLabel(" 학번"));
        add(new JTextField(""));
        add(new JLabel(" 학과"));
        add(new JTextField(""));
        add(new JLabel(" 과목"));
        add(new JTextField(""));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/28f29126-9bb2-4b6f-a014-da110f0d08ce/Untitled.png)

순서대로 배치됨 4, 2

### 배치관리자 없는 컨테이너

- 컨테이너에서 배치 관리자 제거
    - JPanel에서 배치 관리자 제거
    
    ```java
    JPanel p = new JPanel();
    p.setLayout(null);
    ```
    
- 컴포넌트의 절대 크기와 절대 위치를 스스로 결정

```java
• 크기 설정 : Component.setSize(int width, int height);
• 위치 설정 : Component.setLocation(int x, int y);
• 동시 설정 : Component.setBounds(int x, int y, int width, int height);
```

### 예제 8-6

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fd491900-d817-4857-a005-ec1738c5f0a7/Untitled.png)

```java
import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    NullContainerEx() {
        setTitle("Null Container Sample");
        setLayout(null);

        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130, 50);
        la.setSize(200, 20);
        add(la);

        for (int i = 1; i <= 9; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i * 15, i * 15);
            b.setSize(50, 20);
            add(b);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}
```

## 이벤트 처리 개요

### 이벤트 기반 프로그래밍 개요

- 이벤트 기반 프로그래밍
    - **이벤트 발생에 의해 프로그램 흐름이 결정**
    - 이벤트 발생하면 이벤트 처리 루틴 실행
- 배치 프로그래밍
    - 프로그램 개발자가 프로그램의 흐름을 결정하는 방식

### 이벤트의 예

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b6b63df3-ebfb-46e9-bafe-00c2c8157694/Untitled.png)

어떤 이벤트가 있는가?

키보드 입력, 마우스 왼쪽 오른쪽 버튼 or 더블클릭, 마우스로 윈도우 크기 조절 

### 이벤트 처리 순서

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/025990ca-ca55-4509-a231-e2bdf5823103/Untitled.png)

마우스로 클릭을 한다 → new 라는 버튼을 누른 다 → JButton 

JVM 에서 이벤트 분배 스레드(ActionEvent 생성) 에서 이벤트 리스너 

- 이벤트 발생
- 이벤트 객체 생성
    - 현재 발생한 이벤트에 대한 여러 정보를 가진 객체
- 이벤트 리스너 찾기
- 이벤트 리스너 호출
    - 이벤트 객체가 리스너에 전달됨
- 이벤트 리스너 실행

### 이벤트 객체(event object)

- 발생한 이벤트에 관한 정보를 포함하는 객체(이벤트에 대한 정보를 담는)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ec4fd7b7-fff9-4c37-80c2-9449064eb46f/Untitled.png)

### 이벤트 객체에 포함된 정보

- 이벤트 종류
- 이벤트 소스
- 이벤트가 발생한 화면 좌표
- 이벤트가 발생한 컴포넌트 내 좌표
- 버튼이나 메뉴 아이템에 이벤트가 발생한 경우 버튼이나 메뉴 아이템의 문자열
- 클릭된 마우스 버튼 번호
- 마우스 클릭 횟수
- 키가 눌러졌다면 키의 코드 값 과 문자값
- 체크 박스, 라디오 버튼 등과 같은 컴포넌트에 이벤트가 발생하였다면 체크 상태

### 이벤트 객체의 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2ba57833-4ad3-43f8-b86d-9c3ecee8fea5/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2d33e6db-859f-4d97-b0a3-19ccc399a594/Untitled.png)

### 이벤트 객체와 이벤트 소스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f8e46ac6-7a29-4bcb-a595-781e31dfa596/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a40631bf-096e-4c1c-bba5-f1fc13fd6eb5/Untitled.png)

### 이벤트 리스너

- 발생한 이벤트를 처리하는 루틴
- 클래스를 작성해야함
- JDK 에서는 이벤트 리스너 작성을 위한 **인터페이스**
    - 개발자는 인터페이스의 모든 추상 메소드를 구현해야함 - Adapter 써서 다 안하는 법도 있
    - 이벤트가 발생하면 약속된 메소드 호출됨

ActionListener 인터페이스

```java
interface ActionListener { // 다음 메소드 구현
	// Action 이벤트 발생시 호출
	public void actionPerformed(ActionEvent e);
}
```

MouseListener 인터페이스

```java
interface MouseListener { // 다음 5개 메소드 구현
	// 마우스 버튼이 눌러지는 순간 호출
	public void mousePressed(MouseEvent e);
	// 눌러진 마우스 버튼이 떼어지는 순간 호출
	public void mouseReleased(MouseEvent e);
	// 마우스가 클릭되는 순간 호출
	public void mouseClicked(MouseEvent e);
	// 마우스가 컴포넌트 위에 올라가는 순간 호출
	public void mouseEntered(MouseEvent e);
	// 마우스가 컴포넌트 위에서 내려오는 순간 호출
	public void mouseExited(MouseEvent e);
}
```

### 이벤트 리스너 등록

- 이벤트를 처리할 컴포넌트에 이벤트  리스너 등록
- 이벤트 리스너가 등록된 컴포넌트에만 이벤트 등록

```java
component.addXXXListener(listener)
```

- XXX : 이벤트 명
- listener : 이벤트 리스너 객체
- 예 )
    - addMouseListener(new MyMouseListener())
    - addActionListener(new MyActionListener())
    - addFocusListener(new MyFocusListener())

### 리스너 인터페이스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4cf8d5dd-16c6-4694-b9eb-4e8151b8e13d/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/11bf7057-dba3-4a06-989e-d82d8e349097/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2441b8dd-ecd5-43e1-9bf3-2489d4054efa/Untitled.png)

### 예제 1.

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListenerMouseEx extends JFrame {
    ListenerMouseEx() {
        setTitle("버튼에 Mouse 이벤트 리스너 작성");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btn = new JButton("Mouse Event 테스트 버튼");
        btn.setBackground(Color.YELLOW);
        
        MyMouseListener listener = new MyMouseListener();
        btn.addMouseListener(listener);
        
        add(btn);
        
        setSize(300,150);
        setVisible(true);
    }

    public static void main(String [] args) {
        new ListenerMouseEx();
    }
}

class MyMouseListener implements MouseListener {
    public void mouseEntered(MouseEvent e) {
        JButton btn = (JButton)e.getSource();
        btn.setBackground(Color.RED);
    }

    public void mouseExited(MouseEvent e) {
        JButton btn = (JButton)e.getSource();
        btn.setBackground(Color.YELLOW);
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}
}
```

### 이벤트 리스너 등록의 특징

- 여러 이벤트에 대한 리스너 동시 등록 가

```java
button.addActionListener(listener1);
button.addKeyListener(listener2);
button.addFocusListener(listener3);
```

등록된 반대 방향으로 실행된다 3→2→1 

### 실습

- 예제 1을 수정하여 다음과 같이 기능 을 추가
    - 마우스 버튼을 누르면 버튼의 레이블을 ‘버튼 누름’으로 변경
    - 마우스 버튼을 놓으면 원래 버튼 레이블로 복

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListenerMouseEx extends JFrame {
    ListenerMouseEx() {
        setTitle("버튼에 Mouse 이벤트 리스너 작성");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btn = new JButton("Mouse Event 테스트 버튼");
        btn.setBackground(Color.YELLOW);
        
        MyMouseListener listener = new MyMouseListener();
        btn.addMouseListener(listener);
        
        add(btn);
        
        setSize(300,150);
        setVisible(true);
    }

    public static void main(String [] args) {
        new ListenerMouseEx();
    }
}

class MyMouseListener implements MouseListener {
    private String originalText;

    public void mouseEntered(MouseEvent e) {
        JButton btn = (JButton)e.getSource();
        btn.setBackground(Color.RED);
    }

    public void mouseExited(MouseEvent e) {
        JButton btn = (JButton)e.getSource();
        btn.setBackground(Color.YELLOW);
    }

    public void mousePressed(MouseEvent e) {
        JButton btn = (JButton)e.getSource();
        originalText = btn.getText();
        btn.setText("버튼 누름");
    }

    public void mouseReleased(MouseEvent e) {
        JButton btn = (JButton)e.getSource();
        btn.setText(originalText);
    }

    public void mouseClicked(MouseEvent e) {}
}
```

## 이벤트 리스너 작성 방법

- 이벤트 리스너 작성 방법을 구분하여 설명

### 이벤트 리스너 작성 방법

- 독립 클래스로 작성
    - 이벤트 리스너를 완전한 클래스로 작성
- 내부 클래스로 작성
- 익명 클래스로 작성

### 독립 클래스 사용

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IndepClassListener extends JFrame {
    IndepClassListener() {
        setTitle("Action 이벤트 리스너 작성");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,150);
        setVisible(true);
        
        JButton btn = new JButton("Action");
        MyActionListener listener = new MyActionListener();
        btn.addActionListener(listener);
        
        add(btn);
    }
    
    public static void main(String [] args) {
        new IndepClassListener();
    }
}

class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        if(b.getText().equals("Action")) {
            b.setText("액션");
        } else {
            b.setText("Action");
        }
    }
}
```

### 내부 클래스 사용

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame {
    InnerClassListener() {
        setTitle("Action 이벤트 리스너 작성");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
        
        JButton btn = new JButton("Action");
        add(btn);
        
        btn.addActionListener(new MyActionListener());
    }
    
    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action")) {
                b.setText("액션");
            } else {
                b.setText("Action");
            }

            setTitle(b.getText());
        }
    }
    
    public static void main(String [] args) {
        new InnerClassListener();
    }
}
```

### 익명 클래스 사용

- Anonymous class (익명 또는 무명 클래스)
- 클래스 몸체는 있지만 이름은 없는 클래스
- 클래스를 정의하면서 객체를 생성해야함

```java
new 익명클래스의슈퍼클래스이름(생성자인자들) {
		.....................
		익명클래스의 멤버 구현
		.....................
};
```

```java
btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
					// AnonymousClassListener나
					// JFrame의 멤버를 호출할 수 있음
					setTitle(b.getText());
					}
		}
);
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9947c0ce-9992-4f89-b6fb-f382d9aa3bc7/Untitled.png)

### 예제 9-4

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ce3d21c2-b5bd-48c0-85f2-79f3029043e9/Untitled.png)

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx extends JFrame {
    JLabel la = new JLabel("hello");

    MouseListenerEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.addMouseListener(new MyMouseListener());

        la.setSize(50, 20);
        la.setLocation(30, 30);
        contentPane.add(la);

        setSize(200,200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }

        public void mouseReleased(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String [] args) {
        new MouseListenerEx();
    }
}
```

### 실습 1

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d189cf4c-3e8a-4c6b-bfd6-d8a35a622b06/Untitled.png)

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx extends JFrame {
    JLabel la = new JLabel("Hello");
    JLabel coordinatesLabel = new JLabel();

    MouseListenerEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.addMouseListener(new MyMouseListener());

        la.setSize(50, 20);
        la.setLocation(30, 30);
        contentPane.add(la);
        
        coordinatesLabel.setSize(100, 20);
        coordinatesLabel.setLocation(90, 30);
        contentPane.add(coordinatesLabel);

        setSize(200,200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
            coordinatesLabel.setText("X: " + x + ", Y: " + y);
        }

        public void mouseReleased(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String [] args) {
        new MouseListenerEx();
    }
}
```

### 실습 2

- 독립 클래스를 사용하여 이벤트 리스너를 작성하도록 실습 1을 변경하시오

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f8d2dfe0-7b32-4ecb-994a-381c833bf673/Untitled.png)

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx extends JFrame {
    JLabel la = new JLabel("Hello");
    JLabel coordinatesLabel = new JLabel();

    MouseListenerEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        
        la.setName("HelloLabel");
        la.setSize(50, 20);
        la.setLocation(30, 30);
        contentPane.add(la);
        
        coordinatesLabel.setSize(100, 20);
        coordinatesLabel.setLocation(90, 30);
        contentPane.add(coordinatesLabel);

        contentPane.addMouseListener(new MyMouseListener(contentPane, coordinatesLabel));

        setSize(200,200);
        setVisible(true);
    }

    public static void main(String [] args) {
        new MouseListenerEx();
    }
}

class MyMouseListener implements MouseListener {
    private final Container contentPane;
    private final JLabel coordinatesLabel;

    public MyMouseListener(Container contentPane, JLabel coordinatesLabel) {
        this.contentPane = contentPane;
        this.coordinatesLabel = coordinatesLabel;
    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        coordinatesLabel.setText("X: " + x + ", Y: " + y);

        Component component = contentPane.findComponentAt(x, y);
        if(component instanceof JLabel) {
            ((JLabel) component).setLocation(x, y);
        }

        Component[] components = contentPane.getComponents();
        for (Component comp : components) {
            if (comp instanceof JLabel) {
                JLabel label = (JLabel) comp;
                if ("Hello".equals(label.getText())) {
                    label.setLocation(x, y);
                }
            }
        }
    }

    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
```

## Adapter 및 주요 이벤트

- Adapter 클래스 역할 및 종류
- Key 이벤트의 처리 과정
- Mouse 이벤트의 처리 과정

### Adapter 클래스

- 이벤트 리스너 구현에 따른 부담
    - 리스너의 추상 메소드를 모두 구현해야함
    - 예를 들어, 마우스 클릭한 경우
        - 마우스 리스너에서 마우스가 눌러지는 경우(mousePressed())만 처리하
        고자 할 때도 나머지 4 개의 메소드를 모두 구현해야 함
        
        ```java
        class MyMouseListener implements MouseListener {
        public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        la.setLocation(x, y);
        }
        	**public void mouseReleased(MouseEvent e) {}
        	public void mouseClicked(MouseEvent e) {}
        	public void mouseEntered(MouseEvent e) {}
        	public void mouseExited(MouseEvent e) {}**
        }
        ```
        
- 이벤트 리스너를 미리 구현해 놓은 클래스(JDK 제공)
- 메소드를 하나만 가진 리스너는 어댑터 존재하지 않음
    - ActionAdapter, ItemAdapter 클래스 해당
    
    ```java
    class MouseAdapter implements MouseListener
    {
    		public void mousePressed(MouseEvent e) {}
    		public void mouseReleased(MouseEvent e) {}
    		public void mouseClicked(MouseEvent e) {}
    		public void mouseEntered(MouseEvent e) {}
    		public void mouseExited(MouseEvent e) {}
    }
    ```
    

### Adapter 클래스 종류

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b22d5a58-c8be-4cf0-a6ae-2a606ed7ae61/Untitled.png)

### Adapter 사용 예 (예제 9-4)

MouseListener를 이용한 경우

```java
class MyMouseListener implements MouseListener {
public void mousePressed(MouseEvent e) {
int x = e.getX();
int y = e.getY();
la.setLocation(x, y);
}
public void mouseReleased(MouseEvent e) {}
public void mouseClicked(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
}
```

MouseAdapter를 이용한 경우

```java
class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		la.setLocation(x, y);
	}
}
```

### Lab.

- 예제 1을 다음과 같이 동작하도록 변경하시오
    - 버튼 위에 마우스 이동할 때와 버튼에서 내려올 때 버튼 색상 변경
    - Adapter를 사용
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4712920a-1fce-4c5a-99ec-0d6d67f68541/Untitled.png)
    

### Key 이벤트 발생 종류 및 순서

- keyPressed : 키 누르는 순간
- keyTyped : 누른 키를 떼는 순간(유니코드 경우)
- keyReleased : 누른 키를 뗴는 순간

KeyListener

```java
void keyPressed(KeyEvent e) {
	// 이벤트 처리 루틴
}
void keyTyped(KeyEvent e) {
	// 이벤트 처리 루틴
}
void keyReleased(KeyEvent e) {
	// 이벤트 처리 루틴
}
```

### 포커스

- 컴포넌트나 응용프로그램이 키 이벤트를 독점하는 권한
- 포커스(focus)를 가진 컴포넌트 만이 키 이벤트를 받음
- 모든 컴포넌트는 포커스만 있으면 키 입력 가능
- 포커스 요청: component.requestFocus()

### 유니코드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9fc607cb-b86e-48b9-8d96-3ee08b94407a/Untitled.png)

### 입력 키 구분

- char keyEvent.getKeyChar()
    - 유니코드 키의 문자 값 판별
- int KeyEvent.getKeyCode()
    - Unicode 문자를 포함한 모든 키 판별 (정수형 키 코드 값 반환)
        - <Function> 키, <Modifier(shift)> 키, <Control> 키, <Action> 키 포함
    - 운영체제나 하드웨어에 따라 키 셋은 서로 다름
    - 입력된 키를 판별하기 위해 가상키(Virtual Key) 값 비교
        - 가상 키 값은 KeyEvent 클래스의 상수로 정의
- String KeyEvent.getKeyText(int keyCode)
    - 키 코드 값에 해당하는 키 이름 문자열 반환

### 가상 키

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0fddb588-8fb3-4be4-8df2-cc942e59ed60/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ae326fd7-3fdd-4f6b-acd7-d2f600b3f7f2/Untitled.png)

### 예제 9-6 : KeyAdapter 활용

- Content pane에 <Enter> 키를 입력하면 배경색을 랜덤하게 바꾸고, 'q' 키를 입력하면 종료
    - Content pane에 key listener 설정 및 focus 할당
        - Listener는 내부 클래스로 작성
    - 색은 new Color(int r, int g, int b)로 생성

```java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
    JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다");

    KeyCharEx() {
        super("KeyListener의 문자 키 입력 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(la);
        c.addKeyListener(new MyKeyListener());

        setSize(250, 150);
        setVisible(true);

        c.requestFocus(); // 컨텐트팬에 포커스 설정
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            // 임의의 색을 만들기 위해 랜덤하게 r, g, b 성분 생성
            int r = (int) (Math.random() * 256); // red 성분
            int g = (int) (Math.random() * 256); // green 성분
            int b = (int) (Math.random() * 256); // blue 성분

            switch(e.getKeyChar()) { // 입력된 키 문자
                case '\n': // <Enter> 키 입력
                    la.setText("r=" + r + ", g=" + g + ", b=" + b);
                    getContentPane().setBackground(new Color(r, g, b));
                    break;
                case 'q':
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new KeyCharEx();
    }
}
```

### 활용 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b18ebc97-d96a-4613-b9a0-660bfff3280f/Untitled.png)

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyListenerEx extends JFrame {
    JLabel[] keyMessage;

    KeyListenerEx() {
        setTitle("KeyListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        addKeyListener(new MyKeyListener());

        keyMessage = new JLabel[3];
        keyMessage[0] = new JLabel("getKeyCode()");
        keyMessage[1] = new JLabel("getKeyChar()");
        keyMessage[2] = new JLabel("getKeyText()");

        for(int i = 0; i < keyMessage.length; i++) {
            add(keyMessage[i]);
            keyMessage[i].setOpaque(true);
            keyMessage[i].setBackground(Color.CYAN);
        }

        setSize(300, 150);
        setVisible(true);
        requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();
            keyMessage[0].setText(Integer.toString(keyCode));
            keyMessage[1].setText(Character.toString(keyChar));
            keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
        }
    }

    public static void main(String[] args) {
        new KeyListenerEx();
    }
}
```

### 활용 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c02c10aa-6827-495d-b7cb-b9f697a1f5bc/Untitled.png)

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel la = new JLabel();

    KeyCodeEx() {
        setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(contentPane);
        contentPane.addKeyListener(new MyKeyListener());
        contentPane.add(la);

        setSize(300,150);
        setVisible(true);
        contentPane.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            la.setText(e.getKeyText(e.getKeyCode()));
            if(e.getKeyChar() == '%') {
                contentPane.setBackground(Color.YELLOW);
            }
            else if(e.getKeyCode() == KeyEvent.VK_F1) {
                contentPane.setBackground(Color.GREEN);
            }
        }
    }

    public static void main(String[] args) {
        new KeyCodeEx();
    }
}
```

### 예제 9-7: 방향키로 문자열 이동

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bd70a588-5466-4cbf-9e3b-0a4be72c5c96/Untitled.png)

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel la = new JLabel("HELLO");
    final int FLYING_UNIT = 10;

    FlyingTextEx() {
        setTitle("텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.addKeyListener(new MyKeyListener());

        la.setLocation(50, 50);
        la.setSize(100, 20);
        contentPane.add(la);

        setSize(300, 300);
        setVisible(true);

        contentPane.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch(keyCode) {
                case KeyEvent.VK_UP:
                    la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
                    break;
                case KeyEvent.VK_DOWN:
                    la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
                    break;
                case KeyEvent.VK_LEFT:
                    la.setLocation(la.getX()-FLYING_UNIT, la.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    la.setLocation(la.getX()+FLYING_UNIT, la.getY());
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new FlyingTextEx();
    }
}
```

### 마우스 이벤트

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ae8af9a5-54f8-4b68-9e31-f6e8f1e8f158/Untitled.png)

### 마우스 클릭

- 마우스 버튼을 누른 후에 떼는 경우 호출되는 메소드 순서

```java
mousePressed()
mouseReleased()
mouseClicked()
```

mouseClicked() : 마우스가 눌러진 위치에서 놓을 때 호출
mouseReleased() : 마우스가 눌러진 위치이든 아니든 놓을 때 

는 항상 호출

### 마우스 드래그

- 마우스 드래그 동안 호출되는 메소드 순서

```java
mousePressed()
mouseDragged()
mouseReleased()
mouseClicked()
```

mouseDragged(): 마우스가 드래그되는 동안 반복 호출

### MouseEvent 객체 제공 정보

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/53af655e-067f-4293-8d7f-3f9509c3b7b3/Untitled.png)

### 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b752d6e6-28ac-49bc-9e18-54528357b398/Untitled.png)

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel la;

    MouseListenerAllEx() {
        setTitle("MouseListener와 MouseMotionListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(contentPane);
        contentPane.addMouseListener(new MyMouseListener());
        contentPane.addMouseMotionListener(new MyMouseListener());

        la = new JLabel("No Mouse Event");
        contentPane.add(la);

        setSize(300,200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {
        public void mousePressed(MouseEvent e) {
            la.setText("MousePressed ("+e.getX()+","+e.getY()+")");
        }

        public void mouseReleased(MouseEvent e) {
            la.setText("MouseReleased("+e.getX()+","+e.getY()+")");
        }

        public void mouseClicked(MouseEvent e) {}

        public void mouseEntered(MouseEvent e) {
            JPanel p = (JPanel)e.getSource();
            p.setBackground(Color.CYAN);
        }

        public void mouseExited(MouseEvent e) {
            JPanel p = (JPanel)e.getSource();
            p.setBackground(Color.YELLOW);
        }

        public void mouseDragged(MouseEvent e) {
            la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
        }

        public void mouseMoved(MouseEvent e) {
            la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
        }
    }

    public static void main(String[] args) {
        new MouseListenerAllEx();
    }
}
```

### 실습

- 더블클릭하면 content pane의 배경 색상을 무작위 변경
    - int r = (int)(Math.random()*256);
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e37e5c03-2af9-4803-b846-aa0363336f08/Untitled.png)
    
    ```java
    import javax.swing.*;
    import java.awt.event.*;
    import java.awt.*;
    
    public class MouseDoubleClickColorChange extends JFrame {
        JPanel contentPane = new JPanel();
    
        MouseDoubleClickColorChange() {
            setTitle("Double-Click to Change Color");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            setContentPane(contentPane);
            contentPane.addMouseListener(new MyMouseListener());
    
            setSize(300,200);
            setVisible(true);
        }
    
        class MyMouseListener extends MouseAdapter {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Check for double-click
                    int r = (int) (Math.random() * 256);
                    int g = (int) (Math.random() * 256);
                    int b = (int) (Math.random() * 256);
    
                    contentPane.setBackground(new Color(r, g, b));
                }
            }
        }
    
        public static void main(String[] args) {
            new MouseDoubleClickColorChange();
        }
    }
    ```
    

---

## 제네릭

- 제네릭의 개념
- 제네릭 클래스와 메소드를 정의

### 제네릭 만들기

- 클래스나 인터페이스 선언부에 일반화된 타입 추가

```java
public class MyGenericClass<T> {
		T value;
		void set(T val) {
			value = val;
		}
		T get() {
			return value;
		}
}
```

- 제네릭 클래스 레퍼런스 변수 선언 및 구체화
    - 구체적인 타입을 대입하여 변수 및 객체 생성
    
    ```java
    // 타입 T에 String 지정
    MyGenericClass<String> sObj = new MyGenericClass<String>();
    sObj.set("java");
    System.out.println(sObj.get()); // "java" 출력
    
    // 타입 T에 Integer 지정
    MyGenericClass<Integer> nObj = new MyGenericClass<Integer>();
    nObj.set(7);
    System.out.println(nObj.get()); // 숫자 7 출력
    ```
    

### 구체화 오류

- 타입 매개 변수에 기본 자료형 타입은 사용할 수 없음

```java
MyGenericClass<int> obj = new MyGenericClass<int>();
-> 
MyGenericClass<Integer> obj = new MyGenericClass<Integer>();
```

### 타입 매개 변수

- genric class 는 자료형을 변수로 표시 → 타입 매개 변수
    - < 과  > 사이에 하나의 대문자를 사용(임의 문자 사용 가능)
    - T : Type, E : Element, V: Value, K : key
- 타입 매개변수가 나타내는 자료형의 객체는 생성 불가
    - ex) ~~T obj = new T();~~

### 예제 1 : Generic Stack(1)

```java
class MyGenericStack<T> {
    private int index;
    private int size;
    private Object[] data;
    
    public MyGenericStack(int size) {
        this.index = 0;
        this.size = size;
        this.data = new Object[size];
    }
    
    public void push(T item) {
        if (index == size)
            return;
        
        data[index] = item;
        index++;
    }
    
    public T pop() {
        if (index == 0)
            return null;
        
        index--;
        return (T) data[index];
    }
    
    public boolean isEmpty() {
        if (index == 0)
            return true;
        else
            return false;
    }
}
```

### 예제 1 : Generic Stack(2)

```java
public class GenericStackTest {
    public static void main(String[] args) {
        MyGenericStack<String> sStack = new MyGenericStack<String>(5);
        sStack.push("milk");
        sStack.push("cheese");
        sStack.push("ham");
        while (!sStack.isEmpty())
            System.out.println(sStack.pop());
        
        MyGenericStack<Integer> nStack = new MyGenericStack<Integer>(7);
        nStack.push(7);
        nStack.push(3);
        nStack.push(9);
        nStack.push(2);
        while (!nStack.isEmpty())
            System.out.println(nStack.pop());
    }
}
```

실행 결과

```java
ham
cheese
milk
2
9
3
7
```

### 제네릭과 배열

- 제네릭 클래스와 인터페이스에 대한 배열 생성은 불가함

```java
MyGenericStack<Integer>[] gs = new MyGenericStack<Integer>[10];
```

- 타입 매개변수의 경우 배열에 대한 레퍼런스는 허용

```java
public void myArray(T[] a) {
....
}
```

### 제네릭 메소드

- 메소드 정의

```java
<T> return_type function_name(T param1, T param2, . . .)
{
	T variable . . .
	. . .
}
```

- 메소드 호출

```java
String str1 = new String("string");
String str2 = new String("string");
obj.<String>function_name(str1, str2);

Integer n1 = new Integer(7);
Integer n2 = new Integer(8);
obj.<Integer>function_name(n1, n2);
```

### 예제 2: Generic method

```java
public class GenericMethodTest {
    public static <T> boolean isEqual(T obj1, T obj2) {
        boolean result = obj1.equals(obj2);
        return result;
    }
    
    public static void main(String[] args) {
        String java = new String("java");
        String python = new String("python");
        boolean result = GenericMethodTest.<String>isEqual(java, python);
        System.out.println("첫 번째 결과: " + result);
        
        Integer n1 = 7;
        Integer n2 = 7;
        result = GenericMethodTest.<Integer>isEqual(n1, n2);
        System.out.println("두 번째 결과: " + result);
    }
}
```

실행 결과

```java
첫 번째 결과: false
두 번째 결과: true
```

### 실습 1.

- 다음과 같이 다양한 데이터를 출력할 수 있는 제너릭 메소드인 printArray() 를 작성하시오

```java
public static void main( String args[] ) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 5.1, 1.3, 3.7 };
		Character[] charArray = { 'j', 'a', 'v', 'a' };
		System.out.println( "정수 배열: " );
		printArray( intArray ); // Integer 배열 전달
		System.out.println( "실수 배열: " );
		printArray( doubleArray ); // Double 배열 전달
		System.out.println( "문자 배열: " );
		printArray( charArray ); // Character 배열 전달
}

실행 결과
정수 배열:
1 2 3 4 5
실수 배열:
5.1 1.3 3.7
문자 배열:
j a v a
```

```java
public class GenericMethodTest {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.1, 1.3, 3.7};
        Character[] charArray = {'j', 'a', 'v', 'a'};
        
        System.out.println("정수 배열:");
        printArray(intArray); // Integer 배열 전달
        
        System.out.println("실수 배열:");
        printArray(doubleArray); // Double 배열 전달
        
        System.out.println("문자 배열:");
        printArray(charArray); // Character 배열 전달
    }
}
```

### 와일드 카드(1)

- 어떤 타입이든 표현할 수 있음(?로 표시)
- 상한(upper bound)이 있는 와일드 카드(wildcard)
    - ? 다음에 extends 를 사용하여 상한을 표시
    
    ```java
    public static double sumOfList(Vector<? extends Number> v) {
    	double s = 0.0;
    	for(Number n : v)
    		s += n.doubleValue();
    	return s;
    }
    
    List<Integer> li = Arrays.asList(1, 2, 3);
    System.out.println("sum = " + sumOfList(li));
    
    List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
    System.out.println("sum = " + sumOfList(ld));
    ```
    
- 하한(lower bound)이 있는 와일드 카드
    - ? 다음에 super 를 사용하여 하한을 표시
    
    ```java
    public static void addToList(List<? super Integer> v) {
    	for(int i = 1; i <= 10; i++) {
    		v.add(i);
    	}
    }
    
    List<Integer>, List<Number>, and List<Object>
    ```
    

### 실습 2.

- 10개의 무작위 정수(int)와 5개의 무작위 실수(double) 값들에 대한 합과 평균을 각각 출력하시오
    - 정수 범위: [1, 100], 실수 범위: [0.0, 5.0)
    - 방법 1: 제너릭 메소드 활용
    - 방법 2: 와일드 카드 활용

```java
elements in Integer Vector...
76 52 8 15 48 58 47 35 67 56
정수 합: 462
정수 평균: 46.2
elements in Double Vector...
1.0255007756297903 0.8737435788479719 2.971143952426605 0.9236003642893625 4.262318670922103
실수 합: 10.056307342115833
실수 평균: 2.0112614684231667
```

- 방법 1

```java
import java.util.Random;
import java.util.Vector;

public class VectorTest {
    public static <T> void print(Vector<T> v) {
        for (int n = 0; n < v.size(); n++) {
            T val = v.elementAt(n);
            System.out.print(val + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int n_sum = 0;
        double d_sum = 0.0;
        double average = 0.0;
        Vector<Integer> nv = new Vector<Integer>();
        for (int n = 0; n < 10; n++) {
            nv.add((int) (Math.random() * 100) + 1); // 1 ~ 100
        }
        System.out.println("elements in Integer Vector...");
        VectorTest.<Integer>print(nv);

        for (int n = 0; n < nv.size(); n++) {
            int val = nv.elementAt(n);
            n_sum += val;
        }
        average = (double) n_sum / nv.size();
        System.out.println("정수 합: " + n_sum);
        System.out.println("정수 평균: " + average);

        Vector<Double> dv = new Vector<Double>();
        for (int n = 0; n < 5; n++) {
            dv.add(Math.random() * 5.0); // 0.0 ~ 5.0
        }
        System.out.println("elements in Double Vector...");
        VectorTest.<Double>print(dv);

        for (int n = 0; n < dv.size(); n++) {
            double val = dv.elementAt(n);
            d_sum += val;
        }
        average = d_sum / dv.size();
        System.out.println("실수 합: " + d_sum);
        System.out.println("실수 평균: " + average);
    }
}
```

- **`print`**: 제네릭 메서드로, **`Vector<T>`**를 받아서 벡터의 요소를 출력합니다.
- **`main`**: 테스트를 위한 메인 메서드입니다. 정수 벡터와 실수 벡터를 생성하고, 요소를 출력한 후 합과 평균을 계산하여 출력합니다.

- 방법 2

```java
import java.util.Random;
import java.util.Vector;

public class VectorTest {
    public static void print(Vector<? extends Number> v) {
        for (int n = 0; n < v.size(); n++) {
            **Number val = v.elementAt(n);**
            System.out.print(val + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int n_sum = 0;
        double d_sum = 0.0;
        double average = 0.0;
        Vector<Integer> nv = new Vector<Integer>();
        for (int n = 0; n < 10; n++) {
            nv.add((int) (Math.random() * 100) + 1); // 1 ~ 100
        }
        System.out.println("elements in Integer Vector...");
        **print(nv);**
        for (int n = 0; n < nv.size(); n++) {
            int val = nv.elementAt(n);
            n_sum += val;
        }
        average = (double) n_sum / nv.size();
        System.out.println("정수 합: " + n_sum);
        System.out.println("정수 평균: " + average);
        
        Vector<Double> dv = new Vector<Double>();
        for (int n = 0; n < 5; n++) {
            dv.add(Math.random() * 5.0); // 0.0 ~ 5.0
        }
        System.out.println("elements in Double Vector...");
        **print(dv);**
        for (int n = 0; n < dv.size(); n++) {
            double val = dv.elementAt(n);
            d_sum += val;
        }
        average = d_sum / dv.size();
        System.out.println("실수 합: " + d_sum);
        System.out.println("실수 평균: " + average);
    }
}
```

주요 변경 사항:

- **`print`** 메서드의 매개변수 제네릭 타입을 **`Vector<? extends Number>`**로 수정합니다.
- **`print`** 메서드를 호출할 때 타입 파라미터를 명시하지 않습니다.
- 코드의 나머지 부분은 변경되지 않습니다.

### 실습 3.

- 사칙연산의 표현식을 입력 받아 계산 결과 출력
    - 0902.Math클래스'의 실습 문제를 확장
    - Stack 클래스 사용:
        - https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html

```java
import java.util.Scanner;
import java.util.Stack;

public class StringTest {
    public static double calculate(double operand1, double operand2, char operator) {
        double result = 0.0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        String soperand[];
        Scanner scanner = new Scanner(System.in);
        System.out.print("계산식>> ");
        String line = scanner.nextLine();
        scanner.close();

        // 피연산자 분리
        soperand = line.split("[+*/-]");
        System.out.println("피연산자 분리 결과");
        for (int n = 0; n < soperand.length; n++) {
            soperand[n] = soperand[n].trim();
            System.out.println(soperand[n]);
        }

        // 피연산자 실수 변환
        double[] operand = new double[soperand.length];
        System.out.println("피연산자 실수 변환 결과");
        for (int n = 0; n < soperand.length; n++) {
            operand[n] = Double.parseDouble(soperand[n]);
            System.out.println(operand[n]);
        }

        // 연산자 저장할 스택 생성
        Stack<Character> operatorStack = new Stack<>();

        // 피연산자 저장할 스택 생성
        Stack<Double> operandStack = new Stack<>();

        // 표현식 계산
        for (char c : line.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                // 현재 연산자를 스택에 저장
                operatorStack.push(c);
            } else {
                // 숫자를 만나면 피연산자 스택에 저장
                operandStack.push(Double.parseDouble(String.valueOf(c)));
            }

            // 스택에서 피연산자 두 개와 연산자 하나를 가져와 계산 후 결과를 다시 스택에 저장
            if (operatorStack.size() >= 1 && operandStack.size() >= 2) {
                double operand2 = operandStack.pop();
                double operand1 = operandStack.pop();
                char operator = operatorStack.pop();
                double result = calculate(operand1, operand2, operator);
                operandStack.push(result);
            }
        }

        // 최종 결과 출력
        if (!operandStack.isEmpty()) {
            double finalResult = operandStack.pop();
            System.out.println("계산 결과: " + finalResult);
        } else {
            System.out.println("피연산자가 없습니다.");
        }
    }
}
```

## 입출력 스트림과 파일 입출력

### stream (스트림)

- 입출력 장치와 프로그램을 연결하여 이들 사이의 데이터 흐름을 처리하는 소프트웨어 모듈
    - input stream (입력 스트림)
        - 입력 장치로부터 자바 프로그램으로 전달되는 데이터 흐름 또는 데이터 전송 소프트웨어 모듈
    - output stream (출력 스트림)
        - 자바 프로그램에서 출력 장치로 보내는 데이터 흐름 또는 데이터 전송 소프트웨어 모듈
- stream의 기본 단위 는 바이트
- 자바 입출력 stream 특징 : 단방향, 선입선출 구조

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f2c70641-386e-4350-ae65-bae8de279c05/Untitled.png)

→ 자바 프로그램 개발자는 직접 입력 장치에서 자료를 읽지 않고 **입력 stream을 통해 읽으**며, 스크린 등 출력 장치에 직접 출력하지 않고 **출력 stream에 출력**하면 된다

### stream 의 종류

- byte stram(바이트 스트림)
    - 단순 바이트(이진 데이터)의 흐름으로 처리
    - 예) 영상 파일을 읽는 입력 스트림
- character stream (문자 스트림)
    - 문자의 입출력만 처리
    - 문자가 아닌 이진 데이터는 처리 과정에서 문제 발생(글자 깨짐 현상 등)
    - 예) 텍스트 파일을 읽는 입력 스트림
- JDK 는 입출력 스트림을 구현한 다양한 클래스를 제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/359693bc-9e58-4e2e-8327-4497ff981130/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/363c2b22-78f8-4417-8184-39f12e1f61a5/Untitled.png)

### 바이트 스트림 클래스 계층 구조

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/30c68577-0fe4-4f2f-987a-05e0981f7358/Untitled.png)

### 문자 스트림 클래스 계층 구조

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/06428965-d696-4408-9a60-2ae0ffd80dda/Untitled.png)

### 스트림 연결

- 스트림은 연결이 될 수 있다.
    - 표준 입력 스트림 [System.in](http://System.in) 에 InputSTreamReader 스트림 연결 사
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b32ee091-b20c-47e0-90a1-127d189dd71e/Untitled.png)
    

### 바이트 스트림 클래스 개요(1)

- [java.io](http://java.io) 패키지에 포함
- InputStream/OutputStream
    - 추상 클래스
    - 바이트 입출력 스트림을 다루는 모든 클래스의 슈퍼 클래스
- FileInputStream/FileOutputStream
    - 파일로부터 바이트 단위로 읽거나 저장하는 클래스
    - 이진 파일의 입출력

### 이진 파일 읽기

- FileInputStream 클래스 이용
    - 스트림을 생성하고 파일을 열어 스트림과 연결
        
        ```java
        FileInputStream fin = new FileInputStream("c:\\test.bin");
        ```
        
    - 파일 읽기
        - read() 로 바이트 하나 씩 파일에서 읽음
        
        ```java
        int n=0, c;
        while((c = fin.read()) != -1) { // 파일 끝까지 반복
        	b[n++] = (byte)c; // 읽은 바이트를 배열에 저장
        }
        ```
        
    - 스트림 닫기
        - 더 이상 사용 필요 없는 스트림은 닫아야함
        
        ```java
        fin.close();
        ```
        

### FileInputStream의 생성자

| 생성자  | 설명 |
| --- | --- |
| FileInputStream(File file) | file이 지정하는 파일로부터 읽는 FileInputStream 생성 |
| FileInputStream(String name) | name 이 지정하는 파일로부터 읽는 FileInputStream 생성 |

### InputStream의 주요 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/26447a53-43d5-489d-bdb4-e82f09a91db1/Untitled.png)

### 예제 13-4 : 이진 파일 읽기

이진 파일 내용

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c3a1169d-4b51-4335-945d-a52d33eee9de/Untitled.png)

```java
import java.io.*;

public class FileInputStreamEx {
    public static void main(String[] args) {
        **byte[] b = new byte[6]; // byte 배열 생성**
        **try {**
            FileInputStream fin = **new FileInputStream("c:\\test.out");**
            int n = 0, c;
            while ((c = fin.read()) != -1) {
                b[n] = (byte) c; // 읽은 바이트를 배열에 저장
                n++;
            }
            System.out.println("c:\\test.out 출력합니다.");
            for (int i = 0; i < b.length; i++)
                System.out.print(b[i] + " ");
            System.out.println();
            fin.close();
        } **catch (IOException e) {
            System.out.println(e);
        }**
    }
}
```

실행 결과 

```java
c:\test.out 출력합니다.
7 51 3 4 -1 24
```

- read() 메소드의 반환형이 int 인 이유
    - byte : 1byte 의 정수 크기를 저장하는 자료형, -128 ~ 127
    - 저장한 데이터에  0xFF 을 포함하는 경우
        - byte형으로 해석하는 0xFF(-1)
        - int 형으로 해석하면 0x000000FF(255)
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/60fb0908-c1db-4949-b755-864c3b8e6fff/Untitled.png)
        

### 이진 파일 쓰기

- FileOutputStream 사용

```java
FileOutputStream fout = new FileOutputStream("c:\\test.bin");

int num[]={1, 4, -1, 88, 50};
byte b[]={7, 51, 3, 4, 1, 24};

for(int i=0; i<num.length; i++)
	fout.write(num[i]);

fout.write(b);

fout.close();
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5c668ef5-fc2a-4b7d-994d-9bcf05d712cd/Untitled.png)

### FileOutputStream의 주요 생성자

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e6008eaf-4ed6-4f4d-ba97-a8ca28aad66c/Untitled.png)

### OutputStream의 주요 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/05c2c5d6-24d4-4467-bc54-aad3c535b55a/Untitled.png)

### 예제 13-3

```java
import java.io.*;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7, 51, 3, 4, -1, 24};
        try {
            FileOutputStream fout = new FileOutputStream("c:\\test.out");
            for (int i = 0; i < b.length; i++)
                fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
            fout.close();
        } catch (IOException e) {
        }
        System.out.println("c:\\test.out을 저장하였습니다.");
    }
}
```

실행 결과

```java
c:\test.out을 저장하였습니다.
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/70becc4f-5ff8-42b1-af14-faa0e64d4b3f/Untitled.png)

### 문자 스크림 클래스

- [java.io](http://java.io) 패키지에 포함
- Reader/Writer
    - 추상 클래스
    - 문자 스트림을 다루는 모든 클래스의 슈퍼 클래스
- InputStreamReader/OutputStreamWriter
    - 바이트 스트림과 문자 스트림을 연결시켜주는 다리 역할 수행
    - 지정된 문자 집합 이용
    - InputStreamReader : 바이트를 읽어 문자로 인코딩
    - OutputStreamWriter : 문자를 바이트로 디코딩하여 출력
- FileReader/FileWriter
    - 텍스트 파일에서 문자 데이터 입출력

### 텍스트 파일 읽기

- FileReader 클래스 이용
    - 파일 입력 스트림 생성 : 파일 열기
    
    ```java
    FileReader fin = new FileReader("c:\\test.txt");
    ```
    
    - 파일 읽기
        - read() 를 사용하여 문자 단위로 파일에서 읽음
        
        ```java
        int c;
        while((c = fin.read()) != -1) { // 파일 끝까지 반복
        	System.out.print((char)c); // 문자 화면에 출력
        }
        ```
        
    - 스트림 닫기
        - 더 이상 사용 필요 없는 스트림은 닫아야 함
        
        ```java
        fin.close();
        ```
        

### 파일 입출력과 예외 처리

- 파일 입출력 동안 예외 발생 가능
    - 스트림 생성 과정 : FileNotFoundException 발생
        - 파일 경로 오류, 디스크 고장 등으로 열 수 없음
        
        ```java
        FileReader fin = new FileReader("c:\\test.txt"); ");
        ```
        
    - 파일 읽기, 쓰기, 닫기 과정 : IOException 발생
        - 디스크 오동작, 파일 손상, 디스크 공간 부족 등으로 파일 입출력 불가
        
        ```java
        int c = fin.read();
        ```
        
- try-catch 블록 반드시 사용
    - 자바 컴파일러 강제 사앙
    
    ```java
    try {
    	FileReader fin = new FileReader("c:\\test.txt");
    		...
    		int c = fin.read();
    		...
    		fin.close();
    	} catch(FileNotFoundException e) { //생략 가능 FileNotFoundException은 IOException을 상속
    		System.out.println("파일을 열 수 없음");
    	} catch(IOException e) {
    		System.out.println("입출력 오류");
    	}
    ```
    
- try-with-resource
    - close() 를 사용하지 않고, try안의 코드가 모두 실행된 후 자동으로 close() 메소드를 호출해주는 기능
    - 이때 try-with-resource 안에 사용하는 클래스 AutoCloseAble 인터페이스를 상속해야만 가능

### 예제 : try-with-resources

- try-with-resource 사용 전

```java
import java.io.*;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7, 51, 3, 4, -1, 24};
        try {
            FileOutputStream fout = new FileOutputStream("c:\\test.out");
            for (int i = 0; i < b.length; i++)
                fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
            fout.close();
        } catch (IOException e) {
        }
        System.out.println("c:\\test.out을 저장하였습니다.");
    }
}
```

- try-with-resource 사용 후

```java
import java.io.*;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7, 51, 3, 4, -1, 24};
        try (FileOutputStream fout = new FileOutputStream("c:\\test.out");) {
            for (int i = 0; i < b.length; i++)
                fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
        } catch (IOException e) {
        }
        System.out.println("c:\\test.out을 저장하였습니다.");
    }
}
```

### 예제 13-1 : 텍스트 파일 읽기

```java
import java.io.*;

public class FileReaderEx {
    public static void main(String[] args) {
        // 파일로부터 문자 입력 스트림 생성
        try (FileReader in = new FileReader("c:\\windows\\system.ini");) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
```

실행 결과

```java
; for 16-bit app support
[386Enh]
woafont=dosapp.fon
EGA80WOA.FON=EGA80WOA.FON
EGA40WOA.FON=EGA40WOA.FON
CGA80WOA.FON=CGA80WOA.FON
CGA40WOA.FON=CGA40WOA.FON
[drivers]
wave=mmdrv.dll
timer=timer.drv
[mci]
```

### FileReader 의 주요 생성자

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/edf2beb1-e742-49bf-b0c0-0c4e7f1e5f5e/Untitled.png)

### Reader 의 주요 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/203914eb-9719-4b8b-b674-280872beabf6/Untitled.png)

### 문자 스트림으로 텍스트 파일 쓰기

- FileWriter 클래스 이용
    - 파일 출력 스트림 생성 : 파일 열기
    
    ```java
    FileWriter fout = new FileWriter("c:\\test.txt");
    ```
    
    - 파일 쓰기
        - 문자 하나 씩 파일에 기록
        
        ```java
        fout.write('A'); // 문자 'A'를 파일에 기록
        ```
        
        - **블록 단위**로 쓰기 가능
        
        ```java
        char [] buf = new char [1024];
        fout.write(buf, 0, buf.length);
        ```
        
        - 스트림 닫기
        
        ```java
        fout.close();
        ```
        

### 예제 13-2: 키보드 입력 저장(FileWriter)

```java
import java.io.*;

public class FileWriterEx {
    public static void main(String[] args) {
        int c;
        try (InputStreamReader in = new InputStreamReader(System.in);
             FileWriter fout = new FileWriter("c:\\tmp\\test.txt");) {
            while ((c = in.read()) != -1) {
                fout.write(c);
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4f200abb-ba59-466f-a827-b03208f904e0/Untitled.png)

### FileWriter 의 생성자

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4d89f8d1-2827-4238-a860-85596756318f/Untitled.png)

### Writer의 주요 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7e550ae8-4853-42de-89cf-c97269a7269a/Untitled.png)

### File 클래스

- 파일의 경로명을 다루는 클래스
    - java.io.File
    - 파일과 디렉터리 경로명의 추상적 표현
- 파일 이름 변경, 삭제, 디렉터리 생성, 크기 등 파일 관리
    - File 객체는 파일 읽고 쓰기 기능 없음
    - 파일 입출력을 위해서는 파일 스트림 클래스 이용

### File 클래스 생성자

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ec7a6110-d41e-46c8-a49c-3065d16727b9/Untitled.png)

### File 클래스 주요 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b70a76fb-e4d1-46f8-abb4-3b383f616521/Untitled.png)

### File 클래스 사용 사례

- 파일 객체 생성

```java
File f = new File("c:\\bin\\test.txt");
```

- 파일 크기

```java
long size = f.length();
```

- 파일 이름/경로

```java
String fname = f.getName(); // test.txt
String path = f.getPath(); // c:\\bin\\test.txt
String parent = f.getParent(); // c:\\bin
```

- 파일/디렉터리 구분

```java
File f = new File("c:\\windows\\system.ini");
String res;

if(f.isFile()) // 파일 타입이면
	res = "파일";
else // 디렉터리 타입이면
	res = "디렉터리";

System.out.println(f.getPath() + "은 " + res + "입니다.");
```

```java
c:\windows\system.ini은 파일입니다.
```

- 서브 디렉터리 리스트 얻기

```java
File f = new File("c:\\tmp\\java_sample");
String[] filenames = f.list(); // 파일명 리스트 얻기
for (int i=0; i<filenames.length; i++) {
	File sf = new File(f, filenames[i]);
	System.out.print(filenames[i]);
	System.out.print("\t파일 크기: " + sf.length());
}
```

### 예제 13-5 : File 클래스 활용한 파일 관리

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/85a98798-76df-41d0-a6d6-3b6b9efbc520/Untitled.png)

```java
import java.io.File;

public class FileClassExample {
    // 디렉터리에 포함된 파일과 디렉터리의 이름,
    // 크기, 수정 시간을 출력하는 메소드
    public static void dir(File fd) {
        // 디렉터리에 포함된 파일 리스트 얻기
        String[] filenames = fd.list();
        for (String s : filenames) {
            File f = new File(fd, s);
            long t = f.lastModified(); // 마지막으로 수정된 시간
            System.out.print(s);
            System.out.print("\t파일 크기: " + f.length()); // 파일 크기
            System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
        }
    }

    public static void main(String[] args) {
        File f1 = new File("c:\\windows\\system.ini");
        File f2 = new File("c:\\tmp\\java_sample");
        File f3 = new File("c:\\tmp");
        String res;
        if (f1.isFile()) // 파일 타입이면
            res = "파일";
        else // 디렉터리 타입이면
            res = "디렉터리";
        System.out.println(f1.getPath() + "은 " + res + "입니다.");

        if (!f2.exists()) { // f2가 나타내는 파일이 존재하는지 검사
            if (!f2.mkdir()) // 존재하지 않으면 디렉터리 생성
                System.out.println("디렉터리 생성 실패");
        }
        if (f2.isFile()) // 파일 타입이면
            res = "파일";
        else // 디렉터리 타입이면
            res = "디렉터리";
        System.out.println(f2.getPath() + "은 " + res + "입니다.");

        dir(f3); // c:\tmp에 있는 파일과 디렉터리 화면에 출력

        // 파일 이름 변경
        f2.renameTo(new File("c:\\tmp\\javasample"));

        dir(f3);
    }
}
```

### 예제 13-6 : 텍스트 파일 복사

```java
import java.io.*;

public class TextCopy {
    public static void main(String[] args) {
        File src = new File("c:\\windows\\system.ini");
        File dst = new File("c:\\tmp\\system.txt");
        int c;
        try {
            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(dst);
            while ((c = fr.read()) != -1) {
                fw.write((char) c);
            }
            fr.close();
            fw.close();
            System.out.println(src.getPath() + "를 " + dst.getPath() + "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
```

실행 결과

```java
c:\windows\system.ini를 c:\tmp\system.txt로 복사하였습니다.
```

### 예제 13-7 : 이진 파일 복사

```java
import java.io.*;

public class BinaryCopy {
    public static void main(String[] args) {
        File src = new File("c:\\windows\\explorer.exe");
        File dst = new File("c:\\tmp\\explorer.bin");
        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dst);
            while ((c = fi.read()) != -1) {
                fo.write((char) c);
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath() + "를 " + dst.getPath() + "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
```

### 예제 13-8: 고속 처리를 위한 블록 단위 복사

```java
import java.io.*;

public class BlockBinaryCopy {
    public static void main(String[] args) {
        File src = new File("c:\\Pictures\\desert.jpg"); // 원본 파일
        File dest = new File("c:\\tmp\\desert.jpg"); // 복사 파일
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            byte[] buf = new byte[1024 * 10]; // 10KB 버퍼
            while (true) {
                int n = fi.read(buf); // 버퍼 크기만큼 읽기. n은 읽은 바이트 수
                fo.write(buf, 0, n); // buf[0]부터 n 바이트 쓰기
                if (n < buf.length)
                    break; // 파일 끝에 도달하여 복사 종료
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
```

### 문자집합 설정 (InputStreamReader)

- MS949 : 한글 완성형 확장형 문자 집합 UTF-8, euc-kr, CP949(or MS949)

```java
FileInputStream fin = new FileInputStream("c:\\tmp\\hangul.txt");
InputStreamReader in = new InputStreamReader(fin, "MS949");
```

```java
while ((c = in.read()) != -1) {
System.out.print((char)c);
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/08e37614-4a29-4e63-87e6-7617a0b5ea03/Untitled.png)

### 예제: 한글 텍스트 파일 읽기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3981177c-04fe-46e9-a9ea-14eb93a8b1c2/Untitled.png)

```java
import java.io.*;

public class FileReadHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("c:\\tmp\\hangul.txt");
            in = new InputStreamReader(fin, "MS949");
            int c;
            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
```

실행 결과

```java
인코딩 문자 집합은 MS949
가나다라마바사아자차카타파하
```

### 예제: 잘못된 문자 집합 설정

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f0d6502e-263b-4f65-a239-62ceff5f91bd/Untitled.png)

```java
import java.io.*;

public class FileReadHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("c:\\tmp\\hangul.txt");
            in = new InputStreamReader(fin, "US-ASCII");
            int c;
            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
```

실행 결과

```java
인코딩 문자 집합은 ASCII
????????????????????????????
```

### 데이터 스트림

- DataInputStream 및 DataOutputStream 클래스
- **기본 자료형 단위로 데이터를 읽고 쓸 수 있음**

### DataInputStream

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d1567b43-1665-4a3a-af5d-5e1152139c53/Untitled.png)

### DataOutputStream

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dcef1173-5320-46bc-9f70-9e39ba2b0f8c/Untitled.png)

### 예제

```java
import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) {
        **DataInputStream in = null;**
        **DataOutputStream out = null;**
        
        try {
            out = new **DataOutputStream(new FileOutputStream("data.bin"));**
            out.writeDouble(7.39);
            out.writeInt(392);
            out.writeChar('한');
            out.writeUTF("자바 연습");
            out.close();
            
            in = new **DataInputStream(new FileInputStream("data.bin"));**
            System.out.println(in.readDouble());
            System.out.println(in.readInt());
            System.out.println(in.readChar());
            System.out.println(in.readUTF());
            in.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
```

### 직렬화

- ObjectInputStream과 ObjectOutputStream 클래스
- 객체가 가진 데이터들을 순차적인 데이터로 변환

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ba646d2f-c4ed-438f-95ab-dc3c819f69ac/Untitled.png)

### 예제

```java
import java.io.*;
import java.awt.Point;
import java.util.Date;

public class ObjectStreamTest {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream("object.bin"));
            Point pt1 = new Point(7, 19);
            Date dt1 = new Date();
            out.writeObject(pt1);
            out.writeObject(dt1);
            out.close();
            
            in = new ObjectInputStream(new FileInputStream("object.bin"));
            Point pt2 = (Point) in.readObject();
            Date dt2 = (Date) in.readObject();
            in.close();
            
            System.out.println(pt2);
            System.out.println(dt2);
        } catch (IOException e) {
            System.out.println("입출력 오류");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스 오류");
        }
    }
}
```

### 버퍼 스트림

- 버퍼 스트림
    - 버퍼를 가진 스트림
    - 입출력 데이터를 일시적으로 저장하는 버퍼를 이용하여 입출력 효과율 개선
- 버퍼 입출력의 목적
    - 입출력 시 운영체제의 api 호출 횟수를 줄여 입출력 성능 개선
        - 출력 시 여러 번 출력되는 데이터를 버퍼에 모아두고 한 번에 장치로 출력
        - 입력 시 입력 데이터를 버퍼에 모아두고 한 번에 프로그램에 전달
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e9303fe2-a240-429c-a6c9-4d0e5b3abdc9/Untitled.png)
    

### 버퍼 스트림 종류

- 바이트 버퍼 스트림
    - 바이트 단위의 바이너리 데이터를 처리하는 버퍼 스트림
    - BufferedInputStream와 BufferedOutputStream
- 문자 버퍼 스트림
    - 유니코드의 문자 데이터만 처리하는 버퍼 스트림
    - BufferedReader와 BufferedWriter

### BufferedOutputStream

```java
BufferedOutputStream bout = new BufferedOutputStream(System.out, 20);
FileReader fin = new FileReader("c:\\windows\\system.ini");

int c;
while ((c = fin.read()) != -1) {
	bout.write((char)c);
}
fin.close();
bout.close();
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2f44f0e4-a9f4-46ea-a16f-445c9a847880/Untitled.png)

### 예제: 버퍼 스트림을 이용하는 출력 예제

```java
import java.io.*;

public class BufferedIOEx {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
        
        try {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            
            out.flush(); // 버퍼 비움
            
            if (in != null) {
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9e8c4358-a47a-4a73-a938-6c93b7678362/Untitled.png)

### PrintStream 및 PrintWriter 클래스

- PrintStream 클래스
    - 바이트를 입력 받아 텍스트 형식으로 출력
    - System.out
- PrintWriter 클래스
    - 문자를 입력 받아 텍스트 형식으로 출력
- 특징
    - 형식화된 출력 기능 제공
    - print(), println(), printf(), format()

```java
import java.io.*;

public class FormattedWriter {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            out.println("3.14");
            out.println("1573");
            out.println("자바 프로그래밍");
            out.close();
        } catch (IOException e) {
            System.out.println("파일 오류");
        }
    }
}
```

### 임의 접근 파일

```java
 new RandomAccessFile("all.zip", "r");
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1a320a9f-042d-460f-aac5-6ed79d23f14a/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ea6978f2-2f95-4539-8b08-bd0f25c7fd16/Untitled.png)

## 스레드 - 개요

- 멀티 태스킹과 멀티 스레딩의 차이
- 자바에서 스레드 생성
- 스레등 정보와 스레드 상태 변화
- 스레드 스케줄링 정책 대해 설명할 수 있다.

### Multi-tasking

- 여러 개의 어플리케이션을 동시에 실행 → 컴퓨터 성능 향상

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/30175f39-5429-4973-a1f3-cc1ca4929715/Untitled.png)

### Multi-threading

- 하나의 어플리케이션에서 여러 가지 작업을 동시에 수행

- 각각의 작업을 스레드로 처리
    - thread of control(execution)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aec333a6-5ab7-4523-abe1-a4fbf7c46ff0/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5d3c2d62-9122-47fd-9e47-211456422302/Untitled.png)

### process vs. thread

- 컴퓨터에서의 2가지 실행 단위: 프로세스와 스레드
- 프로세스
    - 실행 중인 하나의 프로그램(1:1, N : 1)
    - 고유한 실행 환경(메모리 및 기타 자원) 을 가짐
    - 프로세스 간의 통신(IPC)을 위해 큰 오버헤드 발생
    - Context Switching 에 따른 과도한 작업량과 많은 시간 소모
- 스레드
    - 프로세스 내부에 존재
    - 어플리케이션 내의 자원과 메모리 공유
    - context switching 시에 작업량이 적고 짧은 시간 소모

### 자바에서 멀티태스킹

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e1e624a0-e0e9-4a49-a43e-c823cb225dd4/Untitled.png)

자바 어플리케이션이 시작될 때 JVM이 함께 실행되고 종료하면 JVM도 함께 종료

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3dc04d63-1ea4-4a69-ad20-41dfc94b1fd2/Untitled.png)

두 개의 자바 응용프로그램을 동시에 실행하려고 하면
두 개의 JVM을 이용하고 응용프로그램은 서로 소켓 등을 이용하여 통신

### 자바 스레드와 JVM

- 자바 스레드
    - JVM 에 의해 스케쥴되는 실행 단위의 코드 블록
- 스레드 구성
    - 스레드 코드
        - 작업을 실행하기 위해 작성한 프로그램 코드
        - 개발자가 작성
    - 스레드 정보
        - 스레드 명, 스레드 ID, 스레드의 실행 소요 시간, 스레드의 우선 순위 등
        - 운영체제가 스레드에 대해 관리하는 정보

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4c35d9a6-d383-4ba1-bb27-987c89f3a4cb/Untitled.png)

- JVM이 스레드 관리
    - 스레드 개수
    - 스레드 코드 위치
    - 스레드 우선순위
- JVM에 의해 스레드 스케줄링 처리
    - 4개의 스레드 중에서 2번 스레드가 스케줄링되어 실행되고 있음

### 스레드 사용의 주의점

- 공유 데이터에 대한 동기화 처리

### 스레드 생성

- java.lang.Thread 클래스 사용
- java.lang.Runnable 인터페이스 사용

### Thread 클래스 사용

- Thread 클래스를 상속하여 새로운 클래스 작성
- run() 메소드(스레드 코드)를 오버라이딩
    - run() 메소드가 종료하면 스레드 종료
    
    ```java
    class TimerThread extends Thread {
    		public void run() {
    				. . .
    		}
    }
    ```
    
- Thread 서브클래스의 객체 생성

```java
TimerThread th = new TimerThread();
```

- start() 메소드를 호출하여 스레드 시작

```java
th.start();
```

### 예제 1.

- Thread를 상속하여 1초 단위로 초 시간을 출력하는 TimerThread 스레드 작성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bf1bc62b-3e06-4063-9975-5eaf846c60d0/Untitled.png)

```java
class TimerThread extends Thread {
    int n = 0;

    public void run() {
        while (true) { // 무한루프 실행
            System.out.println(n);
            n++;
            try {
                sleep(1000); // 1초 동안 잠을 잔 후 깨어남
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        TimerThread th = new TimerThread();
        th.start();
    }
}
```

실행 결과

```java
0
1
2
3
4
```

### 예제 12-1

- Thread를 상속받아 1초 단위의 타이머 만들기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3f56ab91-64dd-4061-aab1-7724f0ca14bc/Untitled.png)

```java
import java.awt.*;
import javax.swing.*;

public class ThreadTimerEx extends JFrame {
    public ThreadTimerEx() {
        setTitle("ThreadTimerEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        add(timerLabel);
        
        setSize(300, 150);
        setVisible(true);
        
	      **TimerThread th = new TimerThread(timerLabel);**
        th.start();
    }
    
    public static void main(String[] args) {
        new ThreadTimerEx();
    }
}

class TimerThread extends Thread {
    JLabel timerLabel;
    
    public TimerThread(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }
    
    public void run() {
        int n = 0;
        
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
```

### Runnable 인터페이스 필요성

- 다른 클래스를 상속하는 경우 스레드를 만들 수 없음
→ 자바는 단일 상속만 지원

### Runnable 인터페이스 사용

- 새로운 클래스 작성
- run() 메소드(스레드 코드)를 오버라이딩
    - run() 메소드가 종료하면 스레드 종료

```java
class TimerRunnable implements Runnalbe {
	public void run() {
		. . .
	}
}
```

- Thread 서브클래스의 객체 생성

```java
Thread th = new Thread(new TimerRunnable());
```

- start() 메소드를 호출하여

```java
th.start();
```

### 예제 12-2

- Runnable을 구현하여 1초 단위의 타이머 만들기

```java
import java.awt.*;
import javax.swing.*;

public class RunnableTimerEx extends JFrame {
    public RunnableTimerEx() {
        setTitle("RunnableTimerEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        add(timerLabel);

        setSize(300, 150);
        setVisible(true);

        **TimerRunnable runnable = new TimerRunnable(timerLabel);**
        **Thread th = new Thread(runnable);**
        th.start();
    }

    public static void main(String[] args) {
        new RunnableTimerEx();
    }
}

class TimerRunnable implements Runnable {
    JLabel timerLabel;

    public TimerRunnable(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
```

### 실습

- 깜빡이는 레이블 생성(0.5초 단위)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/06a6fc33-35f0-48c0-bb9b-f54a8df86bbd/Untitled.png)

```java
import java.awt.*;
import javax.swing.*;

public class FlickeringLabelEx extends JFrame {
    public FlickeringLabelEx() {
        setTitle("FlickeringLabelEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // 깜박이는 레이블 생성
        FlickeringLabel fLabel = new FlickeringLabel("깜박");
        // 깜박이지 않는 레이블 생성
        JLabel label = new JLabel("안깜박");
        // 깜박이는 레이블 생성
        FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박");

        add(fLabel);
        add(label);
        add(fLabel2);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlickeringLabelEx();
    }
}

class FlickeringLabel extends JLabel implements Runnable {
    public FlickeringLabel(String text) {
        super(text); // JLabel 생성자 호출
        setOpaque(true); // 배경색 변경이 가능하도록 설정
        Thread th = new Thread(this);
        th.start();
    }

    public void run() {
        int n = 1;
        while (true) {
            if (n == 1)
                setBackground(Color.YELLOW);
            else
                setBackground(Color.GREEN);
            n *= -1;
            try {
                Thread.sleep(500); // 0.5초 동안 잠을 잔다.
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
```

### Thread 클래스 주요 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/980afb7d-11e5-491d-b021-5abac3f2b3b4/Untitled.png)

### 스레드 정보

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d9625ada-02fc-4511-a200-9ac90811f260/Untitled.png)

### 스레드 상태

- NEW
    - 생성 o , 실행 준비 x
- RUNNABLE
    - JVM 에 의해서 실행되고 있거나 실행 준비되어 스케줄링 대기
- WAITING
    - wait() 를 호출하여 무한 대기 → 다른 스레드가 notify() or notifyAll() 을 기다리는 상태(스레드 동기화를 위해 사용
- TIMED_WAITING
    - sleep(n) 호출로 인해 n 밀리초 동안 잠을 자고 있는 상태
- BLOCk
    - 스레드가 I/O 작업을 요청(JVM 이 BLOCK 상태로 설정)
- TERMINATED
    - 종료 상태

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ae28843e-16cd-4d0e-833c-1fd42ecd45e1/Untitled.png)

### 스레드 우선 순위와 스케줄링

- 스레드의 우선 순위
    - 1(MIN_PRIORITY) ~ 10(MAX_PRIORITY) , 5(NORMAL_PRIORITY)
- 스레드 우선 순위 변경 및 확인
    - void setPriority(int priority)
    - int getPriority()
- 스레드는 부모 스레드와 동일한 우선 순위를 가지고 생성
- JVM 의 스케쥴링 정책
    - 가장 높은 우선 순위의 스레드가 우선적으로 스케줄링
    - 동일 우선 순위인 경우 라운드 로빈 방식으로 스케줄링

### yield( ) vs. join( )

- yield() 메소드 : 양보

```java
public class YieldExample {
    public static void main(String[] args) {
        Thread producer = new Producer();
        Thread consumer = new Consumer();

        producer.setPriority(Thread.MIN_PRIORITY); // Min Priority
        consumer.setPriority(Thread.MAX_PRIORITY); // Max Priority

        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Producer : Produced Item " + i);
            Thread.yield();
        }
    }
}

class Consumer extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Consumer : Consumed Item " + i);
            Thread.yield();
        }
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/74ddf792-f4fd-43f5-91c5-cb419e4a71c8/Untitled.png)

- join() 메소드
    - 한 쓰레드가 다른 쓰레드의 실행이 끝날 때 까지 기다리게 하는 역할을 한다.
    - 이 메소드를 호출한 쓰레드는 종료될 떄 까지 실행을 중지한다
    - 쓰레드 실행 순서를 조정하는 데 사용되는 메소드 이다.

```java
public class YieldExample {
    public static void main(String[] args) {
        Thread producer = new Producer();
        Thread consumer = new Consumer();

        producer.setPriority(Thread.MIN_PRIORITY); // Min Priority
        consumer.setPriority(Thread.MAX_PRIORITY); // Max Priority

        producer.start();
        consumer.start();

        try {
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Producer : Produced Item " + i);
        }
    }
}

class Consumer extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Consumer : Consumed Item " + i);
        }
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7cde06f6-a680-4c21-b881-456b9a42e2a7/Untitled.png)

### Main() 메소드

- JVM 에 의해 자동으로 쓰레드화 됨
    - 쓰레드라서 정보를 확인 하는 메소드가 사용 가능
    
    ```java
    public class ThreadMainEx {
        public static void main(String [] args) {
            long id = Thread.currentThread().getId();
            String name = Thread.currentThread().getName();
            int priority = Thread.currentThread().getPriority();
            Thread.State s = Thread.currentThread().getState();
    
            System.out.println("스레드 이름 = " + name);
            System.out.println("스레드 ID = " + id);
            System.out.println("스레드 우선순위 값 = " + priority);
            System.out.println("스레드 상태 = " + s);
        }
    }
    ```
    
    ```java
    [실행 결과]
    스레드 이름 = main
    스레드 ID = 1
    스레드 우선순위 값 = 5
    스레드 상태 = RUNNABLE
    ```
    
    ### 다른 스레드 종료 요청
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b72368a2-0809-4330-be81-36b255d4d5dd/Untitled.png)
    
    main 에서 interrupt 메소드를 호출하면 Threa에서 InterruptedException 발생 후 쓰레드가 종료됨
    

### 예제 12-4 : 진동하는 스레드와 스레드 종료

- 프레임이 진동하도록 프로그램 작성
    - Runnable을 구현하는 스레드 작성
    - Content pane에 마우스를 클릭하면 진동 스레드 종료
    
    ```java
    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;
    import java.util.Random;
    
    public class VibratingFrame extends JFrame implements Runnable {
        Thread th; // 진동하는 스레드
    
        public VibratingFrame() {
            setTitle("진동하는 프레임 만들기");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(200, 200);
            setLocation(300, 300);
            setVisible(true);
    
            getContentPane().addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    if (!th.isAlive())
                        return;
                    th.interrupt();
                }
            });
    
            th = new Thread(this); // 진동하는 스레드 객체 생성
            th.start(); // 진동 시작
        }
    
        public void run() { // 프레임의 진동을 일으키기 위해
            // 20ms마다 프레임의 위치를 랜덤하게 이동
            Random r = new Random();
            while (true) {
                try {
                    Thread.sleep(20); // 20ms 잠자기
                } catch (InterruptedException e) {
                    return; // 리턴하면 스레드 종료
                }
    
                int x = getX() + r.nextInt() % 5; // 새 위치 x
                int y = getY() + r.nextInt() % 5; // 새 위치 y
                setLocation(x, y); // 프레임의 위치 이동
            }
        }
    
        public static void main(String[] args) {
            new VibratingFrame();
        }
    }
    ```
    

### 실습

- 익명 클래스를 사용하여 이벤트 리스너 작성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8e481f02-5829-47ec-b24e-56ec09bc048f/Untitled.png)

```java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable1 implements Runnable {
    JLabel timerLabel;

    public TimerRunnable1(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ThreadInterruptEx extends JFrame {
    Thread th;

    public ThreadInterruptEx() {
        setTitle("ThreadInterruptEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        add(timerLabel);
        JButton btn = new JButton("kill Timer");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                th.interrupt();
                JButton btn = (JButton) e.getSource();
                btn.setEnabled(false);
            }
        });
        add(btn);
        setSize(300, 150);
        setVisible(true);
        TimerRunnable1 runnable = new TimerRunnable1(timerLabel);
        th = new Thread(runnable);
        th.start();
    }

    public static void main(String[] args) {
        new ThreadInterruptEx();
    }
}
```

쓰레드 내용은 아니지만 위 코드 중요 익명 클래스로 이벤트 리스너 작성한 것.

### Lab

- 두 개의 스레드를 사용하여 0에서 10까지 각각 출력하시오. (스레드 구분자 표시)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9cd1ec9c-5d56-458a-93ab-d1d1835dc301/Untitled.png)

```java
class PrintNumberRunnable implements Runnable {
    String myName;

    public PrintNumberRunnable(String name) {
        myName = name;
    }

    public void run() {
        for (int n = 0; n <= 10; n++) {
            System.out.print(myName + n + " ");
        }
    }
}

public class PrintNumber {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintNumberRunnable("A"));
        Thread t2 = new Thread(new PrintNumberRunnable("B"));
        t1.start();
        t2.start();
    }
}
```

## 스레드 - 동기화

### 멀티  스레드 사용할 때 주의점

공유 파일 동시에 수정할 떄 주의해야

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cb84a684-73e0-4961-adb3-fd68ab27efd8/Untitled.png)

### 동기화(Synchronization)

- thread 사이의 실행 순서 제어와 공유 데이터에 대한 접근을 원할하게 하는 기법
- 다수 thread 가 동시에 공유 데이터에 접근하는 것을 방지한다.

### 동기화 방법

- Synchronized 키워드 사용
    - 임계 영역 지정하여 thread 사이의 실행 순서 제어
- wait() - notify() / notifyAll() 메소드 사용
    - 공유 데이터에 대한 접근 제어

### synchronoized 키워드 사용

- 임계 영역
    - thread 가 독점적으로 실행해야 하는 영역
    - synchronized 키워드를 사용하여 지정
    - method 전체 또는 일부 코드 블록에 대해 지정 가능
- 임계 영역이 실행될 때,
    - 먼저 실행한 thread 가 모니터를 소유하게 됨
        - 모니터 : 해당 객체를 독점적으로 사용할 수 있는 권한
    - 모니터를 소유한 thread 가 모니터를 내놓을 때 까지 다른 thread 는 대기해야함

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f1a98c73-588d-4c34-a8ea-f68ad7450da1/Untitled.png)

### 예제 12-5

```java
public class SynchronizedEx {
		public static void main(String[] args) {
				SharedPrinter p = new SharedPrinter(); // 공유 데이터 생성

				String [] engText = { "Wise men say, ",
				"only fools rush in", "But I can't help, ",
				"falling in love with you", "Shall I stay? ",
				"Would it be a sin?", "If I can't help, ",
				"falling in love with you" };

				String [] korText = { "동해물과 백두산이 마르고 닳도록, ",
				"하느님이 보우하사 우리 나라 만세", "무궁화 삼천리 화려강산, ",
				"대한 사람 대한으로 길이 보전하세",
				"남산 위에 저 소나무, 철갑을 두른 듯",
				"바람서리 불변함은 우리 기상일세.",
				"무궁화 삼천리 화려강산, ",
				"대한 사람 대한으로 길이 보전하세" };
				
				Thread th1 = new WorkerThread(p, engText);//영문출력스레드
				Thread th2 = new WorkerT~~h~~read(p, korText);//국문출력스레드

				th1.start();
				th2.start();
		}
}
//두 WorkerThread 스레드에 의해 동시 접근되는 공유 프린터
class SharedPrinter {
			synchronized void print(String text) {
			// Thread.yield();
			for(int i=0; i<text.length(); i++)
					System.out.print(text.charAt(i));
					System.out.println();
			}
}
//스레드 클래스
class WorkerThread extends Thread {
			SharedPrinter p; // 공유 프린터 주소
			String [] text;

			WorkerThread(SharedPrinter p, String[] text) {
					this.p = p;
					this.text = text;
			}
			// 스레드는 반복적으로 공유 프린터에 10번 접근 text[] 출력
			public void run() {
					for (int i=0; i<text.length; i++) // 한 줄씩 출력
					p.print(text[i]); // 공유 프린터에 출력
					}
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/719a5dfe-1849-4aea-920e-7b02fa20290a/Untitled.png)

### Lab

- 문제
    - 두 명의 학생이 각각 10만큼씩 10번 더하는 계산을 수행하여 계산 결과를 출력하는프로그램을 작성하시오. 이때 동기화를사용하여 정확한 결과가 계산될수 있도록하시오.
    - 단, 초기값은 0에서 시작한다
    - 10만큼 더하는 각 단계의 결과를 출력하시오. 이때 학생의 이름을 함께 표시하시오
    

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ab8417d8-6be4-4069-a145-5fcb1523d828/Untitled.png)

```java
public class Increment {
    public static void main(String[] args) {
        SyncObject obj = new SyncObject();
        Thread th1 = new WorkerThread("혜경", obj);
        Thread th2 = new WorkerThread("대성", obj);
        th1.start();
        th2.start();
    }
}

class WorkerThread extends Thread {
    SyncObject sObj;

    WorkerThread(String name, SyncObject sObj) {
        super(name);
        this.sObj = sObj;
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            sObj.add();
            i++;
        }
    }
}

class SyncObject {
    int sum = 0;

    synchronized void add() {
        int n = sum;
        n += 10;
        sum = n;
        System.out.println(Thread.currentThread().getName() + ": " + sum);
    }

    int getSum() {
        return sum;
    }
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e79513e5-066b-491b-8a7c-f8655078423c/Untitled.png)

### synchronized 키워드 요약

- 스레드 간섭을 방지하는 간단한 방법
- 두 개 이상의 스레드에서 동일 객체를 사용하는 경우
    - 모든 읽기 및 쓰기 연산에 동기화 된 메소드 사용

### 공유 데이터의 사용

- thread 간에 데이터를 주고 받는 경우 데이터에 접근 순서 조정 필요

### 생산자-소비자 문제

- 생산자는 데이터를 생산하고 소비자는 데이터를 사용(소비)한다.
- 생산자가 데이터를 생산하기 전에 소비자는 데이터를 사용하면 안 된다.
- 소비자가 데이터를 사용하기 전에 생산자는 새로운 데이터를 생산하면 안 된다.

### wait() – notify() 메소드 사용

- 동기화 객체
    - 두 개 이상의 thread 사이에서 동기화 작업에 사용하는 객체
- 동기화 메소드
    - synchronized 코드 블록 내부에서만 사용 가능
    - wait()
        - 다른 스레드가 notify()를 불러줄 때까지 대기
    - notify()
        - wait() 호출로 인해 대기중인 스레드를 꺠우고 Runnable 상태로 변경
        - 한 개의 쓰레드만 깨울 수 있다
    - notifyAll()
        - 대기중인 모든 스레드를 깨우고 이들을 모두 Runnable 상태로 변경

### 예제 12-6

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2d8ca68c-a6e6-4a2b-a351-b42bfba2eea7/Untitled.png)

Consumer가 Object.wait()를 호출하여 잠을 자는 경우

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/67594800-9c78-4398-9ed0-0fe62da419f1/Untitled.png)

Main이 Object.wait()를 호출하여 잠을 자는 경우

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e1a8d155-8263-4015-93ea-3579c3a4100f/Untitled.png)

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel {
    int barSize = 0; // 바의 크기
    int maxBarSize;

    MyLabel(int maxBarSize) { 
        this.maxBarSize = maxBarSize; 
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);
        if(width == 0) return;
        g.fillRect(0, 0, width, this.getHeight());
    }

    synchronized void fill() {
        if(barSize == maxBarSize) {
            try { 
                wait(); 
            } catch (InterruptedException e) { 
                return; 
            }
        }
        barSize++;
        repaint(); // 바 다시 그리기
        notify();
    }

    synchronized void consume() {
        if(barSize == 0) {
            try { 
                wait(); 
            } catch (InterruptedException e) { 
                return; 
            }
        }
        barSize--;
        repaint(); // 바 다시 그리기
        notify();
    }
}

class ConsumerThread extends Thread {
    MyLabel bar;
    ConsumerThread(MyLabel bar) { 
        this.bar = bar; 
    }

    public void run() {
        while(true) {
            try {
                sleep(200);
                bar.consume();
            } catch (InterruptedException e) { 
                return; 
            }
        }
    }
}

public class TabAndThreadTest extends JFrame {
    MyLabel bar = new MyLabel(100);

    TabAndThreadTest(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        bar.setBackground(Color.ORANGE);
        bar.setOpaque(true);
        bar.setLocation(20, 50);
        bar.setSize(300, 20);
        c.add(bar);
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) { 
                bar.fill(); 
            }
        });
        setSize(350,200);
        setVisible(true);
        c.requestFocus();
        ConsumerThread th = new ConsumerThread(bar);
        th.start(); // 스레드 시작
    }

    public static void main(String[] args) {
        new TabAndThreadTest("아무키나 빨리 눌러 바 채우기");
    }
}
```
