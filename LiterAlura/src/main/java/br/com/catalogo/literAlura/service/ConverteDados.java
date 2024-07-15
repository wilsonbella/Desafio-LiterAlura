package br.com.catalogo.literAlura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{
    //criação de um objeto do tipo ObjectMapper
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T ObterDados(String json, Class<T> classe) {
        try {
            //retorne uma classe com os dados do json informado
            return objectMapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }



}
