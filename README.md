# SpringBoot-Redis
springboot整合SSM和Redis集群，并且实现redis和session的数据共享

版本：springboot：2.16 ，  jdk：1.8 ， redis：3.2.100
redis集群：127.0.0.1:6380 127.0.0.1:6381 127.0.0.1:6382 127.0.0.1:6383 127.0.0.1:6384 127.0.0.1:6385
主从复制，一主一从
```
 
├─.mvn
│  └─wrapper
│          maven-wrapper.jar
│          maven-wrapper.properties
│          MavenWrapperDownloader.java
│          
│      
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─ssm
│  │  │          │  SpringBootRedisApplication.java  //启动类
│  │  │          │  
│  │  │          ├─controller
│  │  │          │      UserController.java        //controller，里面实现了session和redis共享
│  │  │          │      
│  │  │          ├─mapper
│  │  │          │      UserMapper.java		//Mybatis接口
│  │  │          │      
│  │  │          ├─pojo
│  │  │          │      User.java	          //bean
│  │  │          │      
│  │  │          ├─redis			
│  │  │          │  │  UserRedis.java	   //redis接口	
│  │  │          │  │  
│  │  │          │  └─impl
│  │  │          │          UserRedisImpl.java	//redis实现类	
│  │  │          │          
│  │  │          └─service
│  │  │              │  UserService.java 		//service接口	
│  │  │              │  
│  │  │              └─impl
│  │  │                      UserServiceImpl.java   //service实现类，里面调用了redis接口和Mybatis
│  │  │                      
│  │  ├─resources
│  │  │  │  application.yml				//全局配置文件
│  │  │  │  
│  │  │  ├─mapper
│  │  │  │      UserMapper.xml			//mybatis中的SQL语句
│  │  │  │      
│  │  │  ├─static
│  │  │  └─templates
│  │  └─webapp
│  │      └─WEB-INF
│  │          └─jsp
│  │                  index.jsp			//测试返回页面

```
