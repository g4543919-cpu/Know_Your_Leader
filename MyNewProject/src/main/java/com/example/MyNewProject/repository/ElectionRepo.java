package com.example.MyNewProject.repository;

import com.example.MyNewProject.tables.Election;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectionRepo extends JpaRepository<Election,Integer> {

}
