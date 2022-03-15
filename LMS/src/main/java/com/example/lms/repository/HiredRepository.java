package com.example.lms.repository;

import com.example.lms.entity.HiredCandidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HiredRepository extends MongoRepository<HiredCandidate,Integer> {

}
