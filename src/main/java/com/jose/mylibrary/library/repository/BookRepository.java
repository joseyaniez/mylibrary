
package com.jose.mylibrary.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.jose.mylibrary.library.model.entity.Book;

/**
 * BookRepository
 */
public interface BookRepository extends CrudRepository<Book, Long>{

}
