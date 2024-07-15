package manga_hub.manga_hub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MangaHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangaHubApplication.class, args);
		System.out.println("DATABASE_URL: " + System.getenv("DATABASE_URL"));
        System.out.println("DATABASE_USER: " + System.getenv("DATABASE_USER"));
        System.out.println("DATABASE_PASSWORD: " + System.getenv("DATABASE_PASSWORD"));
        System.out.println("DATABASE_DRIVER: " + System.getenv("DATABASE_DRIVER"));
        System.out.println("DATABASE_PLATFORM: " + System.getenv("DATABASE_PLATFORM"));
        System.out.println("JPA_HIBERNATE_DDL_AUTO: " + System.getenv("JPA_HIBERNATE_DDL_AUTO"));
        System.out.println("JWT_SECRET: " + System.getenv("JWT_SECRET"));
	}

}
