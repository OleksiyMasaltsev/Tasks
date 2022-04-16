package ua.masaltsev.userblocks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private String name;
    private String email;
}
