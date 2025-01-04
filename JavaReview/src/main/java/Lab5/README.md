<h1>Lab5</h1>

<h2>Input/Output Streams. Files.</h2>
Write an application that can manage the personal documents for the employees of a company.
All the data is stored in a master directory, in the local file system. In the master directory, for each person there is a sub-directory named in such a way to uniquely identify the employee.
In a person's directory there are the specific personal files, in various formats: images, PDFs, etc.
Each employee has a name and a unique ID.

The main specifications of the application are:


Create an object-oriented model of the problem. Use records in order to implement Person and Document classes. Create a class responsible with external operations regarding the repository of documents.
Implement the following:
create an object that represents the repository stored in a specific master directory;
display the content of the repository (without the content of the files);


Create a shell that allows reading commands from the keyboard, together with their arguments.
Represent the commands using classes instead of methods. Use an interface or an abstract class in order to describe a generic command.
Implement the following commands:
view: opens a document using the native operating system application (see the Desktop class);
report: creates (and opens) an HTML report representing the content of the repository.
Use a template engine such as FreeMarker or Velocity, in order to create the HTML report.
export: exports the repository to an external file using JSON format; you may use Jackson or other library;
The application will signal invalid data or the commands that are not valid using custom exceptions.
The final form of the application will be an executable JAR archive. Identify the generated archive and launch the application from the console, using the JAR.