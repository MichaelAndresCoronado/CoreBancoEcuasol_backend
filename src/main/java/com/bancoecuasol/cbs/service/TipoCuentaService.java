package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.TipoCuentaRequestDTO;
import com.bancoecuasol.cbs.api.dto.TipoCuentaResponseDTO;

import java.util.List;

public interface TipoCuentaService {

    TipoCuentaResponseDTO crearTipoCuenta(TipoCuentaRequestDTO requestDTO);

    TipoCuentaResponseDTO actualizarTipoCuenta(Integer tipoCuentaId,
                                               TipoCuentaRequestDTO requestDTO);

    TipoCuentaResponseDTO obtenerTipoCuentaPorId(Integer tipoCuentaId);

    List<TipoCuentaResponseDTO> listarTiposCuentas();

    void eliminarTipoCuenta(Integer tipoCuentaId);
}
