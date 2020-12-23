package de.awacademy.classicModelsDemo.Data;

import de.awacademy.classicModelsDemo.Models.Employee;
import de.awacademy.classicModelsDemo.Models.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficeRepository extends JpaRepository<Office, String> {




}
