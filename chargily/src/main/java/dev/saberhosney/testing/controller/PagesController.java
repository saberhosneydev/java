package dev.saberhosney.testing.controller;

import dev.saberhosney.testing.entity.ChargilyEntity;
import dev.saberhosney.testing.repository.ChargilyEntityRepository;
import dev.saberhosney.testing.service.PaymentService;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.net.URI;

class ChargilyJsonResponse {
    public String checkout_url;
}
@Controller
public class PagesController {
    private final ChargilyEntityRepository repository;
    private final PaymentService paymentService;
    public PagesController(final ChargilyEntityRepository repository, PaymentService paymentService) {
        this.repository = repository;
        this.paymentService = paymentService;
    }

    @GetMapping("/")
    public String Homepage(){
        return "homepage";
    }
    @GetMapping("/chargily")
    public String Chargilypage(Model model){
        ChargilyEntity entity = new ChargilyEntity();
        model.addAttribute("entity", entity);
        return "chargily";
    }
    @PostMapping("/submit")
    public ResponseEntity<String> submitForm(@ModelAttribute("entity") ChargilyEntity entity) throws IOException {
        String url = new JSONObject(paymentService.makePayment(entity)).get("checkout_url").toString();
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(url)).build();
    }
}
