### AOP
1. ExeTimeAspect라는 프록시 객체를 만든다. (이걸로 타임체크하고싶다.)
2. aopPojo.xml에 어떤 bean을 aspect(프록시)로 쓸것이며, 어떤때 실행될것인지 정의해둔다. 그러면 컨텍스트에 다 장착됨.
3. test로 돌려본다.