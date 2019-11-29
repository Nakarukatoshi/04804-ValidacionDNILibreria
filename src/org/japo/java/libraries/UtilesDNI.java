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
package org.japo.java.libraries;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class UtilesDNI {

    // Constantes globales
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static final int LETRAS_NUM = LETRAS.length();

    //Método calcular
    public static final char calcular(int num) {
        return LETRAS.charAt(num % LETRAS_NUM);
    }

    //Método validar
    public static final boolean validar(int num, char ctr) {
        return ctr == calcular(num);
    }

}
