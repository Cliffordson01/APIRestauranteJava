// Responsavél: Gabriel Ribeiro
package com.restaurante.demo.repository;

import com.restaurante.demo.Model.ItemCardapio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCardapioRepository extends JpaRepository<ItemCardapio, Long> {
}