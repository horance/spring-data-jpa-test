package demo;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.OpenJpaVendorAdapter;

@Configuration
@ConditionalOnProperty(havingValue = "openjpa", name = "vendor")
public class TestDataJPAConfig {
    @Bean
    public JpaVendorAdapter jpaVendorAdapter(JpaProperties properties, DataSource dataSource) {
        OpenJpaVendorAdapter adapter = new OpenJpaVendorAdapter();
        adapter.setShowSql(properties.isShowSql());
        adapter.setDatabase(properties.determineDatabase(dataSource));
        adapter.setDatabasePlatform(properties.getDatabasePlatform());
        adapter.setGenerateDdl(properties.isGenerateDdl());
        return adapter;
    }

}
