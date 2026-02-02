package config;

import entities.Drinks.Lemonade;
import entities.Drinks.Water;
import entities.Drinks.Wine;
import entities.Menu;
import entities.Pizze.Hawaian;
import entities.Pizze.Margherita;
import entities.Pizze.Salami;
import entities.Toppings.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class ConfigClass {
    @Bean
    public Margherita margherita() {
        return new Margherita();
    }

    @Bean
    public Hawaian hawaian() {
        return new Hawaian();
    }

    @Bean
    public Salami salami() {
        return new Salami();
    }

    @Bean
    public Ham ham() {
        return new Ham();
    }

    @Bean
    public SalamiT salamiT() {
        return new SalamiT();
    }

    @Bean
    public Cheese cheese() {
        return new Cheese();
    }

    @Bean
    public Pineapple pineapple() {
        return new Pineapple();
    }


    @Bean
    public Onion onion() {
        return new Onion();
    }

    @Bean
    public Water water() {
        return new Water();
    }

    @Bean
    public Lemonade lemonade() {
        return new Lemonade();
    }

    @Bean
    public Wine wine() {
        return new Wine();
    }

    @Bean
    public Menu menu() {
        return new Menu(new ArrayList<>(List.of(margherita(), salami(), hawaian())),
                new ArrayList<>(List.of(cheese(), ham(), onion(), pineapple(), salamiT())),
                new ArrayList<>(List.of(lemonade(), water(), wine()))
        );
    }

}
