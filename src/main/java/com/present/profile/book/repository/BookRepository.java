package com.present.profile.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.present.profile.LoginModel.DAOUser;

public interface BookRepository extends JpaRepository<DAOUser, Long>{

}
