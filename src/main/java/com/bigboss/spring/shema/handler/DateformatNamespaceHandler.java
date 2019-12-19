package com.bigboss.spring.shema.handler;

import com.bigboss.spring.shema.parser.DateformatDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author Big Boss
 * @version 1.0
 * @description 自定义shema处理器
 * @Date 2019/12/19 17:03
 */
public class DateformatNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("dateformat", new DateformatDefinitionParser());
    }

}
