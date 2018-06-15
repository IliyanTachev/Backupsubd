package com.subd.project;

import com.subd.project.Config.SpringJdbcConfig;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCSetup {
    private SpringJdbcConfig springJdbcConfig;

    Connection connection = null;

    {
        try {
            connection = springJdbcConfig.mysqlDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
