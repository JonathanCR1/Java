public class Doctor extends Profesor{

    private boolean decano;

    public boolean isDecano() {
        return decano;
    }

    public void setDecano(boolean decano) {
        this.decano = decano;
    }

    public void info(){
        System.out.println("Metodo en la clase Doctor");

    }
}
