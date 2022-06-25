package com.example;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SolutionTests {
    @Test
    public void moveTest() {
        String[] program = new String[] { "mov a 5" };
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 5);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

    @Test
    public void moveTest2() {
        String[] program = new String[] { "mov a 6" };
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 6);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

    @Test
    public void simple_program_1() {
        String[] program = new String[] { "mov a 6", "inc a" };
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 7);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

    @Test
    public void simple_program_2() {
        String[] program = new String[] { "mov a 6", "dec a" };
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 5);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

    @Test
    public void simple_program_3() {
        String[] program = new String[] { "mov a 6", "mov b 5", "dec a" };
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 5);
        out.put("b", 5);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

    @Test
    public void jump_test() {
        String[] program = new String[] { "mov a 5", "dec a", "jnz a -1" };
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 0);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

    @Test
    public void test_simple_1() {
        String[] program = new String[] { "mov a 5", "inc a", "dec a", "dec a", "jnz a -1", "inc a" };
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 1);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

    @Test
    public void simple_2() {
        String[] program = new String[] { "mov a -10", "mov b a", "inc a", "dec b", "jnz a -2" };
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 0);
        out.put("b", -20);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

}
