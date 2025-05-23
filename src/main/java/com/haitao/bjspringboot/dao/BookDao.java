package com.haitao.bjspringboot.dao;

import com.haitao.bjspringboot.entity.pojo.Book;
import com.haitao.bjspringboot.entity.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDao extends JpaRepository<Book,Integer> {

    List<Book> findAllByCategory(Category category);

    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}
