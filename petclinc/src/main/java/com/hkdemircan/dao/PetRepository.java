package com.hkdemircan.dao;

import com.hkdemircan.model.Pet;

import java.util.List;

public interface PetRepository {
    Pet findById(Long id);
    List<Pet> findByOwnerId(Long ownerId);
    void create(Pet pet);
    Pet update(Pet pet);
    void delete(Long id);
    void deleteByOwnerId(Long ownerId);//owner'a ait tum pet kayitlarini silecek.
}
