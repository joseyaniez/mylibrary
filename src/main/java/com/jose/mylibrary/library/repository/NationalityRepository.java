
package com.jose.mylibrary.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.jose.mylibrary.library.model.entity.Nationality;

/**
 * NationalityRepository
 */
public interface NationalityRepository extends CrudRepository<Nationality, Long>{
    
}
