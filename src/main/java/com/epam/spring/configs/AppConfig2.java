package com.epam.spring.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfig1.class})
public class AppConfig2 {
}
