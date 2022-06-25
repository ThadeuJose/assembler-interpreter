package com.example.Command.ValidCommands;

import com.example.Function;
import com.example.Memory;

public class CommandDec implements Command {

    @Override
    public boolean isCommand(String opCode) {
        return opCode.equalsIgnoreCase("dec");
    }

    @Override
    public void execute(Memory memory, Function function) {
        String key = function.getParameter(0);
        memory.setRegister(key, memory.getRegisterValue(key) - 1);
    }

}
