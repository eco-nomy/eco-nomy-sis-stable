
package com.economy.domain.repository;

import com.economy.domain.model.Pagamento;

import java.util.List;

public interface PagamentoRepository {
    Pagamento criarPagamento(Pagamento pagamento);

    Pagamento editarPagamento(Pagamento pagamento, int idPagamento);

    void deletarPagamento(int idPagamento);

    List<Pagamento> listarPagamentos();

    List<Pagamento> listarByPropostaId(int propostaId);
}
