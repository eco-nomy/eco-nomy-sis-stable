
package com.economy.domain.service;

import com.economy.domain.model.Saque;

import java.util.List;

public interface SaqueService {
    Saque criarSaque(Saque saque);

    Saque editarSaque(Saque saque, int idSaque);

    void deletarSaque(int idSaque);

    List<Saque> listarSaques();

    List<Saque> listarByEmpregadoId(int empregadoId);
}
