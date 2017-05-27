package com.techprimers.jpa.springjpahibernateexample.resource;


import com.techprimers.jpa.springjpahibernateexample.model.Users;
import com.techprimers.jpa.springjpahibernateexample.model.UsersLog;
import com.techprimers.jpa.springjpahibernateexample.repository.UsersLogRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users/log")
public class UsersLogResource {

    private UsersLogRepository usersLogRepository;

    public UsersLogResource(UsersLogRepository usersLogRepository) {
        this.usersLogRepository = usersLogRepository;
    }

    @GetMapping(value = "/all")
    public List<UsersLog> getAll() {

        return usersLogRepository.findAll();
    }


    @GetMapping(value = "/update/{name}")
    public List<UsersLog> update(@PathVariable final String name) {

        Users users = new Users();

        users.setName(name)
                .setSalary(12000)
                .setTeamName("Operations");

        UsersLog usersLog1 = new UsersLog();
        usersLog1.setUsers(users);
        usersLog1.setLog("Hi Youtube");

        usersLogRepository.save(usersLog1);

        UsersLog usersLog2 = new UsersLog();
        usersLog2.setUsers(users);
        usersLog2.setLog("Hi Viewers");
        usersLogRepository.save(usersLog2);

        return usersLogRepository.findAll();

    }
}
