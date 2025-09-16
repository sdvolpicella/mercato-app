package com.mercato.mercato.service;

import com.mercato.mercato.entity.Prodotto;
import com.mercato.mercato.repository.ProdottoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdottoService {

    @Autowired
    private ProdottoRepository prodottoRepository;

    public List<Prodotto> getAllProdotti() {
        return prodottoRepository.findAll();
    }

    public Optional<Prodotto> getProdottoById(Long id) {
        return prodottoRepository.findById(id);
    }

    public Prodotto creaProdotto(Prodotto prodotto) {
        return prodottoRepository.save(prodotto);
    }

    public Prodotto aggiornaProdotto(Long id, Prodotto prodottoDettagli) {
        return prodottoRepository.findById(id).map(prodotto -> {
            prodotto.setNome(prodottoDettagli.getNome());
            prodotto.setDescrizione(prodottoDettagli.getDescrizione());
            prodotto.setPrezzo(prodottoDettagli.getPrezzo());
            return prodottoRepository.save(prodotto);
        }).orElseThrow(() -> new RuntimeException("Prodotto non trovato con ID: " + id));
    }

    public void eliminaProdotto(Long id) {
        prodottoRepository.deleteById(id);
    }
}