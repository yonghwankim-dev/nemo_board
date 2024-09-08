package co.nemoboard.boardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages ={"co.nemoboard.boardservice", "co.nemoboard.nemoboardcommon"} )
public class BoardServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BoardServiceApplication.class, args);
	}
}
