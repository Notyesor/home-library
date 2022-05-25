package ru.notyesor.libraryweb.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Data
public class Author extends BaseEntity {
    @Column
    private String name;
    @ManyToMany(mappedBy = "authors")
    private List<Book> books;
}
