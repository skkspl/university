package org.library.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class User {
    @Id
    private Long id;
    private Long roleId;
    private String username;
    private String email;
    private String password;
    private String aboutMe;
}
