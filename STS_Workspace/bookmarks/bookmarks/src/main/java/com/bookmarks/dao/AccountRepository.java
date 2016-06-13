package com.bookmarks.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmarks.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}
