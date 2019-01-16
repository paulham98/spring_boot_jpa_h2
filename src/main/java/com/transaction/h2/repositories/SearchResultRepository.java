package com.transaction.h2.repositories;


import com.transaction.h2.domain.SearchResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchResultRepository extends JpaRepository<SearchResult, Long> {
}
