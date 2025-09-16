package com.mercato.mercato.controller;

import com.mercato.mercato.entity.Prodotto;
import com.mercato.mercato.service.ProdottoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prodotti")
@CrossOrigin // per permettere richieste da frontend tipo React, Angular, ecc.
public class ProdottoController {

    private static final Logger logger = LoggerFactory.getLogger(ProdottoController.class);

    @Autowired
    private ProdottoService prodottoService;

    @GetMapping
    public List<Prodotto> getAllProdotti() {
        logger.info("Richiesta GET per ottenere tutti i prodotti");
        return prodottoService.getAllProdotti();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prodotto> getProdottoById(@PathVariable Long id) {
        logger.info("Richiesta GET per ottenere il prodotto con id: " + id);
        return prodottoService.getProdottoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Prodotto creaProdotto(@RequestBody Prodotto prodotto) {
        logger.info("Richiesta POST per aggiungere il prodotto: " + prodotto.toString());
        return prodottoService.creaProdotto(prodotto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prodotto> aggiornaProdotto(@PathVariable Long id, @RequestBody Prodotto prodottoDettagli) {
        logger.info("Richiesta PUT per aggiornare il prodotto con id: " + id);
        try {
            Prodotto aggiornato = prodottoService.aggiornaProdotto(id, prodottoDettagli);
            return ResponseEntity.ok(aggiornato);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminaProdotto(@PathVariable Long id) {
        logger.info("Richiesta DELETE per eliminare il prodotto con id: " + id);
        prodottoService.eliminaProdotto(id);
        return ResponseEntity.noContent().build();
    }
}