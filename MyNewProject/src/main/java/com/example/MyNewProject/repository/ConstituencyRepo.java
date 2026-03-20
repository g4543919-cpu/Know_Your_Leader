package com.example.MyNewProject.repository;

import com.example.MyNewProject.tables.Candidate;
import com.example.MyNewProject.tables.Constituency;
import org.springframework.data.jpa.repository.JpaRepository;

//import java.lang.ScopedValue;
import java.util.List;
import java.util.Optional;

public interface ConstituencyRepo extends JpaRepository<Constituency,Integer> {
    @Override
    Optional<Constituency> findById(Integer integer);

    Optional<Constituency> findByNameAndStateAndDistrict(String state, String district, String constname);
}
