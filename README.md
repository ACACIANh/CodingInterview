# 코딩 인터뷰 복기

q. 코틀린 let 구현

a. let 이 인자로 함수형으로 받기 때문에 인자로 받은 함수를 실행하고 결과 반환

```kotlin
inline fun <T, R> T.customLet(block: (T) -> R): R {
    return block(this)
}
```

---
q. DNS 설명

a.

1. 도메인 이름 요청: 사용자가 브라우저에 도메인 이름(예: www.example.com)을 입력하면, 운영체제는 해당 도메인에 대한 IP 주소를 알기 위해 DNS 서버에 요청을 보냅니다.
2. 로컬 DNS 캐시: 먼저 운영체제는 로컬 DNS 캐시를 확인합니다. 최근에 방문한 도메인의 IP 주소를 캐시해두었다면 바로 반환합니다.
3. 루트 DNS 서버: 로컬 DNS 캐시에 없거나 만료된 경우, DNS 서버는 루트 DNS 서버에 도메인을 질의합니다. 루트 DNS 서버는 최상위 도메인을 관리하는 서버들의 주소를 알려줍니다.
4. 최상위 도메인 서버: 루트 DNS 서버는 최상위 도메인 서버(TLD, Top-Level Domain)의 주소를 반환합니다. 최상위 도메인은 도메인의 종류(예: .com, .org, .net 등)를 관리하는
   서버입니다.
5. 도메인 이름 서버: 최상위 도메인 서버는 실제 도메인 이름을 관리하는 도메인 이름 서버의 주소를 알려줍니다.
6. 도메인 이름 서버 조회: 도메인 이름 서버에 도메인을 질의하여 해당 도메인의 IP 주소를 얻어옵니다.
7. IP 주소 반환: 마지막으로 DNS 서버는 찾아낸 IP 주소를 로컬 DNS 캐시에 저장하고, 이를 운영체제에 반환하여 브라우저가 해당 IP 주소로 웹 사이트에 접속할 수 있게 됩니다.

---
q. Java 가 OS 종속적이지 않는 이유

a. 코드를 java code 로 작성하고 compiler 에 의해 jvm 이 해석할수 있는 byte code 로 컴파일 되고 os 에 맞춰서 실행해주는 jvm 이 실행

---
q. Garbage Collection 시 삭제되는 객체판단 근거

a. 누구에게도 참조되지 않는 객체를 삭제할 객체라고 판단하여 메모리에서 해제

---
q. CircuitBreaker 설명

a. 실패에 대한 모니터링을 하고 실패율이 일정수치가 넘어가면, 열림상태로 바꾸어 이후 요청시 다른 방법을 찾게 유도함

---
q. Retryer 설명 및 설정값에 대한 판단 근거

a. 요청 실패시 재시도를 제공함 / 오류 유형과, 회복가능성, 영향도, 서비스가 권장하는 옵션등 을 고려

---
q. HTTP2.0 특징

a. 다중화(multiplexing), 헤더압축, 서버푸시, 스트림/프레임, 데이터 우선순위 설정

---
q. OAuth - authorization code grant 플로우 ( resource owner, client(service), oauth server, oauth resource server )

a.

1. client 등록
2. owner 의 접근 요청
3. oauth server 인증
4. client 로 authorization code 발급
5. authorization code 로 token 발급
6. 해당 token 으로 resource 자원 사용

---
q. MSA 환경에서 MQ 사용의 장/단점

a.

- 장점 : 비동기, 서비스간 디커플링
- 단점 : 복잡성 증가, 디버깅의 어려움, 트랜잭션 관리

---
q. 로깅 시스템을 만든다고 했을때 로그별 연관을 맺어주는 방법

a. 식별자를 이용해 연관을 맺어줄수있다. 예를들면 header 에 특정값을 넣어준다

---
