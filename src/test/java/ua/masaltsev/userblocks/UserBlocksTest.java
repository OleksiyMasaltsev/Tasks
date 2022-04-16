package ua.masaltsev.userblocks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ua.masaltsev.userblocks.UserBlocksTask.*;

class UserBlocksTest {

    private UserBlocksTask task;

    @BeforeEach
    void setUp() {
        task = new UserBlocksTask();
    }

    @Test
    void testWithCorrectBlock() {
        String block = "Jack jack@yahoo.com\n" +
                "fred25@gmail.com Fred Queenbie\n" +
                "oksi_23@ukr.net Ieromenko Oksi\n" +
                "Oleksiy Olegovitch Masaltsev a.o.masaltsev@gmail.com";

        List<User> resultList = task.extractUsersFrom(block);

        assertEquals("Jack jack@yahoo.com", resultList.get(0).getName()
                + " " + resultList.get(0).getEmail());
        assertEquals("Fred Queenbie fred25@gmail.com", resultList.get(1).getName()
                + " " + resultList.get(1).getEmail());
        assertEquals("Ieromenko Oksi oksi_23@ukr.net", resultList.get(2).getName()
                + " " + resultList.get(2).getEmail());
        assertEquals("Oleksiy Olegovitch Masaltsev a.o.masaltsev@gmail.com", resultList.get(3).getName()
                + " " + resultList.get(3).getEmail());
    }

    @Test
    void testEmptyNameIsNotAllowed() {
        String block = "jack@yahoo.com\n" +
                "fred25@gmail.com Fred Queenbie\n" +
                "oksi_23@ukr.net Ieromenko Oksi\n" +
                "Oleksiy Olegovitch Masaltsev a.o.masaltsev@gmail.com";

        WrongInputException wrongInputException = assertThrows(WrongInputException.class, () -> task.extractUsersFrom(block));
        assertEquals(NOT_ENOUGH_INFO_IN_LINE + 1, wrongInputException.getMessage());
    }

    @Test
    void testEmptyNameThanTwoValidEmails() {
        String block = "jack@yahoo.com\n" +
                "fred25@gmail.com Fred Queenbie\n" +
                "oksi_23@ukr.net oksi_23@ukr.net\n" +
                "Oleksiy Olegovitch Masaltsev a.o.masaltsev@gmail.com";

        WrongInputException wrongInputException = assertThrows(WrongInputException.class, () -> task.extractUsersFrom(block));
        assertEquals(NOT_ENOUGH_INFO_IN_LINE + 1, wrongInputException.getMessage());
    }

    @Test
    void testTwoValidEmails() {
        String block = "Jack jack@yahoo.com\n" +
                "fred25@gmail.com fred25@gmail.com\n" +
                "oksi_23@ukr.net Ieromenko Oksi\n" +
                "Oleksiy Olegovitch Masaltsev a.o.masaltsev@gmail.com";

        WrongInputException wrongInputException = assertThrows(WrongInputException.class, () -> task.extractUsersFrom(block));
        assertEquals(TWO_VALID_EMAILS_IN_LINE + 2, wrongInputException.getMessage());
    }

    @Test
    void testNoValidEmail() {
        String block = "Jack jack@yahoo.com\n" +
                "fred25@gmail.com Fred Queenbie\n" +
                "oksi_23@ukr.net Ieromenko Oksi\n" +
                "Oleksiy Olegovitch Masaltsev";

        WrongInputException wrongInputException = assertThrows(WrongInputException.class, () -> task.extractUsersFrom(block));
        assertEquals(VALID_EMAIL_NOT_FOUND_IN_LINE + 4, wrongInputException.getMessage());
    }

    @Test
    void testEqualEmails() {
        String block = "Jack jack@yahoo.com\n" +
                "oksi_23@ukr.net Ieromenko Oksi\n" +
                "oksi_23@ukr.net Ieromenko Oksi\n" +
                "Oleksiy Olegovitch Masaltsev a.o.masaltsev@gmail.com";

        List<User> resultList = task.extractUsersFrom(block);

        assertEquals("Jack jack@yahoo.com", resultList.get(0).getName()
                + " " + resultList.get(0).getEmail());
        assertEquals("Ieromenko Oksi oksi_23@ukr.net", resultList.get(2).getName()
                + " " + resultList.get(2).getEmail());
        assertEquals("Oleksiy Olegovitch Masaltsev a.o.masaltsev@gmail.com", resultList.get(3).getName()
                + " " + resultList.get(3).getEmail());
    }
}














