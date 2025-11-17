package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.dto.MovimientoRequest;
import com.bancoecuasol.cbs.dto.MovimientoResponse;

public interface MovimientoService {

    MovimientoResponse procesarMovimiento(MovimientoRequest request);
}
