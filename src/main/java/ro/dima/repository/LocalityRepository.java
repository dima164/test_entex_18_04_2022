package ro.dima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.dima.entity.Locality;

import java.util.Optional;

public interface LocalityRepository extends JpaRepository<Locality,Long> {


}
