package br.com.zup.edu.multasmanager.repository;

import br.com.zup.edu.multasmanager.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
