
package com.economy.application.service;

import com.economy.domain.model.Saque;
import com.economy.domain.service.SaqueService;

import java.util.List;

public class SaqueServiceImpl implements SaqueService {

    @Override
    public Saque criarSaque(Saque saque) {
        return null;
    }

    @Override
    public Saque editarSaque(Saque saque, int idSaque) {
        return null;
    }

    @Override
    public void deletarSaque(int idSaque) {

    }

    @Override
    public List<Saque> listarSaques() {
        return List.of();
    }

    @Override
    public List<Saque> listarByEmpregadoId(int empregadoId) {
        return List.of();
    }
}
