import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Part1
{
   /**
    * mapMystery1 answers:
    * 1) {cinq=five, deux=two, four=quatre, one=un, three=trois}
    * 2) {board=skate, car=drive, computer=play}
    * 3) {begin=end, boy=girl, ebert=siskel, first=last, heads=tails}
    * 4) {cotton=rain, light=tree, seed=tree, tree=violin}
    */
    
    /**
     * mapMystery3 answers:
     * mystery(map1, map2) = {bar=earth, baz=wind, foo=air, mumble=fire}
     * mystery(map3, map4) = {five=quatro, one=dos, three=tres}
     * mystery(map5, map6) = {b=years, c=seven, e=ago, g=seven}
     */
    
    /**
     * countUnique solution method (BJP5 Exercise 11.6):
     * returns the number of unique integers in given List<Integer> toCheck
     * 
     * @param toCheck, a List<Integer> to count the number of unique integers in.
     * @return the number of unique integers in toCheck
     */
    public static int countUnique(List<Integer> toCheck)
    {
        Set<Integer> set = new HashSet<>();
        toCheck.forEach(i -> set.add(i));
        return set.size();
    }
    
    /**
     * maxLength solution method (BJP5 Exercise 11.8):
     * returns the length of the longest string in given List<String> toCheck
     * 
     * @param toCheck, a List<String> to get the longest string length of
     * @return the longest string length in toCheck
     */
    public static int maxLength(Set<String> toCheck)
    {
        int[] max = {0};
        toCheck.forEach(s -> max[0] = Math.max(max[0], s.length()));
        return max[0];
    }
    
    
}
