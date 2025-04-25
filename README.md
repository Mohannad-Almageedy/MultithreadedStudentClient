# Multithreaded Student Client

This is the **client-side application** for the Multithreaded Student Information & Communication System project.

## 🧠 Description

This Java-based client connects to the server, submits student information, and allows real-time messaging with the server. The user can type `"exit"` to leave the session gracefully.

## 🚀 How to Run

1. Open this project (`MultithreadedStudentClient`) in NetBeans or any Java IDE.
2. Make sure the `MultithreadedStudentServer` is already running and listening on port `12324`.
3. Run the `Client.java` file.
4. Enter the required information when prompted:
   - Name
   - Age
   - Course
5. Start sending messages. Type `exit` to disconnect.

## 📂 Files Included

- `Client.java` - The main class that connects to the server and interacts through input/output streams.

## ✅ Features

- Connects to the server using sockets.
- Sends student details and messages.
- Displays messages received from the server.
- Graceful disconnection using the `"exit"` command.

## 💡 Notes

- If the server is not running, the client will show a `Connection refused` error.
- Use `localhost` if the client and server are on the same machine.
