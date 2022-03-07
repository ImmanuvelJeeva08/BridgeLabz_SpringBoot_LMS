package com.example.lms.service;

import com.example.lms.dto.HiringCandidateDTO;
import com.example.lms.entity.HiredCandidate;

import java.util.List;

public interface IHiredCandidateService {
    public HiringCandidateDTO addHiredCandidateInfo(HiringCandidateDTO hiringCandidateDTO);
    public List<HiredCandidate> getAllHiredCandidateInfo();
    public HiredCandidate getHiredCandidateInfoById(int id);
    public void deleteHiredCandidateInfo(int id);
    public HiredCandidate editHiredCandidateInfo(int id,HiringCandidateDTO hiringCandidateDTO);
    public int idGenerator();
}
