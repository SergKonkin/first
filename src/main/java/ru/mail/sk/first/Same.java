package ru.mail.sk.first;

import lombok.Getter;
import lombok.Setter;

public class Same {

    @Getter
    @Setter
    private Long id;

    public Same(Long id) {
        this.id = id;
    }

}
