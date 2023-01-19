package com.example.Exceptions;

public class ImovelJaAlugadoException extends Exception {
    @Override
    public String getMessage() {
        return "O imovel ja esta alugado";
    }
}
