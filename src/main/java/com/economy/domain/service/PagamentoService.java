
package com.economy.domain.service;

import com.economy.domain.model.Pagamento;

import java.util.List;

public interface PagamentoService {
    Pagamento criarPagamento(Pagamento pagamento);

    void deletarPagamento(int idPagamento);

    List<Pagamento> listarPagamentos();

    List<Pagamento> listarByPropostaId(int propostaId);
}
