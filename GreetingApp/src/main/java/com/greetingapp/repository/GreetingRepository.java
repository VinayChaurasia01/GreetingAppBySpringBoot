package com.greetingapp.repository;

import com.greetingapp.model.Greeting;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
