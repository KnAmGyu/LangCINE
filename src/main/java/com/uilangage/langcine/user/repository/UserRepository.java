package com.uilangage.langcine.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uilangage.langcine.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {

}
