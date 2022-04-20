package ro.dima.controller;


import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.dima.dto.UsersDataDto;
import ro.dima.dto.UsersDataDtoWithId;
import ro.dima.service.UsersDataService;

import java.util.List;

@Api(value = "API for handling usersdata")
@RestController
public class RestUsersDataController {

    @Autowired
    UsersDataService usersDataService;

    // CREATE
    @PostMapping("/usersdata")
    public ResponseEntity<String> createUsersData(@RequestBody final UsersDataDtoWithId usersDataDtoWithId) {

        if (usersDataService.saveUsersData(usersDataDtoWithId)) {
            return ResponseEntity.ok("The UsersData was saved ");
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("The UsersData was not saved ");
    }


    // READ
    @GetMapping("usersdata")
    public List<UsersDataDto> getAllUsersDatas() {
        return usersDataService.findAll();
    }

    @GetMapping("/usersdata/email/{email}")
    UsersDataDto getUsersDtoByEmail(@PathVariable("email") String email) {
        return usersDataService.findByEmail(email);
    }

    // UPDATE
    @PutMapping("/usersdata/id/{id}")
    boolean updateUsersDataByIdContr(@PathVariable("id") Long id ,@RequestBody UsersDataDtoWithId usersDataDtoWithId) {
        return usersDataService.updateUsersDataById(id,usersDataDtoWithId);
    }

    // DELETE
    @DeleteMapping("/usersdata/id/{id}")
    void deleteUsersDataById(@PathVariable("id") Long id){
        usersDataService.deleteById(id);
    }

    }


