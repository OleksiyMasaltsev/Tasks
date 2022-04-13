package ua.masaltsev.userblocks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class UserBlocksTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void extractUsersFrom() {
        String input =  "John Dow john@gmail.com\n" +
                        "masaltsev@ukr.net Oleksa\n" +
                        "masaltsev@ukr.net Stepan\n" +
                        "Oksi Star xu@gmail.com";
//        assertThrows(WrongInputException.class, UserBlocksTask.extractUsersFrom(input));

//        try {
//            List<User> resultList = UserBlocksTask.extractUsersFrom(input);
//            for (User user : resultList) {
//                System.out.println("username: " + user.getName() + ", email: " + user.getEmail());
//            }
//        } catch (WrongInputException ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}