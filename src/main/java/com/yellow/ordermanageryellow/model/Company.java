package com.yellow.ordermanageryellow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Collation
public class Company {
    @Id
    private String id;
    private String name;
    private String currency;
    @DBRef
    private AuditData auditData;
}