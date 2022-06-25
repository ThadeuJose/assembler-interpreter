package com.example.Command;

import com.example.Function;
import com.example.Memory;
import com.example.Command.ValidCommands.Command;
import com.example.Command.ValidCommands.CommandDec;
import com.example.Command.ValidCommands.CommandInc;
import com.example.Command.ValidCommands.CommandJnz;
import com.example.Command.ValidCommands.CommandMov;

public class Invoker {
    Command[] commands;

    public Invoker() {
        commands = new Command[] { new CommandDec(), new CommandInc(), new CommandMov(), new CommandJnz() };
    }

    public void execute(Memory memory, Function function) {
        for (Command command : commands) {
            if (command.isCommand(function.getOpCode())) {
                command.execute(memory, function);
            }
        }
    }
}
