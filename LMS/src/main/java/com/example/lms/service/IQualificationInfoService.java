package com.example.lms.service;

import com.example.lms.dto.BankInfoDTO;
import com.example.lms.dto.QualificationDTO;
import com.example.lms.entity.BankInfo;
import com.example.lms.entity.QualificationInfo;

import java.util.List;

public interface IQualificationInfoService {
    public QualificationDTO addQualificationInfo(QualificationDTO qualificationDTO);
    public List<QualificationInfo> getAllQualificationInfo();
    public QualificationInfo getQualificationInfoById(int id);
    public void deleteQualificationInfo(int id);
    public QualificationInfo editQualificationInfo(int id,QualificationDTO qualificationDTO);
    public int idGenerator();
}
