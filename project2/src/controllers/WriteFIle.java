package controllers;

import models.House;
import models.Room;
import models.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static controllers.MainConTroller.COMMA;

public class WriteFIle {

    public static void writeCSV(String FILE_PATH, Villa villa, boolean isTransplant) {
        File file = new File(FILE_PATH);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, isTransplant);
            BufferedWriter buffWrite = new BufferedWriter(fileWriter);

            buffWrite.write(villa.getId() + COMMA + villa.getNameService() + COMMA
                    + villa.getAreaUsed() + COMMA + villa.getCost() + COMMA
                    + villa.getNumberMaxPerson() + COMMA + villa.getTypeService() + COMMA
                    + villa.getStandardService() + COMMA
                    + villa.getOtherService() + COMMA + villa.getAreaPool() + COMMA
                    + villa.getFloor() + "\n"
            );

            buffWrite.flush();

            buffWrite.close();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeCSV(String FILE_PATH, House house, boolean isTransplant) {
        File file = new File(FILE_PATH);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, isTransplant);
            BufferedWriter buffWrite = new BufferedWriter(fileWriter);

            buffWrite.write(house.getId() + COMMA + house.getNameService() + COMMA
                    + house.getAreaUsed() + COMMA + house.getCost() + COMMA
                    + house.getNumberMaxPerson() + COMMA + house.getTypeService() + COMMA
                    + house.getStandardService() + COMMA
                    + house.getOtherService() + COMMA + house.getFloor() + "\n"
            );

            buffWrite.flush();

            buffWrite.close();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void writeCSV(String FILE_PATH, Room room, boolean isTransplant) {
        File file = new File(FILE_PATH);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, isTransplant);
            BufferedWriter buffWrite = new BufferedWriter(fileWriter);

            buffWrite.write(room.getId() + COMMA + room.getNameService() + COMMA
                    + room.getAreaUsed() + COMMA + room.getCost() + COMMA
                    + room.getNumberMaxPerson() + COMMA + room.getTypeService() + COMMA + room.getFreeService());

            buffWrite.flush();

            buffWrite.close();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
