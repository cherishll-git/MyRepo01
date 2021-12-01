package com.lyq.datasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = OrclDataSourceConfig.PACKAGE,
	sqlSessionFactoryRef = "orclSqlSessionFactory")
public class OrclDataSourceConfig {

	// oracledao扫描路径
	static final String PACKAGE = "com.lyq.orcldao"; 
	// mybatis mapper扫描路径
	static final String MAPPER_LOCATION = "classpath:mapper/orcl/*.xml";

	@Bean(name = "orcldatasource")
	@ConfigurationProperties("spring.datasource.druid.oracle")
    public DataSource orclDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

	@Bean(name = "orclTransactionManager")
    public DataSourceTransactionManager oracleTransactionManager() {
        return new DataSourceTransactionManager(orclDataSource());
    }

    @Bean(name = "orclSqlSessionFactory")
    public SqlSessionFactory oracleSqlSessionFactory(@Qualifier("orcldatasource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        //如果不使用xml的方式配置mapper，则可以省去下面这行mapper location的配置。
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(OrclDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
