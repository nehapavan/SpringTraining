package com.evoke.auditing.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evoke.auditing.entity.OnlineBookStoreApp;

@Repository
public interface AuditBookRepo extends JpaRepository<OnlineBookStoreApp, Integer> {

}
