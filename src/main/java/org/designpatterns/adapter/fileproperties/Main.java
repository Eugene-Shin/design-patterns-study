package org.designpatterns.adapter.fileproperties;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //FileIO-Properties Adapter
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src/main/java/org/designpatterns/adapter/file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("src/main/java/org/designpatterns/adapter/newfile.txt");
            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
