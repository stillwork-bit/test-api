Добро пожаловать в тестовый проект User Management API! Этот проект демонстрирует настройку и использование REST API с использованием Spring Boot и PostgreSQL.

📦 **Установка и настройка**

1. Разверните PostgreSQL, например в docker с помощью docker-compose:

```yaml
version: '3'
services:
  postgress-db-main:
    image: postgres
    environment:
      - POSTGRES_USER=postgres
      - POSTGRES_PASSWORD=postgress
      - POSTGRES_DB=postgres
    ports:
      - "5433:5432" - "5433:5432"
```
2.Создайте БД userdb
```sql
CREATE DATABASE userdb;
```
3.Создайте схему userdb
```sql
CREATE SCHEMA userdb;
```

4.Пролейте [скрипт](./db/init.sql)  для создания таблиц из каталога 

5.Соберите и запустите тестовый проект из главного класса ``UserManagementApplication``

📖 **Полезное**
 - Спецификация API будет доступна по адресу: http://localhost:9999/v3/api-docs
 - Swagger UI доступен по адресу: http://localhost:9999/swagger-ui.html
 - Готовые  postman коллекция и перемнные среды см каталог ``./postman``
 - Специально для тестировщиков есть баги в демо приложении. Напишите о них в комментарии к статье!

❤️ **Поддержите проект**
Если проект или статья оказались полезными, поддержите нас лайком ⭐️ на GitHub и в статье! 
Ваш фидбэк вдохновляет меня писать больше статей! 😊
