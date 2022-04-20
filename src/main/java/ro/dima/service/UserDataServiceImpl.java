package ro.dima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.dima.dto.UsersDataDto;
import ro.dima.dto.UsersDataDtoWithId;
import ro.dima.entity.County;
import ro.dima.entity.Locality;
import ro.dima.entity.UsersData;
import ro.dima.repository.CountyRepository;
import ro.dima.repository.LocalityRepository;
import ro.dima.repository.UsersDataRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDataServiceImpl implements UsersDataService {
    @Autowired
    UsersDataRepository usersDataRepository;
    @Autowired
    CountyRepository countyRepository;
    @Autowired
    LocalityRepository localityRepository;

    // CREATE
    @Override
    public boolean saveUsersData(UsersDataDtoWithId usersDataDtoWithId) {
        final UsersData usersData = new UsersData();
        final County county = countyRepository.getById(usersDataDtoWithId.getIdCounty());
        final Locality locality = localityRepository.getById(usersDataDtoWithId.getIdLocality());
        usersData.setId(usersDataDtoWithId.getId());
        usersData.setName(usersDataDtoWithId.getName());
        usersData.setEmail(usersDataDtoWithId.getEmail());
        usersData.setLocality(locality);
        usersData.setCounty(county);
        usersData.setAge(usersDataDtoWithId.getAge());
        usersData.setOcupation(usersDataDtoWithId.getOcupation());

        final UsersData savedUsersData = usersDataRepository.save(usersData);

        return (savedUsersData.getId() != null);
    }

    // READ
    @Override
    public List<UsersDataDto> findAll() {
        return usersDataRepository.findAll().stream()
                .map(u -> new UsersDataDto(u.getId(), u.getName(), u.getEmail(), u.getLocality(), u.getCounty(), u.getAge(), u.getOcupation()))
                .collect(Collectors.toList());
    }

    @Override
    public UsersDataDto findByEmail(String email) {
        return usersDataRepository.findByEmail(email)
                .map(u -> new UsersDataDto(u.getId(), u.getName(), u.getEmail(), u.getLocality(), u.getCounty(), u.getAge(), u.getOcupation()))
                .orElse(new UsersDataDto());
    }

    //UPDATE
    @Override
    public boolean updateUsersDataById(Long id, UsersDataDtoWithId usersDataDtoWithId) {
        if (usersDataRepository.findById(id).isEmpty())
            return false;

        deleteById(id);
        final UsersData usersData = new UsersData();
        final County county = countyRepository.getById(usersDataDtoWithId.getIdCounty());
        final Locality locality = localityRepository.getById(usersDataDtoWithId.getIdLocality());
        usersData.setId(usersDataDtoWithId.getId());
        usersData.setName(usersDataDtoWithId.getName());
        usersData.setEmail(usersDataDtoWithId.getEmail());
        usersData.setLocality(locality);
        usersData.setCounty(county);
        usersData.setAge(usersDataDtoWithId.getAge());
        usersData.setOcupation(usersDataDtoWithId.getOcupation());

        final UsersData savedUsersData = usersDataRepository.save(usersData);

        return (savedUsersData.getId() != null);
    }

    // DELETE
    public void deleteById(Long id) {
        usersDataRepository.deleteById(id);
    }

}
