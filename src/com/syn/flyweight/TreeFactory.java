package com.syn.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType resultType = treeTypes.get(name);
        if (resultType == null) {
            resultType = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, resultType);
        }

        return resultType;
    }
}
