package com.cybertektraining.utilities;

import com.cybertektraining.pojos.Student;
import com.google.gson.Gson;

import java.io.FileReader;

public class FileUtilities {

    /**
     * This methods reads external JSON file and coverts it into Student POJO
     * @param path to the student JSON file
     * @return
     */
    public static Student getUserFromJSON(String path){
        Student student = null;
        try {
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(path);
            student = gson.fromJson(fileReader, Student.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  student;
    }
}
