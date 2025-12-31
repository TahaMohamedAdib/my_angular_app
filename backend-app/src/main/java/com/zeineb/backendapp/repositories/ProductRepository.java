package com.zeineb.backendapp.repositories;

import com.zeineb.backendapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
