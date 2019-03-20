package com.qa.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.demo.entities.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

}
