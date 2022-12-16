import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static enums.Gender.FEMALE;
import static enums.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.

        Book book1 = new Book(1L,"Ak-Keme", Genre.HISTORICAL,new BigDecimal(200),"Chyngyz Aitmatov", Language.KYRGYZ, LocalDate.of(1960,1,10));
        Book book2 = new Book(2L,"Ak-Keme", Genre.HISTORICAL,new BigDecimal(300),"Chyngyz Aitmatov", Language.KYRGYZ, LocalDate.of(1960,1,10));
        Book book3 = new Book(3L,"Ak-Keme", Genre.HISTORICAL,new BigDecimal(400),"Chyngyz Aitmatov", Language.KYRGYZ, LocalDate.of(1960,1,10));
        Book book4 = new Book(4L,"Ak-Keme", Genre.HISTORICAL,new BigDecimal(500),"Chyngyz Aitmatov", Language.KYRGYZ, LocalDate.of(1960,1,10));
        Book book5 = new Book(5L,"Ak-Keme", Genre.HISTORICAL,new BigDecimal(600),"Chyngyz Aitmatov", Language.KYRGYZ, LocalDate.of(1960,1,10));


        User user1 = new User(100L,"Ilim","Shabdanov","Ilim@gmail.com","996700200300",Gender.MALE,new BigDecimal (10000), List.of(book1,book2,book3,book4,book5));
        User user2 = new User( 200L,"Jenish","Asangaziev","Jenish@gmail.com","996700200400",Gender.MALE, new BigDecimal(15000),List.of(book1,book2,book3,book4,book5));
        User user3 = new User(300L,"Rahim","Bazarbai uulu","Rahim@gmail.com","996700200500",Gender.MALE, new BigDecimal(20000),List.of(book1,book2,book3,book4,book5));
        User user4 = new User( 400L,"Aigerim","Bektenova","Aigerim@gmail.com","996700200600",Gender.FEMALE, new BigDecimal(25000),List.of(book1,book2,book3,book4,book5));
        User user5 = new User( 500L,"Aijamal","Asangazieva","Aijamal@gmail.com","996700200700",Gender.FEMALE, new BigDecimal(30000),List.of(book1,book2,book3,book4,book5));

    }
}