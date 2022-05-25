package ru.notyesor.libraryweb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class BookItem extends BaseEntity {
    @ManyToOne
    private Book book;
    @ManyToOne
    private Library library;
}
