package com.example.comp1011200474224test1;

import com.example.comp1011200474224test1.Netflix;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;


import java.sql.*;
import java.util.ArrayList;


public class DBUtility {


    private static String user = "student"; //MySQL server username
    private static String pw = "student";   //MySQL server password

    //jdbc:mysql = Java DataBase Connector to MySQL
    //127.0.0.1 = IP address where the MySQL server is
    //3306 = Port # that MySQL server is accessible on
    //F22 = the database name
    //private static String connectUrl = "jdbc:mysql://127.0.0.1:3306/F22";
    private static String connectUrl = "jdbc:mysql://localhost:3306/javatest";

    public static ArrayList<Netflix> getFlixFromDB() {
        ArrayList<Netflix> flix = new ArrayList<>();

        //create the sql string we want to run on the database
        String sql = "SELECT showid, type, title, rating, rating, director,cast" +
        " FROM javatest.netflix;";


        try (
                //1.  connect to the database
                Connection conn = DriverManager.getConnection(connectUrl, user, pw);

                //2.  create a statement object
                Statement statement = conn.createStatement();

                //3.  use the statement object to run the sql and return a ResultSet object
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            //4.  loop over the resultSet and create Topping objects
            while (resultSet.next()) {
                int showId = resultSet.getInt("showId");
                String type = resultSet.getString("type");
                String title = resultSet.getString("title");
                String rating = resultSet.getString("rating");
                String director = resultSet.getString("director");
                String cast = resultSet.getString("cast");
                Netflix newNetflix = new Netflix(showId, type, title, rating, director, cast);
                flix.add(newNetflix);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flix;
    }




}