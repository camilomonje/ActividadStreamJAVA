import java.time.LocalDate;


class Factura {
    String descripcion;
    int    importe;
    String codigoFactura;
    int       cantidad;
    LocalDate date;

    public Factura(String descripcion, int importe, String codigoFactura, int cantidad, String date) {
        this.descripcion = descripcion;
        this.importe = importe;
        this.codigoFactura = codigoFactura;
        this.cantidad = cantidad;
        this.date = Fecha.date(date);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImporte() {
        return importe;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "descripcion='" + descripcion + '\'' +
                ", importe=" + importe +
                ", codigoFactura='" + codigoFactura + '\'' +
                ", cantidad=" + cantidad +
                ", date=" + date +
                '}';
    }
}
