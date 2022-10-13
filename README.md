# cafeMangementAPP

* make in java with servlet API(spring jdk)
* Created as a team project.

# 기본적인 카페 관리 web app 생성
## Basic Structure
1. java servlet을 활용해 routing
2. lombok을 활용한 model DTO 설정 => ./model/*
3. SQL활용대신 data폴더에 model 클래스 constructor를 활용해 데이터 셋 생성 => ./data/data.java
  * 위 예제는 차후 spring api를 활용해 mysql과 연동해 응용 가능
4. 기능 별 Controller따로 구현해 생성 => ./controller/*
5. login과 error check 기능은 feature, management 폴더로 기능별 분류 완료 => ./controller/feature, management
6. View 페이지에서 페이지 user의 선택에 따른 component를 controler에서 적절히 분류해 SucessView or FailView로 redirect(check option 및 result와 함께 request에 포함해 전송)
