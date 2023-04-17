package com.example.myproject.webapp;
import com.example.myproject.webapp.Service.WebAppService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {WebAppService.class})
public class WebAppUnitTest {

    @Autowired
    private WebAppService service;

    @Test
    public void testGetMessage_shouldReturnExpectedString(){
        String message= service.getMessage();
        System.out.println(message);
        assertEquals("Hello, world!",message);
    }
}
