# blog-ver-SB
### 프로젝트 설명<br>

  JAVA 백엔드 개발자 박상재 입니다.<br>
  웹프로그래머로 짧은기간 재직하면서 가장 많이 사용하는 CRUD 기능을 익히면서 동시에 안써본 새로운 기술들을 사용해보자 해서<br>
  만들어본 스프링부트를 활용한 블로그입니다.<br>
  아울러 저의 짧은 경력을 게시하는 공간으로도 사용할 계획입니다.<br>
  (부족한점이 많은 프로젝트 입니다. 지속적으로 업데이트하며 보완해 나가겠습니다.)<br><br><br>
  
  ------------
  
  + 포트폴리오 페이지 Url : http://ec2-13-124-84-115.ap-northeast-2.compute.amazonaws.com:8080/
  
  + 관리자 페이지 접근가능 Url : http://ec2-13-124-84-115.ap-northeast-2.compute.amazonaws.com:8080/admin
  
  + 관리자 페이지 열람가능 계정정보 : admin / 1234 (열람만 가능합니다. 나머지기능은 @PreAuthorize로 제한되어 있습니다)
  
  ------------
  
  + 시스템 구성
    
    | 분류 | 이름 |
    |---|---|
    | 서버 | AWS |
    | WAS | Tomcat |
    | DB | MariaDB |
    | 언어 | Java 11 |
    | 백엔드 프레임워크 | Spring Boot 2.4.4 |
    | 권한관리 | Spring Security 5.4.5 |
    | 템플릿엔진 | Thymeleaf 3.0.12 |
    | SQL Mapper | Querydsl 4.4.0 |
    | 빌드 관리 도구 | Gradle |
    | 편의성 라이브러리 | Lombok, p6spy, lucy-xss-servlet, gson |
    
    + AWS<br>
      재직중인 회사에서는 IDC에서 물리서버를 사용하는데 물리서버의 경우 리소스변경이 어려워서 클라우드로 작업해보고 싶었습니다.<br><br>
      
    + Tomcat<br>
      항상 외장 톰캣만 사용하였는데 이번엔 Spring Boot의 내장 톰캣을 사용했습니다.<br><br>
      
    + MariaDB<br>
      아직 사용가능한 RDB가 MySQL 뿐이라 선택하게 되었습니다. 기회가 된다면 Oracle도 사용해보고 싶습니다.<br><br>
      
    + Java 11<br>
      LTS 버전중 상위버전이라 생각되어 선택하였습니다. 또 한, 현재 재직중인 회사의 경우 Java 1.7 기반이라 1.8 이상의 Java를 사용해보고 싶었습니다.<br><br>
      
    + Spring Boot<br>
      현재 재직중인 회사가 자체 프레임 워크이고 저도 Spring, 전자정부프레임워크의 사용경험만 있어서 보편적으로 활용하는 Spring Boot를 활용해 보기로했습니다.<br><br>
      
    + Spring Security<br>
      이번 프로젝트에 시발점입니다. 웹프로그래밍을 하면서 항상 마지막에는 보안문제로 귀결되었고 현재 운용중인 자체 프레임워크의 보안 핸들링이 마음에 들지 않아서 따로 공부하였습니다.<br>
      하여 이번 프로젝트에 적용하게 되었고 프로젝트 기간의 60% 정도를 Security에 소비하였지만 많이 배웠다고 생각됩니다.<br>
      추 후, DB와 연동된 Url 기반 권한제어와 DB와 연동된 메소드기반 권한제어를 탑재할 계획입니다. (아직 저의 숙련도가 부족하다 판단되어서 배포에 포함시키지는 않았습니다.)<br><br>
      
    + Thymeleaf<br>
      저는 jsp만을 사용해봤습니다. Spring Boot 진영에서 Thymeleaf를 권장하는 추세이기에 사용해보았습니다. 새로운 프론트 엔드 프레임워크를 배우는 듯한 느낌이 들 정도로 복잡했지만 Spring<br>
      Security와의 연동이 매우 편리하다고 생각됩니다.<br><br>
      
    + Querydsl<br>
      기존 사용하던 JDBC, mybatis들은 쿼리를 스트링으로 전부 작성해야해서 실행을 해봐야만 쿼리의 오류를 파악할 수 있어서 불편하다고 판단했고 JPA를 학습하면서 Querydsl을 알게되어<br>
      사용해보았습니다. 세팅이 번거로우나 컴파일시에 쿼리 오류를 잡아주서어 쿼리와 관련된 런타임 오류를 최소화할 수 있으며, 쿼리 스트링을 사용하지 않으므로 SQL 쿼리 인젝션 공격에<br>
      상대적으로 안전한 것 역시 마음에 들었습니다.<br><br>

    + Gradle<br>
      Maven만 사용해봤기에 Gradle도 한번 사용해 보았습니다.<br><br>
      
    + Lombok, p6spy, lucy-xss-servlet, gson
      편의성을 위해 사용한 라이브러리들 입니다. Lombok은 반복코드를 줄이기위해서 사용하였고 p6spy는 전달되는 쿼리를 체크하기 위해, lucy-xss-servlet는 XSS 보안관련하여 추가했고<br>
      필터링에 제외된 요소의 보호를 위해 별도로 클래스를 만들어서 한번 더 필터링 하였습니다. gson은 json 데이터 통신의 편의성을 위하여 추가하였습니다.<br><br>
      
### 패치노트<br>

    2021-08-18 : 커스텀 에러페이지 적용 및 AccessDeniedHandler 수정
    2021-08-19 : *Contoroller에 AOP를 이용한 Log 추가
<
