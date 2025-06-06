package com.restaurante.demo.repository;

import com.restaurante.demo.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByReservaId(Long reservaId);
    List<Pedido> findByMesaId(Long mesaId);
}
