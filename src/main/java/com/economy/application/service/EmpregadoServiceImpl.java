package com.economy.application.service;

import com.economy.domain.model.Empregado;
import com.economy.domain.service.EmpregadoService;

import java.util.List;

public class EmpregadoServiceImpl implements EmpregadoService {

    @Override
    public Empregado criarEmpregado(Empregado empregado) {
        return null;
    }

    @Override
    public Empregado editarEmpregado(Empregado empregado, int idEmpregado) {
        return null;
    }

    @Override
    public void deletarEmpregado(int idEmpregado) {

    }

    @Override
    public List<Empregado> listarEmpregados() {
        return List.of();
    }

    @Override
    public List<Empregado> listarByIdUsuario(int idUsuario) {
        return List.of();
    }
}
