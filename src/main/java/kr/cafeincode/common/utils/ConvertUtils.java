package kr.cafeincode.common.utils;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConvertUtils {

    /**
     * delimiter 를 기준으로 str 을 map 으로 변환
     * @param str
     * @param delimiter
     * @return
     */
    public static Optional<Map<String, String>> stringToMap(String str, String delimiter) {
        Map<String, String> map = new HashMap<>();
        if (StringUtils.isEmpty(str)) {
            return Optional.empty();
        }

        String[] ketValues = str.split(delimiter);
        for (String keyValue : ketValues) {
            String[] tmp = keyValue.split("=");
            map.put(tmp[0], tmp[1]);
        }
        return Optional.ofNullable(map);
    }

}