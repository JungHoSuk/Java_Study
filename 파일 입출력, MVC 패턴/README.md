# 파일 입출력
파일 입출력(Java Application 관점)<br>
		Stream이라는 연결통로를 통해 원본 데이터가 알맞는 인코딩 방식으로 전송된다.<br>
		byte단위로 입출력 되기 때문에 개별 처리 이며, 상세 연산이 필요하지 않다면,<br>
		Buffer를 사용한 입출력을 권장한다. Buffer를 사용하면 일괄처리가 가능해진다.<br>
<br>
		※인코딩 방식<br>
				인코딩 방식은 완성형과 조합형이 있다.<br>
				- 완성형 : 각, 간, 갇, 갈, 감,......., 갛<br>
				- 조합형 : ㄱ + ㅏ + ㄱ<br>
				조합형이 효율적이며 byte단위로 데이터를 전송할 때 고정된 byte가<br>
				아니기 때문에 가변형 인코딩 방식을 선호한다.<br>
				조합형이면서 가변형인 인코딩 방식은 UTF-8이며 전 세계에서 가장 많이 사용되는 방식이다.<br>
<br>
		Writer(출력)<br>
			BufferedWriter : 버퍼를 사용한 출력 클래스<br>
			FileWriter : 전달한 경로의 파일을 출력하기 위한 목적으로 열어준다.<br>
				      전달한 경로에 파일이 없다면, 새롭게 만든 후 열어준다.<br>
<br>
		Reader(입력)<br>
			BufferedReader : 버퍼를 사용한 입력 클래스<br>
			FileReader : 전달한 경로의 파일을 입력하기 위한 목적으로 열어준다.<br>
				       전달한 경로에 파일이 없다면, 오류가 발생한다(FileNotFoundException), try-catch로 예외처리 하면 좋겠다<br>
<br>
		File(파일 정보)<br>
			전달한 경로에 있는 파일의 정보를 담는 타입.<br>
			디렉터리 생성, 해당 경로의 전체파일 목록, 파일 삭제 등<br>
<br>
=========================================================<br>
# 소프트 디자인 설계 패턴
MVC<br>
	M(Model) : DB에서 조회된 결과 값을 담기 위한 변수들이 선언된 클래스<br>
			- 클래스명 뒤에 VO,DTO라는 문자열을 붙여준다.<br>
			- VO(Value Object) : 테이블을 보고 그대로 만든 객체<br>
			- DTO(Data Transfer Object) : 화면에 결과를 담아서 전달할 객체<br>
	V(View) : 사용자에게 보여질 화면을 구성하는 부분<br>
			- Controller에 선언된 CRUD 메소드를 사용하는 부분<br>
	C(Controller) : DB에 접근할 수 있는 메소드들이 선언된 클래스<br>
			- 접근 후 결과 값이 있을 경우 Model 객체에 담은 후 처리<br>
			- 클래스명 뒤에 DAO라는 문자열을 붙여준다.<br>
		 	- DAO(Data Access Object)<br>


