package com.chattigo.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chattigo.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

    

}
