package ru.notyesor.libraryweb.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    private UUID id;
    @Column
    private Date modified;
    @Column
    private Date created;
}
