package pl.edu.pja.sportsmap.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pja.sportsmap.persistence.model.SportComplex;

public interface SportComplexRepository extends JpaRepository<SportComplex, Long> {
}
