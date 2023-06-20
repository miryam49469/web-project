package com.yellow.ordermanageryellow.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "Product_Category")

public class Product_Category {
    @Id
    private String id;
    private String name;
    private String desc;
    private Company companyId;
    @DBRef
    private AuditData auditData;
}
