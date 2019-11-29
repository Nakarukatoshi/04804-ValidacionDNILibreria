package org.japo.java.app;

/*
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
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
import org.japo.java.libraries.UtilesDNI;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public final class App {

    //Constantes globales
    public static final int DNI_NUM = 44005566;
    public static final char DNI_CTR = 'B';

    //Método principal
    public final void launchApp() {
        //Variables
        boolean dniOk = UtilesDNI.validar(DNI_NUM, DNI_CTR);

        //Cabecera
        cabecera("VALIDACIÓN DNI");

        //Salidas
        //  DNI
        System.out.printf("DNI ......: %d%c%n",
                DNI_NUM, DNI_CTR);

        //  SEPARADOR
        System.out.println("---");

        //  VALIDADOR -- VALIDEZ
        System.out.printf("Validez ..: %s%n",
                dniOk ? "Correcto" : "Incorrecto");
    }

    //Método de la cabecera
    public final void cabecera(String msg) {
        //Variables
        int eq = msg.length();

        //Salida
        System.out.println(msg);
        //  Bucle para la cantidad de "iguales" ["="]
        for (int i = 0; i < eq; i++) {
            System.out.print("=");
        }
        //Salto de línea -- Retorno de carro
        System.out.printf("%n");
    }
}
