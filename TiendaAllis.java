package tiendaallis;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author LOGIN-G3
 */
public class TiendaAllis {
    
    private static Map<String, String> usuarios = new HashMap<>();
    
    public static void main(String[] args) {
        
        usuarios.put("usuario1", "password1");
        usuarios.put("usuario2", "password2");
        usuarios.put("admin", "admin123");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Bodeguita Allis");
        System.out.println("Por favor, ingrese su nombre de usuario y contraseña.");

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();

        if (iniciarSesion(usuario, contraseña)) {
            System.out.println("Inicio de sesión exitoso. Bienvenido a la Bodeguita Allis");
            
            if (usuario.equals("admin")) {
                System.out.println("Accediendo como administrador...");
            } else {
                System.out.println("Accediendo como usuario normal...");
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos. Inténtalo de nuevo");
        }

        scanner.close();
    }

    private static boolean iniciarSesion(String usuario, String contraseña) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña);
    }
}
