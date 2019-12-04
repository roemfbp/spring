package roem.springframework.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import roem.springframework.didemo.examplebeans.FakeDataSource;
import roem.springframework.didemo.examplebeans.FakeJmsBroker;

/**
 * Created by roem on  04/12/19
 */
@Configuration

public class PropertyConfig {



    @Value("${roem.username}")
    String user;
    @Value("${roem.password}")
    String password;
    @Value("${roem.dburl}")
    String url;

    @Value("${roem.jms.username}")
    String jmsUsername;

    @Value("${roem.jms.password}")
    String jmsPassword;

    @Value("${roem.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){

        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){

        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(password);
        fakeJmsBroker.setUrl(url);
        return fakeJmsBroker;
    }

    
}
