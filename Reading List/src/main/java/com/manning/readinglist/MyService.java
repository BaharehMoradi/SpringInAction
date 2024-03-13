package com.manning.readinglist;

import org.springframework.context.annotation.Conditional;


@Conditional(JdbcTemplateCondition.class)
//the MyService bean will only be created if the JdbcTemplateCondition passes. Otherwise, the bean declaration will be ignored.
public class MyService {
}
