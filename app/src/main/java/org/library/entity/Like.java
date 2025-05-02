package org.library.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Like {
    @Id
    private Long id;
    private Integer postId;
    private Integer userId;
    private String createdAt;
}
