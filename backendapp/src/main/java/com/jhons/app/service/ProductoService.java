package com.jhons.app.service;

import java.util.List;

import com.jhons.app.dto.ProductoDTO;

public interface ProductoService {
  List<ProductoDTO> obtenerTodos();

  ProductoDTO crear(ProductoDTO productoDTO);

}
