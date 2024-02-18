package org.tasks.solid.task7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import lombok.extern.slf4j.Slf4j;

/**
 * Analyze this piece of code. Refactor it if in need with explanation each of your step.
 *
 * @author p.serhiienko
 */
@Slf4j
public class ShapeProcessor {

    public static final String DATABASE_PASSWORD = "password";
    private static final String DATABASE_USERNAME = "username";
    public static final String DATABASE_URL = "jdbc:mysql://localhost/mydatabase";

    public void processShape(Object data) {
        if (data instanceof Rectangle rectangle) {
            log.info("Area of the rectangle is: " + rectangle.getWidth() * rectangle.getHeight());
            rectangle.setWidth(10);
            rectangle.setHeight(20);
        } else if (data instanceof Circle circle) {
            log.info("Area of the circle is: " + Math.PI * Math.pow(circle.getRadius(), 2));
            circle.setRadius(5);
        } else if (data instanceof Triangle triangle) {
            log.info("Area of the triangle is: " + 0.5 * triangle.getBase() * triangle.getHeight());
            triangle.setBase(15);
            triangle.setHeight(10);
        }

        // save data to database
        try (Connection conn = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD)) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO shapes (data) VALUES (" + data + ")");
        } catch (SQLException e) {
            log.error("Error saving data to database: " + e.getMessage());
        }
    }
}

/*        Violations
 *   Single responsibility principle
 *    Are Possible improvements
 * 1) Variables with password, login and URL are not safe to save,
 *    they must be exported to the application.properties file
 * 2) If you need to change the size of the figures,
 *    we will already extract them before calculating according to the formula
 * 3) Calculation by formulas transferred to other methods
 * 4) Statement must be entered in the try block, so that the available resources are not exhausted
 * 5) "INSERT INTO shapes (data) VALUES (" + data + ")"
 *    must be rewritten "INSERT INTO shapes (data) VALUES (?)", to prevent SQL injection
 * 6) part 'save data to database' transferred to other class
 */
