/*   Copyright (c) 2016 KÜHN Alexandre, 2017 Mawait Maxime
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Affero General Public License for more details.
 *
 *   You should have received a copy of the GNU Affero General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class M11Q15Corr{

    public static class List {
        public Node first;

        public List() {
            this.first = null; // empty list
        }

        public void reverse() {
            
            Node before = null;
            Node current = this.first;
            if (current != null) { //Liste non vide
                Node after = current.next; //Sert à garder la suite de la liste en mémoire
                if(after != null) { //Plus d'un seul élément dans la liste
                    current.next = before; //On inverse la liste
                    while (after != null) {
                        before = current;
                        current = after; //On avance dans la liste
                        after = after.next;
                        current.next = before; //On inverse la liste
                    }
                    this.first = current; //current = dernier élément de l'ancienne liste
                }
            }
        }
    }
}
