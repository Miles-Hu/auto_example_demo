package com.freeperch.auto.example.config;


import com.github.z.auto.example.enums.BaseEnumHandler;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.scripting.LanguageDriver;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;

import javax.sql.DataSource;
import java.util.List;

/**
 *
 * @author hujun
 * @date 2018/12/29
 */
@Configuration
public class MyBatisConfig extends MybatisAutoConfiguration {


    public MyBatisConfig(MybatisProperties properties, ObjectProvider<Interceptor[]> interceptorsProvider, ObjectProvider<TypeHandler[]> typeHandlersProvider, ObjectProvider<LanguageDriver[]> languageDriversProvider, ResourceLoader resourceLoader, ObjectProvider<DatabaseIdProvider> databaseIdProvider, ObjectProvider<List<ConfigurationCustomizer>> configurationCustomizersProvider) {
        super(properties, interceptorsProvider, typeHandlersProvider, languageDriversProvider, resourceLoader, databaseIdProvider, configurationCustomizersProvider);
    }

    /**
     * 将CodeEnumHandler注册为枚举类型的默认TypeHandler
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean
    @Override
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{

        SqlSessionFactory factory = super.sqlSessionFactory(dataSource);
        //设置默认Enum类型的handler
        factory.getConfiguration().getTypeHandlerRegistry().setDefaultEnumTypeHandler(BaseEnumHandler.class);
        //factory.getConfiguration().addInterceptor(new AutoExampleInterceptor());
        return factory;
    }
}
