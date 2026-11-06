package alquilerdebicicletas_c;

public interface Alquilable {
    double calcularCosto(int horas);
    double calcularCosto(int horas, double descuento);
}
