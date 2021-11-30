package com.company.test;

import com.company.entities.Profile;
import com.company.entities.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProfileTest {

    @Test
    public void shouldCreateAnProfileUsingAnUser() {
        User user = new User();
        user.createDataUser(99, "João", "123456");
        Profile profile = new Profile(user);

        assertEquals(99, profile.getUser().getUserId());
        assertEquals("João", profile.getUser().getNome());
        assertEquals("123456", profile.getUser().getPassword());
    }
}
