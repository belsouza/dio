package novidadesOnze;

public class StringIsBlankExemplo {
    public static void main(String[] args) {
        solutionThree();
    }

    private static void solutionOne(){
        String space = "                                 ";
        System.out.println(space == null || space.length() == 0 || space.chars().allMatch(c -> c == ' '));
    }

    private static void solutionTwo(){
        String space = "                                             ";
        boolean g1 = space == null;
        boolean g2 = space.length() == 0;
        boolean g3 =  space.chars().allMatch(c -> c == ' ');

        System.out.println( g1 ||  g2 || g3 );
    }

    private static void solutionThree(){
        String space = "                                             ";
        System.out.println(space.isBlank());
    }


}
