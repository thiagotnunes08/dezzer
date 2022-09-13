package br.com.zup.edu.nossodezeer.musica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import javax.persistence.LockModeType;
import java.util.Optional;

public interface MusicaRepository extends JpaRepository<Musica,Long> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<Musica> findByNome(String nome);
}
