package com.wangboran.logbackdemo.custom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 类描述
 *
 * @author WangBoran
 * @since 2020/10/13 17:08
 */
@EnableScheduling
@Component
public class CustomLogClass {

	private final Logger logger = LoggerFactory.getLogger(CustomLogClass.class);

	@Scheduled(fixedRate=5000)
	private void configureTasks() {
		logger.info("执行静态定时任务时间: " + LocalDateTime.now());
	}
}