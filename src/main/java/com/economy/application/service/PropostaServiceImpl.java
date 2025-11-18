
package com.economy.application.service;

import com.economy.domain.model.Proposta;
import com.economy.domain.service.PropostaService;

import java.util.List;

public class PropostaServiceImpl implements PropostaService {

    @Override
    public Proposta criarProposta(Proposta proposta) {
        return null;
    }

    @Override
    public Proposta editarProposta(Proposta proposta, int idProposta) {
        return null;
    }

    @Override
    public void deletarProposta(int idProposta) {

    }

    @Override
    public List<Proposta> listarPropostas() {
        return List.of();
    }

    @Override
    public List<Proposta> listarByEmpresaId(int empresaId) {
        return List.of();
    }

    @Override
    public List<Proposta> listarByEmpregadoId(int empregadoId) {
        return List.of();
    }
}
