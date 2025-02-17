package de.schauderhaft.keywordcolum;

import org.springframework.boot.SpringApplication;

public class TestKeywordcolumApplication {

	public static void main(String[] args) {
		SpringApplication.from(KeywordcolumApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
