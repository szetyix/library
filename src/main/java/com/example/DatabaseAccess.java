/*
* File: DatabaseAccess.java
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

public interface DatabaseAccess {
    Connection getConnection() throws SQLException;
}