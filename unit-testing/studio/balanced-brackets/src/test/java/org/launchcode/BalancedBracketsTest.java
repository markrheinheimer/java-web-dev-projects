package org.launchcode;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicOptionPaneUI;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test //1
    public void emptyTest() { assertEquals(true, true);
    }

    @Test //2
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test //3
    public void closingBracketFirstReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test //4
    public void stringIsEmptyReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test //5
    public void bracketsFirstAndThenTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test //6
    public void wordThanBracketsWithWordInsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test //7
    public void stringWithOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Lau[nchCode"));
    }

    @Test //8
    public void textWithoutBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test //9
    public void openingBracketWithWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test //10
    public void wrongOrderBracketsWithWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test //11
    public void singleOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test //12
    public void outOfOrderBracketPairReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test //13
    public void threeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
}