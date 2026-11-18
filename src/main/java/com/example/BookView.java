/*
* File: BookView.java
* Author: Nagy Szemere
* Copyright: 2026, Nagy Szemere
* Group: Szoft I/N
* Date: 2026-11-18
* Github: https://github.com/szetyix/
* Licenc: MIT
*/

package com.example;

import java.util.List;

public class BookView {
    public void printBooks(List<Book> books) {
        System.out.printf("%-4s %-23s %-23s %-5s%n", "Id", "Cím", "Szerző", "Év");

        for (Book book : books) {
            System.out.printf("%-4d %-23s %-23s %-5d%n",
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getYear()
            );
        }
    }
}