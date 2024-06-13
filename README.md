Проект "Веб-сайт для публикаций"

Этот проект представляет собой простое веб-приложение, созданное с использованием Spring Boot. Оно позволяет пользователям создавать, просматривать, обновлять и удалять блоговые записи.

Особенности

Просмотр блоговых записей: Пользователи могут просматривать все существующие блоговые записи на главной странице блога.
Добавление новой записи: Пользователи могут добавлять новые блоговые записи, заполнив форму.
Просмотр деталей записи: По нажатию на заголовок записи отображаются её детали.
Редактирование записи: Пользователи могут изменять существующие записи.
Удаление записи: Записи можно удалять из системы.
Используемые технологии

Java
Spring Boot
Thymeleaf (для серверного шаблонизатора)
Lombok (для сокращения шаблонного кода)
MySQL (или другая база данных по вашему выбору)
Установка

Для запуска этого проекта локально убедитесь, что у вас установлены Java и Maven. Вам также потребуется база данных MySQL (или настройте предпочтительную базу данных в application.properties).

Склонируйте репозиторий:

bash
Копировать код
git clone https://github.com/yourusername/post-website.git
Перейдите в каталог проекта:

bash
Копировать код
cd post-website
Соберите проект с помощью Maven:

bash
Копировать код
mvn clean install
Запустите приложение:

bash
Копировать код
mvn spring-boot:run
Откройте веб-браузер и перейдите по адресу http://localhost:8080.

Использование

Перейдите на http://localhost:8080, чтобы просмотреть домашнюю страницу со всеми блоговыми записями.
Нажмите на заголовок записи, чтобы просмотреть её детали.
Для добавления новой записи перейдите на страницу http://localhost:8080/blog/add.
Для редактирования записи нажмите кнопку "Редактировать" рядом с заголовком записи на странице её деталей.
Для удаления записи нажмите кнопку "Удалить" на странице деталей записи.
Вклад

Мы приветствуем ваши вклады! Пожалуйста, создайте форк репозитория и отправьте pull request с вашими изменениями.

Лицензия

Этот проект лицензирован по лицензии MIT - см. файл LICENSE для получения дополнительной информации.

Зависимости

Для разработки этого проекта используются следующие зависимости:

Spring Boot Starter Web: Основные зависимости для создания веб-приложений с Spring Boot.
Spring Boot Starter Thymeleaf: Для использования Thymeleaf в качестве шаблонизатора.
Spring Boot Starter Data JPA: Для работы с JPA и Spring Data.
MySQL Connector: Драйвер MySQL для подключения к базе данных MySQL.
Hibernate Validator: Для валидации данных.
Lombok: Для уменьшения шаблонного кода и автоматической генерации методов.
Spring Boot Starter Test: Зависимости для тестирования приложения с использованием Spring Boot.
JUnit Platform Launcher: Для запуска JUnit тестов.
Убедитесь, что в вашем build.gradle или pom.xml настроены эти зависимости для успешной сборки и запуска проекта.
