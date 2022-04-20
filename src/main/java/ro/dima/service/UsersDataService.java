package ro.dima.service;

import ro.dima.dto.UsersDataDto;
import ro.dima.dto.UsersDataDtoWithId;

import java.util.List;

public interface UsersDataService {
    // CREATE
    boolean saveUsersData(UsersDataDtoWithId usersDataDtoWithId);

    // READ
    List<UsersDataDto> findAll();

    UsersDataDto findByEmail(String email);

    // UPDATE
    boolean updateUsersDataById(Long id , UsersDataDtoWithId usersDataDtoWithId);

    // DELETE
    void deleteById(Long id);
}
