package com.example.MyNewProject.repository;

import com.example.MyNewProject.tables.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CandidateRepo extends JpaRepository<Candidate,Integer> {
    @Override
    Optional<Candidate> findById(Integer integer);

    List<Candidate> findByName(String name);

    List<Candidate> findByParty(String partyname);

    List<Candidate> findByNameAndParty(String name, String party);
    List<Candidate> findAll();

    @Query(value = """
SELECT *
FROM CANDIDATE c
WHERE (:name IS NULL OR LOWER(c.NAME) LIKE '%' || LOWER(:name) || '%')
AND (:party IS NULL OR LOWER(c.PARTY) LIKE '%' || LOWER(:party) || '%')
AND (:state IS NULL OR LOWER(c.CURRENT_STATE) LIKE '%' || LOWER(:state) || '%')
AND (:constituency IS NULL OR LOWER(c.CURRENT_CONSTITUENCY) LIKE '%' || LOWER(:constituency) || '%')
""", nativeQuery = true)
    List<Candidate> search(
            @Param("name") String name,
            @Param("party") String party,
            @Param("state") String state,
            @Param("constituency") String constituency
    );
}
