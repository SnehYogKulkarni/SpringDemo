package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Library;

@Repository
public interface LibraryJpaRepository extends JpaRepository<Library, Long>{

}
