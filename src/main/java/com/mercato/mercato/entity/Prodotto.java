package com.mercato.mercato.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Prodotto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descrizione;

    private BigDecimal prezzo;

    // Costruttori
    public Prodotto() {
    }

    public Prodotto(String nome, String descrizione, BigDecimal prezzo) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }
}
