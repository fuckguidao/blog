package com.swpu.uchain.blog.enums;

import lombok.Getter;

/**
 * @author hobo
 * @description
 */
@Getter
public enum DefaultEnum {
    /**
     * 标签默认分组
     */
    TAGS_DEFAULT_ENUM(1);;
    private Integer value;

    DefaultEnum(Integer value) {
        this.value = value;
    }
}
