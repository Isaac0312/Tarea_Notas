public class Compra {
	double IVA;
	double precio_total;
	double precio_total_iva;
	int num_articulos;
	double cantidad_pagada;
	double cambio;
	
	public Compra() {
		
	}
	
	public Compra(double iVA, double precio_total,int num_articulos, double cantidad_pagada) {
		this.IVA = iVA;
		this.precio_total = precio_total;
		this.precio_total_iva = ((precio_total*(IVA/100))+precio_total);
		this.num_articulos = num_articulos;
		this.cantidad_pagada = cantidad_pagada;
		this.cambio = cantidad_pagada-precio_total_iva;
	}

	public double getIVA() {
		return IVA;
	}

	public void setIVA(int iVA) {
		IVA = iVA;
	}

	public double getPrecio_total() {
		return precio_total;
	}

	public void setPrecio_total(double precio_total) {
		this.precio_total = precio_total;
	}

	public double getPrecio_total_iva() {
		return precio_total_iva;
	}

	public void setPrecio_total_iva(double precio_total_iva) {
		this.precio_total_iva = precio_total_iva;
	}

	public int getNum_articulos() {
		return num_articulos;
	}

	public void setNum_articulos(int num_articulos) {
		this.num_articulos = num_articulos;
	}

	public double getCantidad_pagada() {
		return cantidad_pagada;
	}

	public void setCantidad_pagada(double cantidad_pagada) {
		this.cantidad_pagada = cantidad_pagada;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		return " [IVA=" + IVA + ", precio_total=" + precio_total + ", precio_total_iva=" + precio_total_iva
				+ ", num_articulos=" + num_articulos + ", cantidad_pagada=" + cantidad_pagada + ", cambio=" + cambio
				+ "]";
	}
	
}