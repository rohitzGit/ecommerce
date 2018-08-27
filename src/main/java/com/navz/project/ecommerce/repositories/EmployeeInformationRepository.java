package com.navz.project.ecommerce.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.navz.project.ecommerce.entity.EmployeeInformation;

@Repository
@Qualifier(value = "employeeInformationRepository")
public interface EmployeeInformationRepository extends JpaRepository<EmployeeInformation, Long> {

	EmployeeInformation findByPk(final String pk);
}
