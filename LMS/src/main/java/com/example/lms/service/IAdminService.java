package com.example.lms.service;

import com.example.lms.dto.AdminDTO;
import com.example.lms.entity.Admin;

import java.util.List;

public interface IAdminService {
    public AdminDTO addAdmin(AdminDTO adminDTO);
    public List<Admin> getAllAdmin();
    public Admin getAdminById(int id);
    public void deleteAdmin(int id);
    public Admin editAdmin(int id,AdminDTO adminDTO);
    public int idGenerator();
    public Admin forgotPassword(String emailId);
    public void otpVerification(int otp);
    public String resetPassword(String newPassword);
}
