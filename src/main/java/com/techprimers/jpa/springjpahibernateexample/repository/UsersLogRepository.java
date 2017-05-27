package com.techprimers.jpa.springjpahibernateexample.repository;

import com.techprimers.jpa.springjpahibernateexample.model.UsersLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersLogRepository extends JpaRepository<UsersLog, Integer> {
}
