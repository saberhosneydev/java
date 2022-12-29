package dev.saberhosney.testing.repository;

import dev.saberhosney.testing.entity.ChargilyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargilyEntityRepository extends JpaRepository<ChargilyEntity, Integer> {

}