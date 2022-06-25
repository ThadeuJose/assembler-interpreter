package com.example.Command.ValidCommands;

import com.example.Function;
import com.example.Memory;

public class CommandMov implements Command {

    @Override
    public boolean isCommand(String opCode) {
        return opCode.equalsIgnoreCase("mov");
    }

    @Override
    public void execute(Memory memory, Function function) {
        String key = function.getParameter(0);
        String functionParameter = function.getParameter(1);
        int value;
        if (isAnotherRegistry(functionParameter)) {
            value = memory.getRegisterValue(functionParameter);
        } else {
            value = Integer.parseInt(functionParameter);
        }
        memory.setRegister(key, value);
    }

    private boolean isAnotherRegistry(String functionParameter) {
        return Character.isLetter(functionParameter.charAt(0));
    }

}
