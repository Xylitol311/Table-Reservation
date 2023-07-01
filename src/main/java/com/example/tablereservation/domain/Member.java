package com.example.tablereservation.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;

@Getter
@Setter
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Member {
    @Id
    private String id;
    private String password;
}
