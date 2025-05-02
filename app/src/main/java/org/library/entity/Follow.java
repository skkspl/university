package org.library.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Follow {
    private Integer followerId;
    private Integer followedId;
}
