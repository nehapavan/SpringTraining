package com.example.demorepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoentity.DemoEntity;

@Repository
public interface DemoRepo extends JpaRepository<DemoEntity, Integer> {

}
