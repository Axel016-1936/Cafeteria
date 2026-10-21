import java.util.Scanner;
public class consola {
  public static void main(String[] args) {
        int option = 0;
        while (option != 2)
        {
            IO.println("======================================================================================Cafeteria Escolar=======================================================================================");
            IO.println("");
            IO.println("Bienvenido al sistema de compra de la 'Cafeteria Escolar', por favor, ingrese el numero del proceso a realizar (1 o 2) ");
            IO.println("1.- Registrar Compra");
            IO.println("2.-Salir");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            option = opcion;
            int producto = 0;
                switch (opcion) {
                    case 1:
                        while (producto!=4) {
                            IO.println("==========================Menu de Productos===========================");
                            IO.println("1.-Cafe");
                            IO.println("2.-Sandiwch");
                            IO.println("3.-Té");
                            IO.println("4.-Salir del sistema");
                            IO.println("Ingrese el número del producto a adquirir (del 1 al 3 y 4 para salir)");
                            int productos = scanner.nextInt();
                            producto = productos;
                            if (producto >= 1 && producto <= 3) {
                                IO.println("==========================Registrar compra=============================");
                                IO.println("Nombre del cliente:");
                                String nombre = scanner.next();
                                int y = producto;
                                switch (y) {
                                    case 1:
                                        IO.println("Producto: Café");
                                        int cafe = 20;
                                        IO.println("Precio Café: $" + cafe);
                                        IO.println("Cantidad");
                                        int cantidadc = scanner.nextInt();
                                        int importe;
                                        importe = cantidadc * cafe;
                                        if (importe>100 && importe<300)
                                        {
                                            IO.println("==========Resumen de compra=========");
                                            IO.println("Cliente:" + nombre);
                                            IO.println("Cantidad:" + cantidadc);
                                            IO.println("Importe:" + importe);
                                            double descuento=importe*0.05;
                                            IO.println("Descuento:" + descuento );
                                            double totaldescuento=importe-descuento;
                                            IO.println("Total a pagar" + totaldescuento);
                                        }
                                        else if (importe>300)
                                        {
                                            IO.println("==========Resumen de compra=========");
                                            IO.println("Cliente:" + nombre);
                                            IO.println("Cantidad:" + cantidadc);
                                            IO.println("Importe:" + importe);
                                            double descuento=importe*0.1;
                                            IO.println("Descuento:" + descuento );
                                            double totaldescuento=importe-descuento;
                                            IO.println("Total a pagar" + totaldescuento);
                                        }
                                        else
                                        {
                                        IO.println("==========Resumen de compra=========");
                                        IO.println("Cliente:" + nombre);
                                        IO.println("Cantidad:" + cantidadc);
                                        IO.println("Importe:" + importe);
                                        IO.println("Descuento: No aplica");
                                        }
                                        break;
                                    case 2:
                                        int sandiwch = 25;
                                        IO.println("Precio Sandiwch: $" + sandiwch);
                                        IO.println("Producto: Sandwich");
                                        IO.println("Cantidad");
                                        int cantidadh = scanner.nextInt();
                                        int importeh;
                                        importeh = cantidadh * sandiwch;
                                        if (importeh>100 && importeh<300)
                                        {
                                            IO.println("==========Resumen de compra=========");
                                            IO.println("Cliente:" + nombre);
                                            IO.println("Cantidad:" + cantidadh);
                                            IO.println("Importe:" + importeh);
                                            double descuentoh=importeh*0.05;
                                            IO.println("Descuento:" + descuentoh );
                                            double totaldescuentoh=importeh-descuentoh;
                                            IO.println("Total a pagar" + totaldescuentoh);
                                        }
                                        else if (importeh>300)
                                        {
                                            IO.println("==========Resumen de compra=========");
                                            IO.println("Cliente:" + nombre);
                                            IO.println("Cantidad:" + cantidadh);
                                            IO.println("Importe:" + importeh);
                                            double descuentoh=importeh*0.1;
                                            IO.println("Descuento:" + descuentoh );
                                            double totaldescuentoh=importeh-descuentoh;
                                            IO.println("Total a pagar" + totaldescuentoh);
                                        }
                                        else
                                        {
                                            IO.println("==========Resumen de compra=========");
                                            IO.println("Cliente:" + nombre);
                                            IO.println("Cantidad:" + cantidadh);
                                            IO.println("Importe:" + importeh);
                                            IO.println("Descuento: No aplica");
                                        }
                                        break;
                                    case 3:
                                        int te = 15;
                                        IO.println("Producto: Té");
                                        IO.println("Precio Té: $" + te);
                                        IO.println("Cantidad:");
                                        int cantidade = scanner.nextInt();
                                        int importee;
                                        importee = cantidade * te;
                                        if (importee>100 && importee<300)
                                        {
                                            IO.println("==========Resumen de compra=========");
                                            IO.println("Cliente:" + nombre);
                                            IO.println("Cantidad:" + cantidade);
                                            IO.println("Importe:" + importee);
                                            double descuentoe=importee*0.05;
                                            IO.println("Descuento:" + descuentoe );
                                            double totaldescuentoe=importee-descuentoe;
                                            IO.println("Total a pagar" + totaldescuentoe);
                                        }
                                        else if (importee>300)
                                        {
                                            IO.println("==========Resumen de compra=========");
                                            IO.println("Cliente:" + nombre);
                                            IO.println("Cantidad:" + cantidade);
                                            IO.println("Importe:" + importee);
                                            double descuentoe=importee*0.1;
                                            IO.println("Descuento:" + descuentoe );
                                            double totaldescuentoe=importee-descuentoe;
                                            IO.println("Total a pagar" + totaldescuentoe);
                                        }
                                        else
                                        {
                                            IO.println("==========Resumen de compra=========");
                                            IO.println("Cliente:" + nombre);
                                            IO.println("Cantidad:" + cantidade);
                                            IO.println("Importe:" + importee);
                                            IO.println("Descuento: No aplica");
                                        }

                                        break;
                                    default:
                                        IO.println("Producto no encontrado");


                                }


                            }
                        }
                        break;
                    case 2:
                        IO.println("Fin del sistema, gracias por su visita");
                        break;
                    default:
                        IO.println("Opcion no valida");
                }

        }

    }
}
