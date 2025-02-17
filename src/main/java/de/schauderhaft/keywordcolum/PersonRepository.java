package de.schauderhaft.keywordcolum;

import org.springframework.data.repository.ListCrudRepository;

public interface PersonRepository extends ListCrudRepository<Person, Long> {
}
