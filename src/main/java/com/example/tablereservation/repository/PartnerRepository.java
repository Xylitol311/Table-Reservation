package com.example.tablereservation.repository;

import com.example.tablereservation.domain.Member;
import com.example.tablereservation.domain.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, String> {
}
