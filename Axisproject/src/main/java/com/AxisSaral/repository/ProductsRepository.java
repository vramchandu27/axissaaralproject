package com.AxisSaral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AxisSaral.model.Image;
import com.AxisSaral.model.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products,Long>{

	Image save(Image image);

}
