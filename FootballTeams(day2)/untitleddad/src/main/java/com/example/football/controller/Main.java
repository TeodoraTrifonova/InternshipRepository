package main.java.com.example.football.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            File textfile = new File("filename.txt");
            if (!textfile.createNewFile()) {
                textfile.delete();
                textfile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
        ArrayList<Teams> randomTeams = Generator.GenerateTeams();
        boolean flag = WritetoFile("filename.txt", randomTeams);

        ReadFile("filename.txt");

    }

    public static boolean WritetoFile(String filename, ArrayList<Teams> teams) throws IOException {
        try {
            FileWriter myWriter = new FileWriter(filename);
            for (Teams team : teams) {
                myWriter.write(team.toString());
            }
            myWriter.close();
        } catch(IOException e){
            return false;
        }
        return true;
    }


    public static void ReadFile(String filename)
    {
        try {
            File file = new File(filename);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                Teams team = new Teams(myReader.next(),myReader.next(),myReader.next(),myReader.next());
                System.out.println(team);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    }





