package ru.notyesor.libraryweb.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Library {
    @Id
    private UUID id;
    @Column
    private String name;
    @Column
    private String description;
    @OneToMany(mappedBy = "library")
    private List<BookItem> bookItems;
}
