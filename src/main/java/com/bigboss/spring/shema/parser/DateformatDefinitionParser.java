package com.bigboss.spring.shema.parser;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

import java.text.SimpleDateFormat;

/**
 * @author Big Boss
 * @version 1.0
 * @description 自定义标签解析器
 * @Date 2019/12/19 17:06
 */
public class DateformatDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return SimpleDateFormat.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String pattern = element.getAttribute("pattern");
        builder.addConstructorArgValue(pattern);
    }
}
