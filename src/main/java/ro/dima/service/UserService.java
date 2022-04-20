package ro.dima.service;

import ro.dima.dto.UserDto;

import java.util.Optional;

public interface UserService {

    Optional<UserDto> findById(Long id);

    Optional<UserDto> findByEmail(String email);
}
