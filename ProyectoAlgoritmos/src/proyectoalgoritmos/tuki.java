/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoalgoritmos;

/**
 *
 * @author nicos
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tuki {

    public static void main(String[] args) {

        ArrayList<String> proceduresList = new ArrayList<String>();

        String filePath = "src/proyectoalgoritmos/Procedures.java";

        // Expresión regular para detectar métodos
        String methodRegex = "\\b(public|protected|private|static|\\s)+ [\\w<>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *\\{?";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Compilar la expresión regular
                Pattern pattern = Pattern.compile(methodRegex);
                Matcher matcher = pattern.matcher(line);

                // Si encuentra un método, añadirlo a la lista
                if (matcher.find()) {
                    proceduresList.add(line.trim());
                    System.out.println(line.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir los métodos encontrados
        System.out.println("Métodos encontrados:");
        for (String pr : proceduresList) {
            System.out.println(pr);
        }
    }
}

