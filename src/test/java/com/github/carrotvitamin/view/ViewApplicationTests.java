package com.github.carrotvitamin.view;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ViewApplicationTests {

    @Test
    void contextLoads() {
//        String s = "/a/{name}/{id}";
        String s = "/a/b/c";
        System.out.println(s.replaceAll("\\{[^}]*\\}","*"));
    }

}
