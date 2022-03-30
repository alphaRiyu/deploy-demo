package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rieugene Basilisco (generieu17@gmail.com)
 * @project demo
 * @created Mar 30, 2022 11:26 PM
 */

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}
