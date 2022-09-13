package br.com.zup.edu.nossodezeer.musica;

import javax.persistence.*;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

@Entity
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "musica")
    private NumeroDeOuvintes numeroDeOuvintes;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "musica")
    private QuantidadeDeLikes quantidadeLikes;

    private LocalDateTime criadoEm = now();

    private LocalDateTime atualiazadoEm = now();

    @Version
    private Integer version;


    public Musica(String nome) {
        this.nome = nome;
    }

    /**
     * @deprecated construtor de uso exclusivo
     */
    @Deprecated
    public Musica() {
    }


    public void aumentarOuvinte() {
        this.numeroDeOuvintes.incrementaNumeroOuvintes();
    }

    public void aumentarLikes() {
        this.quantidadeLikes.incrementaLikes();
    }
}

