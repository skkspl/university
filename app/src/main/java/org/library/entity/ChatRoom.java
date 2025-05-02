package org.library.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class ChatRoom {
    @Id
    private Long id;
    private int bookId;
    private String name;
    private String description;
    private int creatorId;
}
