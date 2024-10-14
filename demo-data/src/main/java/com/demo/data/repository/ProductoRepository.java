package com.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.data.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
