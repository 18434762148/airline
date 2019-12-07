package com.uek.airline.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

//配置类可有可无
@Configuration
public class DBConfig {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.driverClassName}")
    private String driver;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
//  手动配置Druid代替HikariDataSource
    @Bean("druidDataSource")
    public DataSource createDataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
//  利用指定数据源配置JdbcTemplate
    @Bean
    public JdbcTemplate createJdbcTemplate(@Qualifier("druidDataSource") DataSource ds) {
        return new JdbcTemplate(ds);
    }
}
