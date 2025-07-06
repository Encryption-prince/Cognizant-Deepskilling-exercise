package org.example;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc = new Scanner(System.in);

        BookService bookService = (BookService) context.getBean("bookService");
        System.out.print("ENTER BOOK NAME TO ADD : ");
        String bookName = sc.nextLine();
        bookService.addBook(bookName);
        sc.close();
    }
}