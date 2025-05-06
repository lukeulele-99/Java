public enum Prodotto {
        // Snack
        SNACK1("A1", "Kinder Bueno", Categoria.SNACK),
        SNACK2("A2", "Tronky", Categoria.SNACK),
        SNACK3("A3", "Kinder Cereali", Categoria.SNACK),
        SNACK4("A4", "Kinder paradiso", Categoria.SNACK),

        // Patatine
        PATATINE1("B1", "San Carlo", Categoria.PATATINE),
        PATATINE2("B2", "Pringles", Categoria.PATATINE),
        PATATINE3("B3", "Chipster", Categoria.PATATINE),
        PATATINE4("B4", "Wackos", Categoria.PATATINE),

        // Bibite
        BIBITA1("C1", "Estathe pesca", Categoria.BIBITE),
        BIBITA2("C2", "Estathe limone", Categoria.BIBITE),
        BIBITA3("C3", "Coca cola", Categoria.BIBITE),
        BIBITA4("C4", "Fanta", Categoria.BIBITE),

        // Bevande Calde
        CAFFE("D1", "Caffè", Categoria.CALDE),
        TE("D2", "Tè", Categoria.CALDE),
        CAPPUCCIO("D3", "Cappuccio", Categoria.CALDE),
        CIOCCOLATA("D4", "Cioccolata Calda", Categoria.CALDE);

        private final String codice;
        private final String nome;
        private final Categoria categoria;

        Prodotto(String codice, String nome, Categoria categoria) {
            this.codice = codice;
            this.nome = nome;
            this.categoria = categoria;
        }

        public String getCodice() {
            return codice;
        }

        public String getNome() {
            return nome;
        }

        public Categoria getCategoria() {
            return categoria;
        }

        public enum Categoria {
            SNACK, PATATINE, BIBITE, CALDE
        }
    }



