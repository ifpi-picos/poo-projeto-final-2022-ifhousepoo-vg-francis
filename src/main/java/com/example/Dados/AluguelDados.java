package com.example.Dados;

import com.example.Entidades.Aluguel;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AluguelDados {
    private static final List<Aluguel> alugueis = new ArrayList<>();

    public static void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public static void removeAluguel(Aluguel aluguel) {
        alugueis.remove(aluguel);
    }

    public static void alteraAluguel(Aluguel aluguel, String field, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field _field = Aluguel.class.getField(field);
        _field.set(aluguel, value);
    }

    public static Aluguel getAluguelById(double id) {
        for (Aluguel aluguel : alugueis) {
            if (aluguel.getId() == id) {
                return aluguel;
            }
        }

        return null;
    }

    public static List<Aluguel> getAlugueis() {
        return alugueis;
    }
}
