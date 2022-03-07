package com.example.lms.repository;

import com.example.lms.entity.BankInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankInfoRepository extends MongoRepository<BankInfo, Integer> {
}
