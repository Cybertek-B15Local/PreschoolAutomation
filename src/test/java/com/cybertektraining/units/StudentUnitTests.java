package com.cybertektraining.units;

import com.cybertektraining.pojos.Student;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

public class StudentUnitTests {

    @Test
    public void test1() {
        try {
            String path = System.getProperty("user.dir") + "/student.json";
            System.out.println(path);
            Gson gson = new Gson();
            Student student = new Student();

            FileReader fileReader = new FileReader(path);

            Student student_from_json = gson.fromJson(fileReader, Student.class);

            System.out.println(student_from_json);

            Assert.assertEquals("01/01/1890", student_from_json.getBirthDate());
            Assert.assertEquals("7925 Jones Branch Dr", student_from_json.getCompany().getAddress().getStreet());
            Assert.assertEquals("james_bond@gmail.com", student_from_json.getContact().getEmailAddress());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
