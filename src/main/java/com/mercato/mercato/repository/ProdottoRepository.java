package com.mercato.mercato.repository;

import com.mercato.mercato.entity.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
    // Puoi aggiungere metodi personalizzati, es: findByNome(String nome)
}
