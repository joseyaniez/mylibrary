
package com.jose.mylibrary.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.jose.mylibrary.library.model.entity.Author;

/**
 * AuthorNationality
 */
public interface AuthorNationality extends CrudRepository<Author, Long>{
    
}
