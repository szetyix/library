/*
* File: Main.java
* Author: Nagy Szemere  
* Copyright: 2026, Nagy Szemere
* Group: Szoft I/N
* Date: 2026-11-18
* Github: https://github.com/szetyix/
* Licenc: MIT
*/

package com.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseAccess db = new SqliteDatabaseAccess();
        BookController controller = new BookController(db);
        controller.run();
    }
}