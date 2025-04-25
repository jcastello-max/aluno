package com.senai.aluno.inteface;

import com.senai.aluno.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositor extends JpaRepository<Aluno , Long> {

}
