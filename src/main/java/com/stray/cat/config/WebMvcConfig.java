package com.stray.cat.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.MultipartConfigElement;
import java.util.Locale;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Autowired
	private LoginInterceptor loginAuthenticator;

	/**
	 * 注册拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginAuthenticator)
				.addPathPatterns("/enclosure/**")
				.addPathPatterns("/revelation/interceptor/**")
		        .addPathPatterns("/details/interceptor/**")
				.addPathPatterns("/share/interceptor/**")
				.addPathPatterns("/sponsor/interceptor/**")
				.addPathPatterns("/person/interceptor/**")
				.addPathPatterns("/admin/**");

	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	}

	/**
	 * 释放静态资源
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		// 通过addResourceHandler添加资源映射路径，然后通过addResourceLocations来指定路径。可以访问自定义upload文件夹
		registry.addResourceHandler("/upload/**").addResourceLocations("classpath:/upload/")
				.addResourceLocations("file:///" + System.getProperties().getProperty("user.home") + "/cat/upload/");
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}

	/**
	 * 文件上传配置
	 * 
	 * @return
	 */
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		// 单个文件最大 KB,MB
		factory.setMaxFileSize(DataSize.parse("10240KB"));
		/// 设置总上传数据总大小
		factory.setMaxRequestSize(DataSize.parse("102400KB"));
		return factory.createMultipartConfig();
	}


	//注入 Bean，会话区域解析器只针对当前会话有效
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		//设置默认区域,
		slr.setDefaultLocale(Locale.CHINA);
		return slr;
	}
}
