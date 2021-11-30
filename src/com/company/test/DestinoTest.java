package com.company.test;

import com.company.entities.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DestinoTest {
    private static final double DELTA = 1e-15;

    @Test
    public void shouldCreateDestino() {
        Destino destino = new Destino("Foo", "Bar", 123, 199.99);

        assertEquals("Foo", destino.getNome());
        assertEquals("Bar", destino.getCuriosidade());
        assertEquals(123, destino.getDestinoId());
        assertEquals(199.99, destino.getValorDestino(), DELTA);
    }
}
