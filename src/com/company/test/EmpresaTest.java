package com.company.test;

import com.company.entities.Empresa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmpresaTest {

    @Test
    public void shouldCreateAnEmpresa() {
        Empresa empresa = new Empresa();
        empresa.createEmpresa("Foo", "Foo Empresa LTDA", "79.463.756/0001-27", 123);

        assertEquals("Foo", empresa.getNomeFantasia());
        assertEquals("Foo Empresa LTDA", empresa.getRazaoSocial());
        assertEquals("79.463.756/0001-27", empresa.getCnpj());
        assertEquals(123, empresa.getEmpresaId());
    }


}
