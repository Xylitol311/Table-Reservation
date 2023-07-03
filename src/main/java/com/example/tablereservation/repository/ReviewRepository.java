package com.example.tablereservation.repository;

import com.example.tablereservation.domain.Member;
import com.example.tablereservation.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
