package com.example.Dados;

import com.example.Entidades.Imovel;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ImovelDados {
    private static final List<Imovel> imoveis = new ArrayList<>();

    public static void adicionaImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public static void removeImovel(Imovel imovel) {
        imoveis.remove(imovel);
    }

    public static void alteraImovel(Imovel imovel, String field, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field _field = Imovel.class.getField(field);
        _field.set(imovel, value);
    }

    public static Imovel getImovelById(double id) {
        for (Imovel imovel : imoveis) {
            if (imovel.getId() == id) {
                return imovel;
            }
        }

        return null;
    }

    public static List<Imovel> getImoveis() {
        return imoveis;
    }
}
