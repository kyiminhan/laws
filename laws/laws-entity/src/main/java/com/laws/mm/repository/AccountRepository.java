package com.laws.mm.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laws.mm.entity.Account;
import com.laws.mm.repository.dao.AccountDao;

@Lazy
@Repository
public interface AccountRepository extends JpaRepository<Account, Long>, AccountDao {

}
