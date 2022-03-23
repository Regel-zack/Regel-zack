package com.libra;

import dao.BookDao;
import dao.woker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LibraSpringbootApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void TestSelectList(){
        List<woker> list = bookDao.selectList(null);
        list.forEach(System.out::println);
    }

}
