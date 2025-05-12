package com.haitao.bjspringboot.dao;

import com.haitao.bjspringboot.entity.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
