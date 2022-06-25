package com.example;

import java.util.HashMap;
import java.util.Map;

public class Memory {
    private Map<String, Integer> register;
    private int pointer;

    public Memory() {
        register = new HashMap<String, Integer>();
        pointer = 0;
    }

    public boolean isValidRegister(String param) {
        return Character.isDigit(param.charAt(0));
    }

    public Map<String, Integer> getRegister() {
        return new HashMap<>(register);
    }

    public int getRegisterValue(String key) {
        return register.get(key).intValue();
    }

    public void setRegister(String key, int value) {
        register.put(key, Integer.valueOf(value));
    }

    public int getPointer() {
        return pointer;
    }

    public void shiftPointer(int value) {
        this.pointer += value;
    }

    public void advancePointer() {
        this.pointer += 1;
    }

}
