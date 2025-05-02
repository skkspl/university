package org.library.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Paragraph {
    @Id
    private Long id;
    private Integer bookId;
    private Integer paragraphNumber;
    private String text;
}
