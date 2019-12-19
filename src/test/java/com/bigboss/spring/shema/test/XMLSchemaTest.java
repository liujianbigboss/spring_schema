package com.bigboss.spring.shema.test;

import com.bigboss.spring.shema.ApplicationRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jerry
 * @version 1.0
 * @description 单元测试
 * @Date 2019/12/19 17:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationRunner.class)
public class XMLSchemaTest {

    @Autowired
    private SimpleDateFormat myDateformat;

    @Test
    public void propertyTest() {
        Assert.assertNotNull(myDateformat);
        String date = "2019-12-19 17:12:14";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date time = simpleDateFormat.parse(date);
            String dateFormatStr = myDateformat.format(time);
            System.out.println(dateFormatStr);
        } catch (ParseException e) {

        }
    }

}
