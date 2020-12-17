package com.cod;

public class Main {
    public static void main(String[] args) {

        if (conectar_usuario("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
        System.out.println("Fallo");
        }
        if(conectar_usuario2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
    }

    public static boolean conectar_usuario(String email_Introducido){
        Auxiliar obx1 = new Auxiliar(email_Introducido);
        System.out.println("Conectando a " + obx1.direccion_IP + ", con el usuario " + email_Introducido);
        return obx1.verificacion();
    }

    public static boolean conectar_usuario2() {
        Auxiliar obx2 = new Auxiliar();
        System.out.println("Conectando a " + obx2.direccion_IP + ", con el usuario " + obx2.Email);
        return obx2.verificacion();
    }
}
