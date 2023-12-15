package ru.mirea.lab13;

import java.io.*;

public class Files {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Запись в файл
            FileWriter writer = new FileWriter("file.txt");
            System.out.println("file input:");
            String input = reader.readLine();
            writer.write(input);
            writer.close();

            // Вывод информации из файла
            FileReader readerFile = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(readerFile);
            System.out.println("file output:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            readerFile.close();
            
            FileWriter writerReplace = new FileWriter("file.txt");
            System.out.println("input replacement text:");
            String replaceInput = reader.readLine();
            writerReplace.write(replaceInput);
            writerReplace.close();

            FileWriter writerAppend = new FileWriter("file.txt", true);
            System.out.println("input text to append to the end of the file:");
            String appendInput = reader.readLine();
            writerAppend.write(appendInput);
            writerAppend.close();

            FileReader readerUpdated = new FileReader("file.txt");
            BufferedReader bufferedReaderUpdated = new BufferedReader(readerUpdated);
            System.out.println("updated file:");
            String updatedLine;
            while ((updatedLine = bufferedReaderUpdated.readLine()) != null) {
                System.out.println(updatedLine);
            }
            readerUpdated.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
