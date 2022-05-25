package ru.notyesor.libraryweb.repository;

import org.springframework.data.repository.CrudRepository;
import ru.notyesor.libraryweb.entity.BookItem;

import java.util.UUID;

public interface BookItemRepository extends CrudRepository<BookItem, UUID> {
}
