package Hasher;

import java.util.Map;

public class ExercisesMain {
    public static void main(String[] args){

        Maper foo = new Maper();
        Map <String,String> exercise = foo.getEstados();

        System.out.println(exercise);
        exercise.remove("MG");
        System.out.println(exercise);

        //exercise.put("DF"," Distrito Federal");
        //System.out.println(exercise);

        System.out.println(exercise.get("Rio de Janeiro"));
        exercise.put(null, "São Paulo");
        exercise.put(null, "Florianópolis");
        System.out.println(exercise);


        System.out.println(exercise.get("Rio de Janeiro"));


        System.out.println(exercise.get("DF"));
        exercise.put(null, "Florianópolis");
        System.out.println(exercise);

        exercise.put("Go", null);
        exercise.put("Ro", null);

        System.out.println(exercise);
        //exercise.set("RJ", "Búzios");






    }
}
