package learner.venky.jokesapp.configuration;

import learner.venky.jokesapp.infrastructure.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class DataSourceConfiguration {

    @Value("${learner.venky.dburl}")
    String dburl;

    @Value("${learner.venky.dbusername}")
    String dbusername;

    @Value("${learner.venky.dbpassword}")
    String dbpassword;

    @Bean
    public static PropertySourcesPlaceholderConfigurer getProperties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

    @Bean
    public DataSource getDataSource(){
        DataSource dataSource = new DataSource();
        dataSource.setDbUrl(dburl);
        dataSource.setDbUserName(dbusername);
        dataSource.setDbPassword(dbpassword);
        System.out.println("From the DataSourceConfigration.....class");
        System.out.println("Datasource...done...."+dataSource.toString());
        return dataSource;
    }
}
