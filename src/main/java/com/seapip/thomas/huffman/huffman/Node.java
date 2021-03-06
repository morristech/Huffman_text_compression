package com.seapip.thomas.huffman.huffman;

import java.util.Collection;
import java.util.Map;

/**
 * The {@code Node} interface is implemented by both the {@code TreeNode} and the {@code CharNode}.
 *
 * @author Thomas Gladdines
 * @see <a href="https://sonarcloud.io/dashboard?id=com.seapip.thomas.huffman%3AHuffman">Code analysis</a>
 * @since 1.8
 */
public interface Node {
    int getValue();

    void flatten(Collection<Character> characters, BitQueue structure);

    void toMap(Map<Character, Collection<Boolean>> map, BitQueue bits);

    void toString(StringBuilder stringBuilder, StringBuilder prefix, boolean isTail);
}
