### CRUD를 통한 도서 관리 시스템 -> 사이트 주소: http://www.yuyu-library.site:8080/v1/index.html  
- 사용 : Java11, Spring Boot 2.7.12, gradle, MySQL, AWS  

- 오류 : BookService에서 BookService 생성자를 직접 만든 것에서 @RequiredArgsConstructor 애노테이션을 사용하는 방법으로 대체하였다. 그랬더니 not initialized in the default constructor 오류가 발생하였다. 확인해보니 gradle 5부터는 다음과 같이 어노테이션을 구별해서 추가해줘야 한다고 한다.   

  compileOnly 'org.projectlombok:lombok:1.18.10'  
  annotationProcessor 'org.projectlombok:lombok:1.18.10'  

  따라서, 나는 기존의 의존성을 implementation 'org.projectlombok:lombok' 에서 

  implementation 'org.projectlombok:lombok'  
  annotationProcessor 'org.projectlombok:lombok' 로 바꾸었더니 해결이 되었다.(나는 버전 7.5를 사용하고있었다)  
- 회고 :
한사람이 하나의 도서를 대출-반납-대출-반납 한 후 다시 대출할 때 정상적으로 작동하지 않음  
원인 : 도서 반납 기능에서, 도서 대출 히스토리 디비에 같은 도서가 여러개 들어오면 첫번째 도서에 대해서만 처리하기 때문 (User dto의 returnBook 참고). 더 공부해서 이를 고쳐야할 필요성을 느꼈다.
