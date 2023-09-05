package br.com.gabriel.restwithspringbootandjava;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Greeting {

    private final long id;
    private final String content;

}
