package com.poojeri.sachin.atg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poojeri.sachin.atg.model.LoginModel;

@Repository
public interface LoginDAO extends JpaRepository<LoginModel, Integer>{

}
