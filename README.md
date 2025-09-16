# 🛒 Mercato App

Mercato App è un'applicazione **Spring Boot** che espone un set di **API RESTful** per gestire prodotti in un contesto di e-commerce o catalogo digitale. Ogni prodotto ha un `nome`, una `descrizione`, un `prezzo` e un identificatore `id`.

---

## 🚀 Funzionalità

- ✅ Aggiunta, modifica, eliminazione e ricerca di prodotti
- ✅ Persistenza dei dati su database **MySQL**
- ✅ Logging automatico con **SLF4J**
- ✅ Architettura REST standard (Spring MVC)
- ✅ Validazione delle richieste
- ✅ Configurazione semplificata tramite `application.properties`

---

📡 API disponibili

Tutte le API sono disponibili sotto il path /api/prodotti.

▶️ Aggiungi un prodotto
POST /api/prodotti
Content-Type: application/json

{
  "nome": "iPhone 15",
  "descrizione": "Smartphone Apple",
  "prezzo": 1099.99
}

📋 Lista tutti i prodotti
GET /api/prodotti

🔍 Recupera un prodotto per ID
GET /api/prodotti/{id}

✏️ Aggiorna un prodotto
PUT /api/prodotti/{id}
Content-Type: application/json

{
  "nome": "iPhone 15 Pro",
  "descrizione": "Nuova versione",
  "prezzo": 1299.99
}

❌ Elimina un prodotto
DELETE /api/prodotti/{id}
