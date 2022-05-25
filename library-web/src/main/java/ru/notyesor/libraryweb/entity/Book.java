package ru.notyesor.libraryweb.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
public class Book extends BaseEntity {
    @Column
    private String name;
    @Column
    private String description;
    @ManyToMany(mappedBy = "books")
    private List<Author> authors;
}
