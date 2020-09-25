MiniBoard
----------
### 개요
- 간단하게 게시글들을 작성하고 확인할 수 있는 게시판 사이트 제작

### 제작과정
- 프로젝트명 : MiniBoard
- 수행기간 : 2020년 07월 ~ 2020년 09월
- 프로젝트 인원 : 1명

### 개발환경
- Spring MVC / MyBatis / Apache Tomcat

### 프로젝트 소개
> 구조
<div>
  <img width="600" src="https://user-images.githubusercontent.com/48199704/94239476-d6872580-ff4c-11ea-9f2c-d08ef2ceb5de.JPG">
</div>

#### 구현기능 소개
> 메인페이지
<div>
  <img width="600" src="https://user-images.githubusercontent.com/48199704/94239681-1ea64800-ff4d-11ea-994a-021cc79f510f.JPG">  
</div> 

Interceptor 처리를 통한 탑메뉴와 로그인 시 버튼이 로그인/회원가입에서 정보수정/로그아웃으로 바뀝니다.   
 
> 회원가입, 게시판, 글 페이지
<div>
  <img width="600" src="https://user-images.githubusercontent.com/48199704/94239856-60cf8980-ff4d-11ea-97cb-d434e9596049.JPG">
</div>

ID 중복 확인 응답결과를 데이터로 보내기에 RestController를 사용하고,   
비동기 처리를 위한 ajax함수, 유효성 검사를 위해 valid, validator를 사용합니다.   
RowBounds를 이용해 페이징 처리를 했습니다.   
인덱스번호를 통해 글 정보를 확인하고 사용자 정보의 Bean을 model에 추가해,   
글 작성자일 경우에만 수정, 삭제가 가능하게 하고,   
잘못된 사용자의 접근을 막기 위한 Interceptor 처리를 하였습니다.
