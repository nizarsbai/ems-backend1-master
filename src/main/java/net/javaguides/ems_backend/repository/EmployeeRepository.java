package net.javaguides.ems_backend.repository;

import net.javaguides.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // ✅ Add this annotation explicitly
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
