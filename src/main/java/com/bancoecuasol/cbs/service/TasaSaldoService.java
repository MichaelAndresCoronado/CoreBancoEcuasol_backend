package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.TasaSaldoRequestDTO;
import com.bancoecuasol.cbs.api.dto.TasaSaldoResponseDTO;

import java.util.List;

public interface TasaSaldoService {

    TasaSaldoResponseDTO crearTasaSaldo(TasaSaldoRequestDTO requestDTO);

    TasaSaldoResponseDTO actualizarTasaSaldo(Integer saldoId,
                                             TasaSaldoRequestDTO requestDTO);

    TasaSaldoResponseDTO obtenerTasaSaldoPorId(Integer saldoId);

    List<TasaSaldoResponseDTO> listarTasasSaldo();

    void eliminarTasaSaldo(Integer saldoId);
}
