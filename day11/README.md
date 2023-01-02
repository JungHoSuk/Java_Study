# 예외 처리
예외 처리<br>
	에러 : 심각한 오류<br>
	예외 : 덜 심각한 오류<br>
<br>
예외 처리 문법<br>
	try{<br>
		예외가 발생할 수 있는 문장<br>
	}catch(예외이름 객체명){<br>
		예외 발생 시 실행할 문장<br>
<br>
		예외 발생 시 해당 예외생성자가 실행되어 예외 필드가 메모리에 할당된다.<br>
		할당된 주소를 선언한 객체로 받지 못한다면 프로그램이 강제 종료된다<br>
		이를 막기 위해 동일한 예외 타입의 객체를 catch문 안에 선언하여 전달되는 주소를 잡아준다.<br>
		해당 예외 주소가 담긴 catch문의 문장이 실행된다<br>
<br>
	}catch(예외이름 객체명){<br>
		예외 발생 시 실행할 문장<br>
	}....<br>
	}finally{<br>
		예외 발생 여부에 상관없이 무조건 실행할 문장<br>
		※ 외부 장치와 연결했을 경우 다시 닫을 때 주로 사용한다.(주로 DB)<br>
	}<br>
  
# API
API(Application Programming Interface)<br>
	개발에 필요한 라이브러리들의 집합.<br>
	선배 개발자들이 만들어 놓은 소스코드<br>
	<br>
	- 내부 API<br>
		JDK 설치 시 제공해주는 기본 API<br>
		docs.oracle.com/javase<br>
<br>
	- 외부 API<br>
		선배 개발자들이 개발한 패키지 및 클래스들을 의미한다.<br>
		보통 JAR파일로 배포하며 자바 프로젝트의 bulidpath에 추가하여 사용할 수 있다.<br>
		<br>
<br>
JAR 파일로 배포하기<br>
   배포할 클래스 또는 패키지 우클릭<br>
   > Export > JAVA/JAR file 선택 > Next<br>
   > destination을 원하는 경로로 선택<br>
   > Export Java source files... 체크<br>
   > Finish<br>
<br>
JAR 파일을 프로젝트에 추가하기<br>
   배포된 JAR파일을 다운 받기<br>
   > 프로젝트 우클릭 > Build Path > Configure Build Path<br>
   > Libraries 탭 클릭 > ClassPath(안되면 ModulePath) 클릭 > Add External JARs<br>
   > 저장된 경로의 .jar파일을 더블 클릭으로 추가 > Apply 클릭<br>
   > Orders and Exports 탭 클릭<br>
   > Select All 클릭 > Apply and Close<br>
<br>
Object 클래스(최상위 부모 클래스, 모든 클래스는 자동으로 상속받는다)<br>
	1. toString()<br>
		항상 객체명을 출력할 때에는 toString()이 생략되어 있다.<br>
		toString()을 통해 출력되는 문자열이 마음에 들지 않는다면, 재정의하여 수행하도록 한다.<br>
		실무에서는 클래스 선언 시 각 필드의 초기화 여부를 확인하기 위해 toString을 재정의하여 사용한다.<br>
	2. equlas()<br>
		주소값 비교(==)<br>
		String 클래스에서 equals를 값 비교로 재정의하여 사용하기 때문에<br>
		문자열 비교는 무조건 equals()로 비교한다.<br>
	3. hashCode()<br>
