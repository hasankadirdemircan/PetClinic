package com.hkdemircan.dao;

import com.hkdemircan.model.Owner;

import java.util.List;

/**
 * Owner icin tum dao islemleri gerceklestirilecek.
 */
public interface OwnerRepository {
    List<Owner> findAll();
    Owner findById(Long id);
    List<Owner> findByLastName(String lastName);

    void create(Owner owner);
    Owner update(Owner owner);
    void delete(Long id);

}
