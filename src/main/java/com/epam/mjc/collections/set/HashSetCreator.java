package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                while (num > 0) {
                    hashSet.add(num);
                    num /= 2;
                }
            } else {
                hashSet.add(num);
                if (num < 0) {
                    hashSet.add(2 * num * (-1));
                } else {
                    hashSet.add(2 * num);
                }
            }
        }
        return hashSet;
    }
}
