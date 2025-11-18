
package com.economy.domain.repository;

import com.economy.domain.model.Saque;

import java.util.List;

public interface SaqueRepository {
    Saque criarSaque(Saque saque);

    Saque editarSaque(Saque saque, int idSaque);

    void deletarSaque(int idSaque);

    List<Saque> listarSaques();

    List<Saque> listarByEmpregadoId(int empregadoId);
}
