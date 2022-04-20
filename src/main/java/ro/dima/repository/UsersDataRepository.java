package ro.dima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.dima.entity.UsersData;

import java.util.List;
import java.util.Optional;

public interface UsersDataRepository extends JpaRepository<UsersData, Long> {
    List<UsersData> findAll();

    Optional<UsersData> findByEmail(String email);
}
