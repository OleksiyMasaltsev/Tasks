package ua.masaltsev.userblocks;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Builder
@Data
//@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String email;
}
