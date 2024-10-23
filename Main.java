import javax.swing.JOptionPane;

// Clase principal para la interacción
public class Main {
    public static void main(String[] args) {
        String[] opcionesAnimales = {"Ave", "Humano", "Perro", "Gato", "Salir"};
        boolean continuar = true;

        while (continuar) {
            Animal animal = null;

            // Seleccionar animal
            String seleccionAnimal = (String) JOptionPane.showInputDialog(
                    null, "Elige un animal", "Animales",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesAnimales, opcionesAnimales[0]
            );

            // Verificar si el usuario desea salir
            if (seleccionAnimal == null || seleccionAnimal.equals("Salir")) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!");
                break; // Salir del bucle
            }

            // Crear instancia del animal seleccionado
            switch (seleccionAnimal) {
                case "Ave":
                    animal = new Ave();
                    break;
                case "Humano":
                    animal = new Humano();
                    break;
                case "Perro":
                    animal = new Perro();
                    break;
                case "Gato":
                    animal = new Gato();
                    break;
            }

            // Hacer que el animal emita su sonido representativo
            if (animal != null) {
                animal.emitirSonido();
            } else {
                JOptionPane.showMessageDialog(null, "No se seleccionó un animal válido.");
            }
        }
    }
}
