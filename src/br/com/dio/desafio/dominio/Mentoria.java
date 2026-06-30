package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private static final double XP_BONUS_MENTORIA = 20d;

    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        // Evolução: XP_PADRAO + bônus fixo da mentoria.
        // Mantido o bônus fixo (mentoria não tem carga horária no domínio),
        // mas agora nomeado para deixar claro o que representa.
        return XP_PADRAO + XP_BONUS_MENTORIA;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data == null) {
            throw new IllegalArgumentException("Data da mentoria não pode ser nula.");
        }
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
