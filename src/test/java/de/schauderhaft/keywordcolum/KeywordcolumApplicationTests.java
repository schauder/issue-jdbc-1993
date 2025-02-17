package de.schauderhaft.keywordcolum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
@Sql("/schema.sql")
class KeywordcolumApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	void contextLoads() {
		Person person = personRepository.save(new Person(null, "test data"));

		Person reloaded = personRepository.findById(person.id()).orElseThrow();

		assertThat(reloaded).isEqualTo(person);
	}

}
