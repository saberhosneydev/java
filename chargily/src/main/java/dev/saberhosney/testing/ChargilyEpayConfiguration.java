package dev.saberhosney.testing;

import chargily.epay.springboot.config.ChargilyEpayClientConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static chargily.epay.springboot.config.ChargilyEpayConfigParams.*;


@Configuration
public class ChargilyEpayConfiguration {

    @Bean
    public ChargilyEpayClientConfig configureChargily(){
        ChargilyEpayClientConfig chargilyEpayClientConfig = new ChargilyEpayClientConfig();
        chargilyEpayClientConfig.put(BASE_URL, "https://epay.chargily.com.dz");
        chargilyEpayClientConfig.put(API_KEY, "");
        chargilyEpayClientConfig.put(SECRET, "");
        return chargilyEpayClientConfig;
    }
}