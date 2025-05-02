package org.library.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatRoomParticipant {
    private Integer roomId;
    private Integer userId;
    private String joinDate;
}
