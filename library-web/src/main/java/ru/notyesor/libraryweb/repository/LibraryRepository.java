package ru.notyesor.libraryweb.repository;

import org.springframework.data.repository.CrudRepository;
import ru.notyesor.libraryweb.entity.Library;

import java.util.UUID;

public interface LibraryRepository extends CrudRepository<Library, UUID> {
}
