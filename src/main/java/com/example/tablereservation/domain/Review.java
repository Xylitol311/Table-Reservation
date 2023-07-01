package com.example.tablereservation.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id")
    private Store store;
    @ManyToOne
    @JoinColumn(name = "id")
    private Member member;
    private LocalDateTime createdTime;
    private String text;
    @ManyToOne
    @JoinColumn(name = "id")
    private Reservation reservation;
}
