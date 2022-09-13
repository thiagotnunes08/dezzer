package br.com.zup.edu.nossodezeer.musica;

import javax.persistence.*;

@Entity
public class QuantidadeDeLikes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantidade;
    @OneToOne
    private Musica musica;
    @Version
    private Integer version;

    public QuantidadeDeLikes(Musica musica) {
        this.musica = musica;
        this.quantidade = 0;
    }

    /**
     * @Deprecated: uso exclusivo do hibernate
     */

    @Deprecated
    public QuantidadeDeLikes() {
    }

    public void incrementaLikes(){
        this.quantidade++;
    }
}
