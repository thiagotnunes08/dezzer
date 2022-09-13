package br.com.zup.edu.nossodezeer.musica;

import javax.persistence.*;
@Entity
public class NumeroDeOuvintes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer quantidade;
    @OneToOne
    private Musica musica;

    @Version
    private Integer version;

    public NumeroDeOuvintes(Musica musica) {
        this.musica = musica;
        this.quantidade = 0;

    }

    /**
     * @Deprecated: uso exclusivo do hibernate
     */
    @Deprecated
    public NumeroDeOuvintes() {
    }

    public void incrementaNumeroOuvintes(){
        this.quantidade++;
    }
}
