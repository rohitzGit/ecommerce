package com.navz.project.ecommerce.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.navz.project.ecommerce.entity.ProductCategory;

@Repository
@Qualifier(value = "productCatogoryRepository")
public interface ProductCatogoryRepository extends JpaRepository<ProductCategory, Long> {

	List<ProductCategory> findByBestCategory(boolean bestCategory);
}
