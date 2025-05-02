package org.library.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Note {
    @Id
    private Long id;
    private Integer paragraphId;
    private Integer userId;
    private String text;
    private String creationDate;
}
