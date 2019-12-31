## SpringBoot学习路线

### 说明
    @version:1.5.3.RELEASE
    @data: 2019年12月30日21:04:18
### 1.SpringBoot 入门-hello word

### 2.SpringBoot 入门-config 配置文件详解
    
##### 1.注入data说明  

    (1). 自定义属性,使用@vaule直接注入  
    (2). 将配置文件的属性赋值给实体类,使用@ConfigurationProperties(prefix = "...") 直接注入整个bean  
    (3). 自定义配置文件,使用外部文件注入@ConfigurationProperties(prefix = "item3")@PropertySource("classpath:item3.properties")引入外部文件的注入

##### 2.多个环境配置文件
    
      (1). 开发说明: 格式为application-{profile}.properties 在applicaton.properties 中使用 spring.profiles.active=prefile,
      表明当使用的是什么环境的配置文件
      (2). 打包说明 mvn package -P dev 打包成dev环境下的jar包
      (3). 文件优先级说明: 
          控制台: java -jar --server.port=8086
          file:./config/ (当前项目路径config目录下);
          file:./ (当前项目路径下);
          classpath:/config/ (类路径config目录下);
          classpath:/ (类路径config下)
          结论:同目录下.properties优先级高于.yml;优先级由高到底,高优先级的配置会覆盖低优先级的配置;
          
##### 3.SpringBoot启动banner

> 说明

    1. 在resources下添加banner.tet 即可
    2. 在application.properties中指定banner的路径 banner.location=classpath:CustomizeBanner.txt 
    
### 2.SpringBoot 入门-jdbcTemplate

> 说明    
    
    使用Springboot 集成 jdbcTemplate 实现简单的增删改查 并使用注解事务保证数据提交与回滚
         