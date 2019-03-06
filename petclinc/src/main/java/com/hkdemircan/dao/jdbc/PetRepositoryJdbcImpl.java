package com.hkdemircan.dao.jdbc;

import com.hkdemircan.dao.PetRepository;
import com.hkdemircan.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("petRepository")
public class PetRepositoryJdbcImpl implements PetRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Pet findById(Long id) {
        return null;
    }

    @Override
    public List<Pet> findByOwnerId(Long ownerId) {
        return null;
    }

    @Override
    public void create(Pet pet) {

    }

    @Override
    public Pet update(Pet pet) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void deleteByOwnerId(Long ownerId) {
        String sql = "delete from pet where id = ?";
        jdbcTemplate.update(sql,ownerId);
    }
}
