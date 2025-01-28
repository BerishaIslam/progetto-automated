package it.islam.automated.repository;

import it.islam.automated.entity.DateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateTimeRepository extends JpaRepository<DateTime, Long> {
}
