import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Factura f = new Factura("ordenador", 1000, "Cod001",5,"10/01/2022");
        Factura f2 = new Factura("movil", 300, "Cod002",10,"25/02/2022");
        Factura f3 = new Factura("impresora", 200,"Cod003",20,"05/03/2022");
        Factura f4 = new Factura("imac", 1500, "Cod001",15,"12/01/2022");

        //generar una lista
        List<Factura> lista = new ArrayList<Factura>();

        lista.add(f);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);

        //filtraje funcional con streams
        List<Factura> facturaFiltro = lista.stream()
                .filter(elemento -> elemento.getImporte() > 1000)
                .collect(Collectors.toList());
        System.out.println("facturaFiltro");
        facturaFiltro.forEach(System.out::println);

        //filtro por fecha
        List<Factura> facturaFiltroPorFechaMenorQue = lista.stream()
                .filter(elemento -> elemento.getDate().isBefore(Fecha.date("01/02/2022")))
                .collect(Collectors.toList());
        System.out.println("facturaFiltroPorFechaMenorQue");
        facturaFiltroPorFechaMenorQue.forEach(System.out::println);

        List<Factura> facturaFiltroPorFechaMayorQue = lista.stream()
                .filter(elemento -> elemento.getDate().isAfter(Fecha.date("01/02/2022")))
                .collect(Collectors.toList());
        System.out.println("facturaFiltroPorFechaMayorQue");
        facturaFiltroPorFechaMayorQue.forEach(System.out::println);

        List<Factura> facturaFiltroByCantidadIgual = lista.stream()
                .filter(elemento -> elemento.getCantidad() == 5)
                .collect(Collectors.toList());
        System.out.println("facturaFiltroByCantidadIgual");
        facturaFiltroByCantidadIgual.forEach(System.out::println);

        List<Factura> facturaFiltroByCantidadMenor = lista.stream()
                .filter(elemento -> elemento.getCantidad() < 15)
                .collect(Collectors.toList());
        System.out.println("facturaFiltroByCantidadMenor");
        facturaFiltroByCantidadMenor.forEach(System.out::println);

        List<Factura> facturaFiltroByCantidadMayor = lista.stream()
                .filter(elemento -> elemento.getCantidad() > 10)
                .collect(Collectors.toList());
        System.out.println("facturaFiltroByCantidadMayor");
        facturaFiltroByCantidadMayor.forEach(System.out::println);

        List<Factura> facturaFiltroByCodigo = lista.stream()
                .filter(elemento -> elemento.getCodigoFactura() == "Cod062")
                .collect(Collectors.toList());
        System.out.println("facturaFiltroByCodigo");
        facturaFiltroByCodigo.forEach(System.out::println);




    }
}

