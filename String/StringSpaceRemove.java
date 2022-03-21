import java.util.stream.Collectors;
import java.util.stream.Stream;

class StringSpaceRemove
{
    public static void main(String[] args) {
    
        String str="     Hello           How    Are          You";


        System.out.println(
   Stream.of(str.split("[ \\t]")).filter(s -> s.length() > 0).collect(Collectors.joining(" "))
        );
}

}