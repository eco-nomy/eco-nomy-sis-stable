
package com.economy.application.service;

import com.economy.domain.model.Pagamento;
import com.economy.domain.service.PagamentoService;

import java.util.List;

public class PagamentoServiceImpl implements PagamentoService {

    @Override
    public Pagamento criarPagamento(Pagamento pagamento) {
        return null;
    }

    @Override
    public void deletarPagamento(int idPagamento) {

    }

    @Override
    public List<Pagamento> listarPagamentos() {
        return List.of();
    }

    @Override
    public List<Pagamento> listarByPropostaId(int propostaId) {
        return List.of();
    }
}
