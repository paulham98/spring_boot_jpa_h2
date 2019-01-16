package com.transaction.h2.repositories;

import com.transaction.h2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchResultRepository extends JpaRepository<User, Long> {
}
