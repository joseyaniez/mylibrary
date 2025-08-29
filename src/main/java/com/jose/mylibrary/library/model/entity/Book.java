
package com.jose.mylibrary.library.model.entity;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Book
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long title;

    @Column(unique = true)
    private String isbn;

    private LocalTime publicationDate;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    
}
