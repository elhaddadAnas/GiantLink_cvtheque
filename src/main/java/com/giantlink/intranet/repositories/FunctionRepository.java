package com.giantlink.intranet.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giantlink.intranet.entities.Function;

@Repository
public interface FunctionRepository extends JpaRepository<Function, Long> {
	Optional<Function> findByName(String name);

	Page<Function> findByNameContainingIgnoreCase(String name, Pageable pageable);
}