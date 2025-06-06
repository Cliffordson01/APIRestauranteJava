// Responsavél: Gabriel Ribeiro | Cliffordson Cetoute
package com.restaurante.demo.repository;

import com.restaurante.demo.Model.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long> {
    List<Mesa> findByStatus(String status);
    boolean existsByNumero(Integer numero);
}