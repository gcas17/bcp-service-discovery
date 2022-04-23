package bcp.bootcamp.bcpservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BcpServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcpServiceDiscoveryApplication.class, args);
	}

}
