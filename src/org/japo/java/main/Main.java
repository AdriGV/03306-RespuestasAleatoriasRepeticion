/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        
        //Constantes
        int CUENTA_INI = 1;
        int CUENTA_FIN = 10;
        
        //Variables
        boolean bool;
        int numeroCuenta = CUENTA_INI;
        
        while(numeroCuenta <= 10){
            
             bool =  RND.nextBoolean();
             
            //Mensaje
            System.out.printf("Respuesta %d ...: %b%n", numeroCuenta, bool);
                                 
            //Actualización
            numeroCuenta++;
        }
    }
}
