package com.example.haltest.haltest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "some", excerptProjection = Brief.class)
public interface SomeRepository extends JpaRepository<SomeEntity, Integer> {

}
