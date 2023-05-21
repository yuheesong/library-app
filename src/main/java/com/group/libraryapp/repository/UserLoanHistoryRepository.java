package com.group.libraryapp.repository;

import com.group.libraryapp.entity.UserLoanHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoanHistoryRepository extends JpaRepository<UserLoanHistory, Long> {
    boolean existsByBookNameAndIsReturn(String name, boolean isReturn);
}
