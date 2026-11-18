/*
* File: SqliteDatabaseAccess.java
* Author: Nagy Szemere  
* Copyright: 2026, Nagy Szemere
* Group: Szoft I/N
* Date: 2026-11-18
* Github: https://github.com/szetyix/
* Licenc: MIT
*/

package com.example;

import java.sql.Connection;
import java.sql.SQLException;

import org.sqlite.SQLiteDataSource;

public class SqliteDatabaseAccess implements DatabaseAccess {
    private final SQLiteDataSource ds;

    public SqliteDatabaseAccess() {
        ds = new SQLiteDataSource();
        ds.setUrl("jdbc:sqlite:books.sqlite");
    }

    @Override
    public Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}