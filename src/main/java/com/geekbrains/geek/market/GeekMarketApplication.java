package com.geekbrains.geek.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class GeekMarketApplication {
	// Домашнее задание:
	// 1. В панели пагинации должны быть видны только 2 страницы слева от текущей, и две страницы справа от текущей
	// + вперед, назад кнопки;
	// 2. Добавить страницу для редактирования товаров, переход на которую должен
	// осуществляться из таблицы с товарами;

	public static void main(String[] args) {
		SpringApplication.run(GeekMarketApplication.class, args);
	}
}
