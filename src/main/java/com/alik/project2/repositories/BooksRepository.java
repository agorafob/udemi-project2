package com.alik.project2.repositories;

import com.alik.project2.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Book,Integer> {
    Optional<Book> findByName(String name);
    List<Book> findByNameStartingWith(String keywords);
}
