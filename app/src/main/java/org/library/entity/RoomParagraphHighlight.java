package org.library.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomParagraphHighlight {
    private int roomId;
    private int paragraphId;
    private int userId;
    private String color;
}
