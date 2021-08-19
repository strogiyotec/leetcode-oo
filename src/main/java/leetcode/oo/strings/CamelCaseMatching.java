package leetcode.oo.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://leetcode.com/problems/camelcase-matching/
public final class CamelCaseMatching {

    public static void main(final String[] args) {
        System.out.println(new CamelCaseMatching().camelMatch(
            new String[]{
                "FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"
            },
            "FB"
        ));
    }

    public List<Boolean> camelMatch(
        final String[] queries,
        final String pattern
    ) {
        final StringBuilder regexBuilder = new StringBuilder(pattern.length() << 1);
        for (int i = 0; i < pattern.length(); i++) {
            regexBuilder.append("([a-z]*)").append(pattern.charAt(i));
            if(i==pattern.length()-1){
                regexBuilder.append("([a-z]*)");
            }
        }
        final Pattern ptn = Pattern.compile(regexBuilder.toString());
        final List<Boolean> solution = new ArrayList<>(queries.length);
        for (final String query : queries) {
            final Matcher matcher = ptn.matcher(query);
            if(matcher.matches()){
                solution.add(true);
            } else{
                solution.add(false);
            }
        }
        return solution;
    }
}
