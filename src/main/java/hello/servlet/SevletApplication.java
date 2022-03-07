package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 하위 디레토리 다 뒤져서 서블릿 자동 등록
@SpringBootApplication
public class SevletApplication {

	public static void main(String[] args) {
		SpringApplication.run(SevletApplication.class, args);
	}

}
