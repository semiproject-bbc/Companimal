//package com.companimal.report.config;
//
//import com.companimal.report.model.dao.ReportMapper;
//import com.zaxxer.hikari.HikariDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//@Configuration
//public class DBConfiguration {
//
////    @Autowired
////    private ApplicationContext applicationContext;
//
//    @Value("${spring.datasource.driver-class-name}")
//    private String driverClassName;
//
//    @Value("${spring.datasource.jdbc-url}")
//    private String jdbcUrl;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    @Bean(destroyMethod = "close")
//    public HikariDataSource dataSource() {
//        HikariDataSource dataSource = new HikariDataSource();
//
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setJdbcUrl(jdbcUrl);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//
//        return dataSource;
//    }
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
//        configuration.addMapper(ReportMapper.class);
//
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource());
//        factoryBean.setConfiguration(configuration);
//        //factoryBean.setMapperLocations(applicationContext.getResources("classpath:/mappers/**/*Mapper.xml"));
//
//        return factoryBean.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
//        return new SqlSessionTemplate(sqlSessionFactory());
//    }
//
////    @Bean
////    @ConfigurationProperties(prefix = "mybatis.configuration")
////    public org.apache.ibatis.session.Configuration configuration() {
////        return new org.apache.ibatis.session.Configuration();
////    }
//}
