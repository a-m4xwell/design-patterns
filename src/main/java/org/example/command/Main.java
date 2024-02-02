package org.example.command;

public class Main {
    /*The command patter is used to decouple the invoker of an operation from the object that performs the operation,
    * often referred to as the receiver, this is useful for several scenarios. It could be the invoker has no
    * knowledge of or cannot know which object will receive the request, for example in situations where a UI toolkit
    * has to issue a command to the application but the designer of the UI kit doesn't know what applications it will
    * be used in. It's also useful in systems that use transactions or should support undoable operations, these can be
    * compiled into lists of commands and the list can be traversed to execute and un-execute commands
    *
    * In this scenario I will implement the command pattern by building an interface for a database. The interface will
    * allow user to perform actions like creating, reading, updating and deleting objects. The UI objects will be
    * decoupled from the receiver which performs the operations on the database and I will attempt to make the relevant
    * operations undoable, allowing the user to undo operations */
}
