package com.economy.application.service;

import com.economy.domain.model.Deposito;
import com.economy.domain.service.DepositoService;

import java.util.List;

public class DepositoServiceImpl implements DepositoService {

    @Override
    public Deposito criarDeposito(Deposito deposito) {
        return null;
    }

    @Override
    public List<Deposito> listarDepositos() {
        return List.of();
    }

    @Override
    public List<Deposito> listarByEmpresaId(int empresaId) {
        return List.of();
    }
}
