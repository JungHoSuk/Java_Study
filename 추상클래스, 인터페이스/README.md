# 추상 클래스
추상 클래스<br>
   필드 안에  구현이 안된 메소드가 선언되어 있는 클래스를 추상 클래스라고 한다.<br>
   이 때 구현되지 않은 메소드를 추상 메소드라고 부른다.<br>
   반드시 재정의를 통해 구현을 해야지만 메모리에 할당되기 때문에<br>
   "강제성"을 부여하기 위해서 추상 메소드로 선언한다.<br><br>

추상 클래스 선언<br>
   abstract class 클래스명 {<br>
      abstract 리턴타입 메소드명(매개변수,...);<br>
      일반 메소드도 선언 가능<br>
   }<br><br>
   
# 인터페이스
인터페이스(interface) : 틀<br>
   추상 클래스를 고도화시킨 문법<br>
   상수와 추상메소드만 존재한다.<br>
   구현은 인터페이스를 지정한 클래스에서 진행하고,<br>
   인터페이스를 다른 클래스에 지정할 때에는 implements 키워드를 사용한다.<br><br>
   
추상 클래스와 인터페이스 간의 관계<br>
   인터페이스를 클래스에 바로 지정하면 모든 메소드에 강제성이 부여되어서<br>
   전부 다 구현해야 한다. 하지만 일반적인 상황에서는 모든 것이 아닌,<br>
   필요한 메소드를 골라서 재정의해야한다.<br>
   인터페이스를 직접 지정하지 않고 다른 클래스에 지정한 후 바디를 만들어 놓는다면,<br>
   강제성이 소멸되고 이 클래스를 상속받아서 필드를 구현한다면, 골라서 재정의할 수 있게 된다.<br>
   이 때 중간에서 강제성을 없애주는 클래스를 추상클래스로 선언하기로 하며,<br>
   추상 클래스 이름 뒤에는 Adapter를 붙여서 목적을 알려준다.<br><br>

마커 인터페이스(Marker Interface)<br>
   클래스들을 그룹화하기 위한 목적으로 사용한다.<br>
   인터페이스는 지정한 클래스의 부모이며, 모든 자식은 부모의 타입이므로<br>
   마커 인터페이스를 지정받은 클래스들이 하나의 타입으로 묶이게 된다.<br>
   이름 뒤에  Marker를 붙여줘야 한다.<br><br>

내부 클래스(Inner Class)<br>
   하나의 클래스에서 a작업과 b작업이 있을 때에는 따로 분리하여 클래스로 만들지 않고,<br>
   클래스 안에 클래스를 선언하여 설계한다. 이 때 밖에 있는 클래스를 외부 클래스라고 하며,<br>
   안에 선언된 클래스를 내부 클래스라고 한다. 외부 클래스가 메모리에 할당되어야<br>
   내부 클래스를 객체화할 수 있기 때문에 클래스를 숨기기 위해서 내부 클래스를 사용하기도 하며,<br>
   이를 캡슐화 또는 은닉화라고 한다. 내부 클래스는 외부 클래스의 필드이기 때문에<br>
   외부 클래스의 필드를 자신의 필드처럼 가져다 사용할 수 있게 된다.<br>
   ※ 메소드 안에서 클래스를 선언할 수도 있다.<br><br>

익명 클래스(Anonymous Inner Class)<br>
   이름이 없는 클래스이며 구현되지 않은 필드를 구현하기 위해 일회성으로 생성되는 클래스이다.<br><br>

다중 상속<br>
   여러 부모 클래스를 상속하는 것을 다중 상속이라고 한다.<br>
   JAVA는 모호성 때문에 다중 상속을 지원하지 않는다.<br>
   하지만 JDK8버전부터는 인터페이스에 default 메소드 선언을 허용하며,<br>
   여러 개를 지정할 수 있는 인터페이스 특성상 다중 상속을 지원하는 것이나 다름이 없다.<br><br>

모호성(ambiguity)<br>
   하나의 자식이 여러 부모를 상속받을 때 부모 필드에 동일한 이름의 필드가 있다면,<br>
   어떤 부모의 필드인지 알 수가 없다. 이를 모호성이라고 부른다.<br><br>

모호성 해결 방법<br>
- 상황1 : 두 개의 인터페이스 내에 이름과 매개변수가 똑같은 메소드가 선언되어 있다.<br>
- 해결1 : 자식 클래스에서 재정의하여 사용한다.<br><br>

- 상황2 : 부모 클래스의 메소드와 인터페이스의 디폴트 메소드의 이름과 매개변수가 똑같이 선언되어 있다.<br>
- 해결2 : 부모 클래스의 메소드가 사용된다.<br><br>

함수형 인터페이스(Functional interface)<br>
   인터페이스 중 추상 메소드를 하나만 가지고 있는 인터페이스를 함수형 인터페이스라고 한다.<br>
   이 때 @FunctionalInterface를 인터페이스 위에 작성하여 단 하나의 추상 메소드만<br>
   선언할 수 있도록 제한해야 한다.<br><br>

람다식(Lambda Expression)<br>
   이름이 없는 메소드로서 변수처럼 사용이 가능하며, 매개변수로도 전달이 가능하다.<br>
   함수형 인터페이스는 추상 메소드가 한 개만 선언되기 때문에 메소드 이름이 필요 없다.<br>
   따라서 람다식을 익명 메소드(Anonymous Method)라고도 부른다.<br><br>

람다식 문법<br>
   1. (매개변수 형식 나열,...) -> 리턴값;<br>
   2. (매개변수 형식 나열,...) -> {2개 이상의 문장 작성; return 리턴값;}<br>
