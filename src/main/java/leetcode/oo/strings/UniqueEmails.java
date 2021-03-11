package leetcode.oo.strings;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/unique-email-addresses/
final class UniqueEmails {

    int numUniqueEmails(final String[] emails) {
        final Set<String> cache = new HashSet<>(emails.length);
        for (final String email : emails) {
            final String[] split = email.split("@");
            final String localName = split[0];
            final String domain = split[1];
            final StringBuilder normalized = new StringBuilder(email.length());
            for (int i = 0; i < localName.length(); i++) {
                if (localName.charAt(i) == '.') {
                    continue;
                }
                if (localName.charAt(i) == '+') {
                    break;
                }
                normalized.append(localName.charAt(i));
            }
            cache.add(normalized.toString() + "@" + domain);
        }
        return cache.size();
    }
}
