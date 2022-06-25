package com.example.Command.ValidCommands;

import com.example.Function;
import com.example.Memory;

public class CommandJnz implements Command {

    @Override
    public boolean isCommand(String opCode) {
        return opCode.equalsIgnoreCase("jnz");
    }

    @Override
    public void execute(Memory memory, Function function) {
        int value = 0;
        if (memory.isValidRegister(function.getParameter(0)))
            value = Integer.parseInt(function.getParameter(0));
        else
            value = memory.getRegisterValue(function.getParameter(0));

        int offset = Integer.parseInt(function.getParameter(1));
        if (shouldJump(value)) {
            memory.shiftPointer(offset - 1);
        }
    }

    private boolean shouldJump(int value) {
        return value != 0;
    }

}
