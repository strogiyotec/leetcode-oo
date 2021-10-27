package leetcode.amazon;

import java.util.List;

//https://leetcode.com/discuss/interview-question/1002811/Amazon-or-OA-2021-or-Fresh-Promotion
public final class Promotion {

    public int promotionCheck(final List<List<String>> codes, final List<String> shoppingCart) {
        int shopIndex = 0;
        int codeIndex = 0;
        while (shopIndex < shoppingCart.size() && codeIndex < codes.size()) {
            final String currentShop = shoppingCart.get(shopIndex);
            final String currentCode = codes.get(codeIndex).get(0);
            if (currentCode.equals(currentShop) || (currentCode.equals("anything") && this.followOrder(shopIndex, codes.get(codeIndex), shoppingCart))) {
                shopIndex += codes.get(codeIndex).size();
            }
            codeIndex++;
        }
        if (codeIndex == codes.size()) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean followOrder(final int shopIndex, final List<String> codes, final List<String> shoppingCart) {
        int currentIndex = shopIndex;
        for (final String code : codes) {
            if (currentIndex < shoppingCart.size() && code.equals("anything") || code.equals(shoppingCart.get(currentIndex))) {
                currentIndex++;
            } else {
                return false;
            }
        }
        return true;
    }
}
