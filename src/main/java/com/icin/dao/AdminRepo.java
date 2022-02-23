package com.icin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icin.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>
{

}
