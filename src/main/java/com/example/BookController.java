/*
* File: BookController.java
* Author: Nagy Szemere
* Copyright: 2026, Nagy Szemere
* Group: Szoft I/N
* Date: 2026-11-18
* Github: https://github.com/szetyix/
* Licenc: MIT
*/

package com.example;

import java.sql.SQLException;
import java.util.List;

public class BookController {
    private final BookService service;
    private final BookView view;

    public BookController(DatabaseAccess db) {
        this.service = new BookService(db);
        this.view = new BookView();
    }

    public void run() throws SQLException {
        service.initializeDatabase();
        List<Book> books = service.getBooks();
        view.printBooks(books);
    }
}