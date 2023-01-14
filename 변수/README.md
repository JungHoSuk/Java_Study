# Java
자바란?<br>
개발자와 운영체제가 소통하기 위한 언어<br><br>

소스코드란?<br>
명령어를 작성해 놓은 것(개발자와 운영체제가 소통할 것을 글로 작성해 놓은 것)<br><br>

콘솔<br>
사용자와 운영체제가 소통한 결과를 나타내는 창.<br><br>

컴파일<br>
사람의 언어를 기계어로 번역하는 일<br><br>

컴파일러<br>
컴파일을 해주는 프로그램 또는 명령어<br><br>

컴파일러의 해석 방향<br>
위에서 아래로, 좌에서 우로<br><br>

프로그램<br>
소스코드로 잘 짜여진 틀<br><br>

JVM(Java Virtual Machine)<br>
Java 프로그램을 실행해 준다.<br><br>

JRE(Java Runtime Environment)<br>
JVM을 생성하는 부분.<br>
JVM을 실행할 때 필요한 라이브러리 파일들을 가지고 있다.<br><br>

JDK(Java Development Kit)<br>
JRE 외에 개발에 필요한 도구들을 가지고 있다.<br>
컴파일 명령어와 컴파일된 파일을 실행 명령어를 담고 있다.<br><br>


# 변수
변수 : 저장공간<br>
예) x = 10<br><br>

기본 자료형(type)<br>
 정수형   int   4byte<br> 
 실수형   float   4byte<br>   
          double   8byte<br>   
 문자형   char   2byte<br><br>

변수의 선언<br>
   자료형 변수명 = 초기값;<br>
   자료형 변수명;<br><br>

   예)<br>
   int x = 10;<br>
   x라는 이름의 저장공간이 할당되고 그 안에 10이 들어간다.<br><br>
   
변수 선언 시 주의사항<br>
   1. 같은 이름의 변수로 선언할 수 없다.<br>
   2. 초기화를 해준다.<br>
   3. 되도록 선언부에 한꺼번에 선언한다(영역 상단).<br><br>
   
 변수명 주의사항<br>
   문자로 시작해야 한다.<br>
   특수문자는 사용할 수 없다. 단, _는 허용한다.<br>
   되도록 소문자만 사용한다.<br>
   공백을 사용할 수 없다.<br><br>

   goodBoy : 카멜 표기법<br>
   good_boy : 파스칼 표기법, 스네이크 표기법, 팟홀 표기법<br><br>

   되도록 한글은 사용하지 않는다.<br>
   명사로 사용한다.<br>
   뜻이 있는 단어를 사용한다.<br>
   a, b, c, d, e,...(X)<br>
   data, number, num, age, name, ...(O)<br><br>
 
 
 변수를 사용하는 이유<br>
   1. 반복되는 값을 쉽게 관리할 수 있다.<br>
   2. 의미 없는 값을 하나의 정보로 만들기 위해서 사용한다(자료구조)<br><br>
   
 서식문자(format)<br>
   반드시 따옴표 안에서 작성한다.<br><br>

   %d   decimal(10진수 정수)<br>
   %o   octal(8진수 정수)<br>
   %x   hexadecimal(16진수 정수)<br>
   %f   float(실수)<br>
   %c   character(문자)<br>
   %s   string(문자열)<br><br>
   
 출력 메소드<br>
   printf() : 서식문자를 사용하여 출력할 수 있으며, 자동으로 줄바꿈되지 않는다.<br><br>
   
 상수<br>
   항상 그대로인 수.<br>
   값을 변경할 수 없도록 한다.<br><br>

   final 자료형 상수명 = 값;<br><br>
   
   
 형변환<br>
   - 자동 형변환<br>
      정수 + 정수 = 정수	//int + int = int<br>
      정수 + 실수 = 실수	//int + double = double<br>
      3 + 0.0 = 3.0<br>

      문자 + 정수 = 정수	// 'a' + 4  = 101;<br><br>

   - 강제 형변환<br>
      (자료형)값<br>
      (double)3<br><br>

문자열 형변환<br>
   1. 다른 자료형을 문자열로<br>
      문자열과 다른 일반 자료형을 연결하면 결과는 항상 문자열이 된다.<br><br>

   2. 문자열을 다른 자료형으로<br>
      일반 자료형은 일반 자료형끼리만 형변환이 가능하다.<br>
      문자열 타입은 클래스타입이므로, 일반 자료형의 클래스타입의 도움을 받아야 한다.<br>
      Integer.parseInt(""); => 문자열에서 변환된 정수값<br>
      Float.parseFloat(""); => 문자열에서 변환된 실수값<br>
      Double.parseDouble(""); => 문자열에서 변환된 실수값<br><br>
