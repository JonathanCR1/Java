//Working with class , new functions and understand Java structure

import com.test.model.*;

import java.util.*;

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

        d1.setDni(new DNI("a",999999));
        System.out.println( d1.getDni());

        a1.getAsignaturas().add("matematicas");
        a1.getAsignaturas().add("Lengua");
        a1.getAsignaturas().add("fisica");

        System.out.println(a1.getAsignaturas());

        List<String> listaAux = a1.getAsignaturas();
        listaAux.add("etica");

        //System.out.println(listaAux.get(0));

        for (Iterator iterator = listaAux.iterator(); iterator.hasNext();){
            String string = (String) iterator.next();
            System.out.println(string);

        }

        for (int i = 0; i < listaAux.size(); i++){
            System.out.println("----------------------");
            System.out.println(i+" : "+listaAux.get(i));

        }

        List<Persona> personas = new ArrayList<Persona>();
        personas.add(d1);
        personas.add(a1);
        personas.add(pr1);

        for (Iterator iterator = personas.iterator(); iterator.hasNext();){
            Persona persona = (Persona) iterator.next();
            System.out.println(persona);

        }
    }
}
