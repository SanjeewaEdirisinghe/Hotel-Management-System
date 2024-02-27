/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.ijse.layered.dao;


import hms.ijse.layered.entity.CustomerEntity;
import java.util.List;

public interface CustomerDao {
    void saveOrUpdate(CustomerEntity customer);
    CustomerEntity findById(Long id);
    List<CustomerEntity> findAll();
    void delete(Long id);
}