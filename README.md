# notes
# Candidate name: Sanctus Matthew S. Espiritu

This is the answer for the coding challenge on Notes Maintenance using Spring-Boot. Kindly clone to download the files on local machine from Git or GitHub.

To run this app, please use eclipse or Intelli-J, then build the pom.xml, and run the application through Run command on NotesApplication.java (notes/src/main/com.example.notes/NotesApplication.java)

This application meets the core or basic requirements such as adding a note, editing a note, deleting a note, and finding a note by id or finding all notes.

Please test this through Postman, please refer to the following youtube video and watch how to test this app. 

YT Link: https://youtu.be/wk3PbUXVX_M

This app uses the H2 Database from Maven and Crud Repository from Springboot Data and JPA, with Jakarta Validator which the built-in Tomcat from Springboot is accessing on port:8082 (please refer to application.properties), all these are from Maven Dependencies.

The Structure of this Notes Maintenance App is a Springboot Structure which mainly consists of:

Entity - The Data Model of a Note (the fields or properties of a Note are: auto-generate id, title and body)
Repository - a NoteRepository which imports or utilizes the Maven Spring Data CrudRepository to allow saving, retrieving, deleting and updating data. This also has the access to the built-in H2 database.
Service - This interface and class implementation validates the data using Jakarta Validator, before applying a database transaction such as saving, deleting et. al. and calls the Repository of Notes.
Controller - This class defines which Method and the URL in order to call the Service classes for each Rest Service such as PostMapping (Saving a Note), GetMapping (Finding a NOte), et.al
