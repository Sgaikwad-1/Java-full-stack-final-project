package com.ascent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ascent.entity.Menu;
@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer>{

}
