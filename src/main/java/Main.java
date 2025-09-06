import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Administrativo  funcionario1 = new Administrativo("Gabriel", 1200, 26, "TI");
        Tecnico funcionario2 = new Tecnico("Matheus", 10000, 26, "TI", "Java Master");

        funcionario1.imprimirdados();
        funcionario2.imprimirdados();
    }
}
