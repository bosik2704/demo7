package com.example.demo7.repository;

import com.example.demo7.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface GuestRepository extends JpaRepository<Guest, Long>, QuerydslPredicateExecutor<Guest> {

}
