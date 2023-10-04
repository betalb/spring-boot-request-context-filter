package com.example.springactuatorfilter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnMissingBean(TestFilter.class)
    TestFilter testFilter() {
        return new TestFilter();
    }

}
