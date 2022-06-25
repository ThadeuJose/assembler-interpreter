package com.example;

import java.util.Map;

import com.example.Command.Invoker;

public class SimpleAssembler {
    public static Map<String, Integer> interpret(String[] program) {
        Memory memory = new Memory();
        while (memory.getPointer() < program.length) {
            String line = program[memory.getPointer()];
            Function function = new Function(line);
            Invoker invoker = new Invoker();
            invoker.execute(memory, function);
            memory.advancePointer();
        }

        return memory.getRegister();
    }

}
