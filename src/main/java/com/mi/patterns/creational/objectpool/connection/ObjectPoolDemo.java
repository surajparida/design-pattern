package com.mi.patterns.creational.objectpool.connection;

import java.sql.Connection;

/**
 * Created by Suraj.Parida on 1/1/2016.
 */
public class ObjectPoolDemo {
    public static void main(String args[]) {
        // Do something...


        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        // Get a connection:
        Connection con = pool.checkOut();

        // Use the connection


        // Return the connection:
        pool.checkIn(con);

    }
}
