package com.example.Command.ValidCommands;

import com.example.Function;
import com.example.Memory;

public interface Command {
    public boolean isCommand(String opCode);

    public void execute(Memory memory, Function function);

}
