package ru.notyesor.libraryweb.repository;

import org.springframework.data.repository.CrudRepository;
import ru.notyesor.libraryweb.entity.Author;

import java.util.UUID;

public interface AuthorRepository extends CrudRepository<Author, UUID> {
}
