package com.example;

import java.util.List;

public interface Predator {
    //Вношу изменения, а то не коммитится
    List<String> eatMeat() throws Exception;

}
