package com.example.tablereservation.repository;

import com.example.tablereservation.domain.Member;
import com.example.tablereservation.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {
}
