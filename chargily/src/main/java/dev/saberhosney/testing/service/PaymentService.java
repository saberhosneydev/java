package dev.saberhosney.testing.service;

import chargily.epay.springboot.enums.Mode;
import chargily.epay.springboot.model.InvoiceModel;
import chargily.epay.springboot.service.ChargilyEpayClient;
import dev.saberhosney.testing.ChargilyEpayConfiguration;
import dev.saberhosney.testing.entity.ChargilyEntity;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.math.BigDecimal;

@Service
public class PaymentService {
    private final ChargilyEpayClient client = new ChargilyEpayClient(new ChargilyEpayConfiguration().configureChargily());
    public String makePayment(ChargilyEntity entity) throws IOException {
        InvoiceModel invoice = new InvoiceModel(
                entity.getName(),
                entity.getEmail(),
                entity.getInvoice_number().toString(),
                BigDecimal.valueOf(entity.getAmount()),
                entity.getDiscount(),
                "https://backurl.com/",
                "https://8dbf-41-129-33-104.eu.ngrok.io",
                Mode.EDAHABIA,
                entity.getComment()
        );
        return client.makePayment(invoice);
    }
}
