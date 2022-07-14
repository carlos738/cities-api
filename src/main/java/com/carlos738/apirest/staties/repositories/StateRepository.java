package com.carlos738.apirest.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos738.apirest.staties.entity.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
