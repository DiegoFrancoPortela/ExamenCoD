package com.cod;
public class Auxiliar {
    String Email = "";
    String direccion_IP = "127.0.0.2";
    Auxiliar(){
        Email="anonymous@danielcastelao.org";
    }

    Auxiliar(String param1){
        this.Email = param1;
    }

    public boolean verificacion() {
        if (Email!="anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
