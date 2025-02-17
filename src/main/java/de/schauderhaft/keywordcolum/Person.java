package de.schauderhaft.keywordcolum;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public record Person(
		@Id
		Long id,
		@Column
		String desc
) {
}
