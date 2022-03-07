package com.example.lms.service;

import com.example.lms.exception.UserDefinedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Date;

@Service
public class EmailService {

    @Autowired
    JavaMailSender javaMailSender;

    /********************************************************************************************************************************
     * Ability to send a otpNumber to given emailId for emailVerification
     * @param mail
     * @param subject
     * @param text
     *******************************************************************************************************************************/

    public void sendEmail(String mail, String subject, String text) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("immanuveljeeva2000@gmail.com");
            message.setTo(mail);
            message.setSubject(subject);
            message.setText(text);
            message.setSentDate(new Date());
            javaMailSender.send(message);
        }catch (Exception e){
            throw new UserDefinedException("Mail was not sent");
        }
    }

    public void sendLink(String emailId, String subject, String text){
        try {

        MimeMessage message = javaMailSender.createMimeMessage();
        message.setFrom("immanuveljeeva2000@gmail.com");
        message.addRecipient(Message.RecipientType.TO,new InternetAddress(emailId));

        message.setSubject(subject);
        // Create the message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();

        // Fill the message
        messageBodyPart.setText(text ,"UTF-8","html");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        // Put parts in message
        message.setContent(multipart);

        // Send the message
        javaMailSender.send(message);

        } catch (MessagingException e) {
            throw new UserDefinedException("Message Not sent");
        }
    }

}
