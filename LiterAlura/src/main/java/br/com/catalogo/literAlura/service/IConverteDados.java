package br.com.catalogo.literAlura.service;

public interface IConverteDados {
    <T> T ObterDados(String json, Class<T> classe);

}
