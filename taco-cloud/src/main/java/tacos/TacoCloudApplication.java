//부트스트랩 클래스
package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //스프링 부트 어플리케이션 의미
/* 
@SpringBootApplication은 세개의 annotation이 결합한 것이다.
1. @SpringBootConfiguration
2. @EnableAutoConfiguration
3. @ComponentScan
*/
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args); // 어플리케이션 실행
		//인자는 구성 클래스와 명령행 인자
	}

}
