package com.electravia.core.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.http.MediaType;
import org.springframework.http.client.JdkClientHttpRequestFactory;

@Service
public class GeminiService {

    private final RestClient restClient;

    @Value("${gemini.api.key}")
    private String apiKey;

    public GeminiService() {
        this.restClient = RestClient.builder()
                .requestFactory(new JdkClientHttpRequestFactory())
                .baseUrl("https://generativelanguage.googleapis.com/v1beta/models/gemini-flash-latest:generateContent")
                .build();
    }

    public String analisarConsumoEnergia(String dadosRecarga) {
        String prompt = "Analise os seguintes dados de recarga de veículos elétricos da rede ElectraVia e forneça sugestões curtas e diretas de otimização energética ou manutenção preditiva: " + dadosRecarga;

        String requestBody = """
            {
              "contents": [{
                "parts": [{"text": "%s"}]
              }]
            }
            """.formatted(prompt);

        try {
            String response = restClient.post()
                    .header("X-goog-api-key", apiKey)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(requestBody)
                    .retrieve()
                    .body(String.class);

            return response;
        } catch (Exception e) {
            return "Erro ao consultar a API do Gemini: " + e.getMessage();
        }
    }
}