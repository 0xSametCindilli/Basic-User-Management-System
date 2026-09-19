# Basic User Management System

[🇬🇧 English](README.md) | 🇹🇷 Türkçe

**Spring Boot**, **Spring MVC**, **Spring Data JPA**, **Thymeleaf** ve **MySQL** ile geliştirilmiş basit bir kullanıcı yönetim sistemi web uygulaması. Java backend geliştirmede CRUD işlemlerini ve katmanlı mimariyi öğrenmek için yaptığım bir projedir.

## Özellikler

- Yeni kullanıcı ekleme (ad, soyad, e-posta)
- Tüm kullanıcıları listeleme
- Mevcut kullanıcıyı güncelleme
- Kullanıcı silme

## Kullanılan Teknolojiler

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf (sunucu tarafında HTML şablonları)
- MySQL
- Maven

## Mimari

Proje katmanlı bir yapı izler:

- **Model:** `User` sınıfı (entity)
- **Service:** iş mantığı (`UserService`)
- **Controller:** web isteklerini karşılar ve Thymeleaf sayfalarını döndürür

## Kurulum

### Gereksinimler

- JDK 17 veya üstü
- MySQL
- Git

### Veritabanı ayarı

Uygulama yerel bir MySQL sunucusuna bağlanır. `user_db` veritabanı ilk çalıştırmada otomatik oluşturulur, kendiniz oluşturmanız gerekmez.

MySQL kullanıcı adı ve şifrenizi, repoya girmemesi için ortam değişkeni olarak verin:

```
SPRING_DATASOURCE_USERNAME=kullanici_adiniz
SPRING_DATASOURCE_PASSWORD=sifreniz
```

Bağlantının geri kalan ayarları `src/main/resources/application.properties` dosyasındadır.

### Yerel makinede çalıştırma

```bash
git clone https://github.com/0xSametCindilli/Basic-User-Management-System.git
cd Basic-User-Management-System
./mvnw spring-boot:run
```

Windows'ta bunun yerine `mvnw.cmd spring-boot:run` yazın.

Ardından tarayıcıda [http://localhost:8080](http://localhost:8080) adresini açın.

## Kullanım

1. Uygulamayı başlatın ve [http://localhost:8080](http://localhost:8080) adresini açın.
2. Kullanıcı ekleme sayfasına gidin.
3. Ad, soyad ve e-postayı girip kaydedin.
4. Yeni kullanıcı kullanıcı listesinde görünür.
5. Listeden kullanıcıları düzenleyin veya silin.

## Proje Yapısı

```
src/main/java/com/abdul_samet_cindilli/UserManagement   # Controller, service, model
src/main/resources/templates                            # Thymeleaf şablonları
src/main/resources/application.properties               # Uygulama ve veritabanı ayarları
```

## Yapılacaklar

- [ ] Girdi doğrulama
- [ ] Arama ve sayfalama
- [ ] Birim ve entegrasyon testleri

## Lisans

Bu proje öğrenme amaçlı hazırlanmıştır.
