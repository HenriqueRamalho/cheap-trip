package com.company.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.company.entities.*;

public class AgenteTest {
    @Test
    public void shouldCreateDestino() {
        AgenteViagem agenteViagem = new AgenteViagem("Foo Company");

        assertEquals("Foo Company", agenteViagem.getEmpresa());
    }

}
