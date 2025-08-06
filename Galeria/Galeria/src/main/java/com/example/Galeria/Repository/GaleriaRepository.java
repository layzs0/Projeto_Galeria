package com.example.Galeria.Repository;

import com.example.Galeria.Models.Galeria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GaleriaRepository extends JpaRepository<Galeria,Long> {
}
