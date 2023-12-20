package Classes;

import java.io.FileWriter;
import java.io.IOException;

public class Log {
    private static String fileName = "default_name.txt";

    /**
     * Метод для записи строки в файл
     * @param str
     */
    static void writeToFile(String str){
        try (FileWriter writer = new FileWriter(fileName,true)){
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для установки имени лог-файла
     * @param name
     */
    public static void setLogName(String name){
        fileName = name;
    }
}
