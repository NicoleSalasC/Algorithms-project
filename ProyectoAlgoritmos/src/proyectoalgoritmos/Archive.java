/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoalgoritmos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nicos
 */
public class Archive {

    public static void main(String[] args) {

        ArrayList<String> proceduresList = new ArrayList<String>();

        String filePath = "src/proyectoalgoritmos/Procedures.java";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {

                if (line.matches("^  [public static void printMessage(){] $")) {

                    proceduresList.add(line);
                    System.out.println(line);

                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String pr : proceduresList) {
                System.out.println("tututu");

                System.out.println(pr);

            }
        }

    }