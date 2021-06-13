# Spring 기본 학습
***
# 스프링 코어 학습
- [스프링 프로젝트 설정 링크](https://start.spring.io/)
- ![스프링 초기 설정사진](./src/main/resources/static/md_image/start_spring.png)

## lombok 설정
1. build.gradle - dependencies에 추가
```groovy
//lombok 라이브러리
	compileOnly 'org.projectlombok:lombok:1.18.12'
	annotationProcessor 'org.projectlombok:lombok:1.18.12'
```

1. intelij 플러그인 lombok 설치
1. 설정에 annotation processor 검색 -> annotation 활성화 체크
