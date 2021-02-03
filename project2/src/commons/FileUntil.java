package commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUntil {
    public static void writeInFile(String pathFile, String line){
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<String> readFromFile(String pathFile){
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                listLine.add(line);
            }
            bufferedReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return listLine;
    }
}
