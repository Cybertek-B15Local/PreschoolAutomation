package com.cybertektraining.api;

import com.cybertektraining.pojos.Student;
import com.cybertektraining.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.FileReader;

import static io.restassured.RestAssured.*;

public class StudentAPI {

    /**
     * @param id of student that has to be deleted
     * @return
     */
    public static int deleteStudent(int id) {
        baseURI = ConfigurationReader.getProperty("uri");
        Response response = when().delete("student/delete/{id}", id);
        return response.getStatusCode();
    }

    /**
     * This method accepts Student object and creates new student via API in Preschool APP
     *
     * @param student to be created
     * @return response information
     */
    public static Response addStudent(Student student) {
        baseURI = ConfigurationReader.getProperty("uri");
        Response response = given().
                contentType(ContentType.JSON).
                body(student).
                when().
                post("student/create");
        return response;
    }

    /**
     * This method accepts Student object and creates new student via API in Preschool APP
     *
     * @param json as String of student that has to be created
     * @return response information
     */
    public static Response addStudent(String json) {
        baseURI = ConfigurationReader.getProperty("uri");
        Response response = given().
                contentType(ContentType.JSON).
                body(json).
                when().
                post("student/create");
        return response;
    }
}
