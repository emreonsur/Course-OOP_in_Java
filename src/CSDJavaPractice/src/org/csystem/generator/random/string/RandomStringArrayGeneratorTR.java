package org.csystem.generator.random.string;

import java.util.Random;

import org.csystem.util.string.StringUtil;

public class RandomStringArrayGeneratorTR {
    private final String[] m_texts;

    public RandomStringArrayGeneratorTR(Random random, int count, int origin, int bound)
    {
        m_texts = StringUtil.generateRandomTextsTR(random, count, origin, bound);
    }

    public int length()
    {
        return m_texts.length;
    }

    public String get(int index)
    {
        return m_texts[index];
    }
}