package com.uilangage.langcine.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uilangage.langcine.test.domain.Test;

@Repository
public interface TestRepository  extends JpaRepository<Test, Integer>{

}
