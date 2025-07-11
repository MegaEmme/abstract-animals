import org.lessons.java.Aquila;
import org.lessons.java.Cane;
import org.lessons.java.Delfino;
import org.lessons.java.Passerotto;
import org.lessons.java.interfaces.INuotante;
import org.lessons.java.interfaces.IVolante;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("<><><><><><><><><>\n");

        Aquila aquila = new Aquila();
        System.out.println("Animale: Aquila");
        System.out.println("Quando dorme fa: ");
        aquila.dormi();
        System.out.println("Si mangia: ");
        aquila.mangia();
        System.out.println("Il suo verso è: ");
        aquila.verso();

        Cane cane = new Cane();
        System.out.println("\nAnimale: Cane");
        System.out.println("Quando dorme fa: ");
        cane.dormi();
        System.out.println("Si mangia: ");
        cane.mangia();
        System.out.println("Il suo verso è: ");
        cane.verso();

        Passerotto passerotto = new Passerotto();
        System.out.println("\nAnimale: Passerotto");
        System.out.println("Quando dorme fa: ");
        passerotto.dormi();
        System.out.println("Si mangia: ");
        passerotto.mangia();
        System.out.println("Il suo verso è: ");
        passerotto.verso();

        Delfino delfino = new Delfino();
        System.out.println("\nAnimale: Delfino");
        System.out.println("Quando dorme fa: ");
        delfino.dormi();
        System.out.println("Si mangia: ");
        delfino.mangia();
        System.out.println("Il suo verso è: ");
        delfino.verso();

        System.out.println("\n<><><><><><><><><>");

        // INuotante delfinoDue = new Delfino();
        // delfinoDue.nuota();
        // farlo usando i metodi -->
        delfino.nuota();
        passerotto.vola();
        aquila.vola();

        System.out.println("\n<><><><><><><><><>\n");

    }

    static void faiNuotare(INuotante animaleNuotante) {
        animaleNuotante.nuota();
    }

    static void faiVolare(IVolante animaleVolante) {
        animaleVolante.vola();
    }
}
