package com.github.mayconribeiro.cityapi.staties.repository;

import com.github.mayconribeiro.cityapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
