package com.navz.project.ecommerce.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.navz.project.ecommerce.entity.OrderCollectionStatus;

@Repository
@Qualifier(value = "orderCollectionStatusRepository")
public interface OrderCollectionStatusRepository extends JpaRepository<OrderCollectionStatus, Long> {

}
