/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreadedstudentclient;

/**
 *
 * @author M C
 */


import java.io.*;
import java.net.*;

public class MultithreadedStudentClient {
    public static void main(String[] args) {
        final String SERVER_IP = "localhost"; // or use server IP address
        final int SERVER_PORT = 12324;

        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("ZIYAD SAEED ALI ALSHEHRI");
            System.out.println("ID: 445802046");
            
            
            System.out.println("Connected to Server");

            // Thread to read messages from server
            new Thread(() -> {
                String serverMessage;
                try {
                    while ((serverMessage = in.readLine()) != null) {
                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            // Main loop to send messages
            String input;
            while ((input = keyboard.readLine()) != null) {
                out.println(input);
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
