package br.com.ada.t1322.tecnicasprogramacao.projeto.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatadorDatas {
    public static final DateTimeFormatter BR_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String formatar(LocalDate data) {
        return data.format(BR_FORMAT);
    }
}
