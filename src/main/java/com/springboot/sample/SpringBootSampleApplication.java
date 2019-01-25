package com.springboot.sample;

import com.springboot.sample.entity.MgrParamScope;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


/**
 * 现在可以直接运行 SpringBootSampleApplication的main方法，和执行普通java程序一样
 * 然后可以看到spring-boot 内置server容器（默认为Tomcat），这一切spring-boot 都帮我们做好了。
 * Started SpringBootSampleApplication in 4.895 seconds (JVM running for 5.532)
 * 
 * @author huang.yj
 * @date 2018.12.06
 *
 */
@SpringBootApplication
@EnableConfigurationProperties //作用：开启 @ConfigurationProperties注解
public class SpringBootSampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootSampleApplication.class, args);
		MgrParamScope ac = (MgrParamScope)context.getBean("mgrParamScope");
	    System.out.println(ac);
	}

}


