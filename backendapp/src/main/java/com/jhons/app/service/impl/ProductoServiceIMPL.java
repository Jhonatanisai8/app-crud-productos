package com.jhons.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhons.app.dto.ProductoDTO;
import com.jhons.app.model.Producto;
import com.jhons.app.repository.ProductoRepository;
import com.jhons.app.service.ProductoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoServiceIMPL implements ProductoService {

  private final ProductoRepository productoRepository;

  @Override
  public ProductoDTO crear(ProductoDTO productoDTO) {
    Producto producto = mapToEntity(productoDTO);
    return mapToDTO(productoRepository.save(producto));
  }

  @Override
  public List<ProductoDTO> obtenerTodos() {
    return productoRepository
        .findAll()
        .stream()
        .map(this::mapToDTO)
        .toList();
  }

  private ProductoDTO mapToDTO(Producto producto) {
    ProductoDTO dto = new ProductoDTO();
    dto.setId(producto.getId());
    dto.setNombre(producto.getNombre());
    dto.setCategoria(producto.getCategoria());
    dto.setStock(producto.getStock());
    dto.setPrecio(producto.getPrecio());
    return dto;
  }

  private Producto mapToEntity(ProductoDTO dto) {
    Producto producto = new Producto();
    producto.setNombre(dto.getNombre());
    producto.setCategoria(dto.getCategoria());
    producto.setStock(dto.getStock());
    producto.setPrecio(dto.getPrecio());
    return producto;
  }

}
