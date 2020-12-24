package com.poc.nexware.repository;

import com.poc.nexware.entity.Palindrome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PalindromeRepository extends JpaRepository<Palindrome, Long> {


    @Query("select p from Palindrome p order by p.list asc")
    List<Palindrome> getAllPalindromes();

}
