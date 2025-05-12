package com.haitao.bjspringboot.entity.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @ManyToOne
    @JoinColumn(name="cid")
    private Category category;

    String cover;
    String title;
    String author;
    String date;
    String press;
    String abs;
}
