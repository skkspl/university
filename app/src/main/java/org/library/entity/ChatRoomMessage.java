package org.library.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class ChatRoomMessage {
    @Id
    private Long id;
    private Integer roomId;
    private Integer userId;
    private String message;
    private String sendTime;
}
