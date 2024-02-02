package org.example.command.ui;

public interface ReversibleCommand {

    void execute();
    void unexecute();
}
