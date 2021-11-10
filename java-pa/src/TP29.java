import java.util.Arrays;
import java.util.Objects;

public class TP29 {

    static int[] getAxes(String[] directions) {
        // On vous donne comme argument un tableau contenant des chaînes de directions (haut, bas, gauche, droite).
        // Imaginez une personne debout sur une grille au point 0, 0. Pour chaque direction dans le tableau de chaînes,
        // déplacez votre personne dans cette direction sur la grille.
        // Retournez le point final X,Y où se trouve la personne sous la forme d'un tableau de deux entiers.

        // Search point according the direction
        int[] point = new int[2];
        for (String direct : directions) {
            if (Objects.equals(direct, "haut")) { // follow the upper y-axis
                point[1] += 1;
            }
            if (Objects.equals(direct, "bas")) { // follow the lower y-axis
                point[1] -= 1;
            }
            if (Objects.equals(direct, "gauche")) { // follow the lower x-axis
                point[0] -= 1;
            }
            if (Objects.equals(direct, "droite")) { // follow the upper x-axis
                point[0] += 1;
            }
        }
        return point;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAxes(
                new String[]{"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"}
        )));
    }
}
