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
