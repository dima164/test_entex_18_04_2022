package ro.dima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ro.dima.entity.County;

import java.util.Optional;

public interface CountyRepository extends JpaRepository<County,Long> {

    public Optional<County> findById(Long id);

}
