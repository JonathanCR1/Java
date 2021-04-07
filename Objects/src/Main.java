//Working with class , new functions and understand Java structure

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Jose");
        p1.setApellidos("Perez");
        p1.setEdad(18);
        p1.setTrabajo(true);




        System.out.println(p1.getNombre());
        System.out.println(p1.getApellidos());
        System.out.println(p1.getEdad());
        System.out.println(p1.isTrabajo());

        Persona p2 = new Persona("Maria" , "Solar" ,56 , false);

        System.out.println(p2);
        Persona.empresaDev();
        System.out.println(Persona.empresa);
        Persona.setEmpresa("Python");
        System.out.println(Persona.empresa);

        Profesor pr1 = new Profesor();
        pr1.setEdad(120);
        pr1.setAsignatura("lengua");
        System.out.println(pr1);
        pr1.setNombre("luis");
        pr1.getNombre();

        Alumno a1 = new Alumno();

        Doctor d1 = new Doctor();
        d1.setDecano(true);
        d1.setAsignatura("mates");
        d1.setApellidos("rodolfo");

        if (d1.isDecano()){

            String doctor = "SI";
            System.out.println("Experiencia del doctor: "+d1.getApellidos()+" licenciado en: "+d1.getAsignatura()+ "ya es doctor -- " + doctor);

        } else {
            System.out.println("Experiencia del doctor: "+d1.getApellidos()+" licenciado en: "+d1.getAsignatura()+ "ya es doctor -- NO ");

        }

        Persona[] lista = new Persona[4];

        lista[0]= new Persona();
        lista[1]= new Alumno();
        lista[2]= new Doctor();
        lista[3]= new Profesor();

        for (Persona persona : lista) {
            persona.info();

        }




    }
}
