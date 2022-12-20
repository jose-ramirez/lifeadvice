package org.josers.localstackdemo.messages;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForwardLifeAdviceMessage {
    private String from;

    private String to;

    private String message;
}
