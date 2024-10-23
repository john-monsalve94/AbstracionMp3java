// Clase concreta Perro
class Perro extends Animal {
    @Override
    public void emitirSonido() {
        reproducirSonido("sonidos/perro.mp3");
    }
}
