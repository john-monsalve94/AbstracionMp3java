import java.io.FileInputStream;
import javazoom.jl.player.Player;

// Clase abstracta Animal
abstract class Animal {
    // Método abstracto que será implementado por las clases hijas
    public abstract void emitirSonido();
    
    // Método para reproducir sonido MP3
    public void reproducirSonido(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            Player playMp3 = new Player(fis);
            playMp3.play();
        } catch (Exception e) {
            System.out.println("Error al reproducir el sonido: " + e.getMessage());
        }
    }
}
