package com.company.HomeWork31;



import java.sql.*;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/users",
                "root", "qwerty");
        Statement state = conn.createStatement();
        //state.executeUpdate("UPDATE user set age=35 where id=1");
        //state.executeUpdate("INSERT INTO user (first_name, last_name, age) values ('Даша','Ефросинина','12')");
        ResultSet data = state.executeQuery("SELECT * FROM user");
        while (data.next()) {
            System.out.println(data.getInt(1) +
                    data.getString("first_name") +
                    data.getString("last_name") +
                    data.getInt("age"));
        }
        ResultSetMetaData metaData = data.getMetaData();
        for (int i = 0; i < metaData.getColumnCount(); i++) {
            System.out.println("Colum name " + metaData.getColumnName(i + 1));
            System.out.println("Colum lable " + metaData.getColumnLabel(i + 1));
            System.out.println("Colum type " + metaData.getColumnType(i + 1));
        }
        System.out.println("Updated....");

    }
}
