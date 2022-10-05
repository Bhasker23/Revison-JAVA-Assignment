package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
