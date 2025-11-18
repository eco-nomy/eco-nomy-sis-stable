package com.economy.application.service;

import com.economy.domain.model.Empresa;
import com.economy.domain.service.EmpresaService;

import java.util.List;

public class EmpresaServiceImpl implements EmpresaService {

    @Override
    public Empresa criarEmpresa(Empresa empresa) {
        return null;
    }

    @Override
    public Empresa editarEmpresa(Empresa empresa, int idEmpresa) {
        return null;
    }

    @Override
    public void deletarEmpresa(int idEmpresa) {

    }

    @Override
    public List<Empresa> listarEmpresas() {
        return List.of();
    }

    @Override
    public List<Empresa> listarByCnpj(String cnpj) {
        return List.of();
    }
}
