import api from "../api/axiosConfig";

export const obtenerProductos = () => api.get("/products");
export const crearProducto = (product) => api.post("/products", product);
export const eliminarProducto = (id) => api.delete(`/products/${id}`);
