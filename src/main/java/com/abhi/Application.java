package com.abhi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.entity.Book;
import com.abhi.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnxt = SpringApplication.run(Application.class, args);
		BookRepository repo=cnxt.getBean(BookRepository.class);
		
		Book b=new Book();
		b.setBookId(101);
		b.setBookName("chetan bhagat");
		b.setBookPrice(1000.00);
		
		
		repo.save(b);
		System.out.println("data insert completely");
		
		
		
		
	 }

}
