package com.example.lms.repository;

import com.example.lms.entity.HiredCandidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HiredRepository extends MongoRepository<HiredCandidate,Integer> {

}
