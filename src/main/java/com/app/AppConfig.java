package com.app;

import com.beans.IBeanFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Itai Peleg
 * @since 23/06/2015.
 */
@Configuration
public class AppConfig {
    @Bean
    public IBeanFactoryBean getIBeanFactoryBean() {
        return new IBeanFactoryBean();
    }

}
