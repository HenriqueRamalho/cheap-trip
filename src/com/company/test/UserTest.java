package com.company.test;

import com.company.entities.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class UserTest {

    @Test
    public void shouldGetUserId() {
        User user = new User();
        user.createDataUser(99, "João", "123456");

        assertEquals(99, user.getUserId());
    }

    @Test
    public void shouldCreateAnUser() {
        User user = new User();
        user.createDataUser(99, "João", "123456");

        assertEquals(99, user.getUserId());
        assertEquals("João", user.getNome());
    }

    @Test
    public void shouldUpdateAnUser() {
        User user = new User();
        user.createDataUser(99, "João", "123456");
        user.updateDataUser("José", "abc");


        assertEquals("José", user.getNome());
        assertEquals("abc", user.getPassword());
    }

    @Test
    public void shouldDeleteDataOfAnUser() throws Exception {
        User user = new User();
        user.createDataUser(99, "João", "123456");
        user.deleteDataUser(99);

        assertEquals("", user.getNome());
        assertEquals("", user.getPassword());
    }

}
