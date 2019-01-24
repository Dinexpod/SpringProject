package mate.academy.springdemo.repository;

import mate.academy.springdemo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
