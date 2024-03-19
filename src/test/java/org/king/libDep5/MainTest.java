package org.king.libdep5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("lib-dep-5");
        assertEquals("greet from libdep5, lib-dep-5", result);
    }
    @Test
    void testGreet1() {
        Library library = new Library();
        String result = library.greet1("lib-dep-5");
        assertEquals("greet1 from libdep5, lib-dep-5", result);
    }
    @Test
    void testGreet2() {
        Library library = new Library();
        String result = library.greet2("lib-dep-5");
        assertEquals("greet2 from libdep5, lib-dep-5", result);
    }
}
