package org.csystem.util.string;

import java.util.Random;

public class StringUtil {
    private StringUtil()
    {
    }

    private static final String LETTERS_EN = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETTERS_TR = "abcçdefgğhıijklmnoöprsştuüvyz";
    private static final String CAPITAL_LETTERS_EN = "ABCDEFGHİJKLMNOPQRSTUVWXYZ";
    private static final String CAPITAL_LETTERS_TR = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
    private static final String ALL_LETTERS_EN = LETTERS_EN + CAPITAL_LETTERS_EN;
    private static final String ALL_LETTERS_TR = LETTERS_TR + CAPITAL_LETTERS_TR;

    public static String generateRandomText(Random random, int length, String sourceText)
    {
        char[] c = new char[length];

        for (int i = 0; i < c.length; ++i)
            c[i] = sourceText.charAt(random.nextInt(sourceText.length()));

        return String.valueOf(c);
    }

    public static String generateRandomTextEN(Random random, int length)
    {
        return generateRandomText(random, length, ALL_LETTERS_EN);
    }

    public static String generateRandomTextTR(Random random, int length)
    {
        return generateRandomText(random, length, ALL_LETTERS_TR);
    }

    public static String[] generateRandomTexts(Random random, int count, int origin, int bound, String sourceText)
    {
        String[] texts = new String[count];

        for (int i = 0; i < texts.length; ++i)
            texts[i] = generateRandomText(random, random.nextInt(origin, bound), sourceText);

        return texts;
    }

    public static String[] generateRandomTextsEN(Random random, int count, int origin, int bound)
    {
        return generateRandomTexts(random, count, origin, bound, ALL_LETTERS_EN);
    }

    public static String[] generateRandomTextsTR(Random random, int count, int origin, int bound)
    {
        return generateRandomTexts(random, count, origin, bound, ALL_LETTERS_TR);
    }
}
