package com.transaction.h2.repositories;

import com.transaction.h2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User,Long> {
}

