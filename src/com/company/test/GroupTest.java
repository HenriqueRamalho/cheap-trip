package com.company.test;

import com.company.entities.Group;
import com.company.entities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GroupTest {

    @Test
    public void shouldCreateAnProfileUsingAnUser() {
        User user = new User();
        user.createDataUser(99, "João", "123456");

        Group group = new Group();
        group.createGroup(user, 10);

        assertEquals(10, group.getDestinoId());
    }

    @Test
    public void shouldCreateAnGroupWithDataPassed() {
        User user = new User();
        user.createDataUser(99, "João", "123456");

        Group group = new Group();
        group.createGroup(user, 10);

        group.title = "Foo group";
        group.dataInicio = new java.util.Date("01/01/2022");
        group.dataFinal = new java.util.Date("25/12/2021");
        group.valorGrupo = 9.99;


        assertEquals("Foo group", group.title);
        assertEquals(new java.util.Date("01/01/2022"), group.dataInicio);
        assertEquals(new java.util.Date("25/12/2021"), group.dataFinal);
    }
}
