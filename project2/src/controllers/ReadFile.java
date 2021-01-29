package controllers;

import models.Services;
import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<Services> readCSV(String FILE_PATH, Villa villa){
        List<Services> servicesList = new ArrayList<>();
        File file = new File(FILE_PATH);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buffRead = new BufferedReader(fileReader);

            String line;
            String[] temp;
            Services services;
            while ((line = buffRead.readLine()) != null){
                temp = line.split(",");
                services = new Services(temp[0], temp[1],temp[2], temp[3],temp[4],temp[5],temp[5],temp[6], temp[7],temp[8],temp[9]) {

                };
                servicesList.add(services);
            }
            buffRead.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return servicesList;
    }
}
