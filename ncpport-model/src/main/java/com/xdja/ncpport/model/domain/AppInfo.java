package com.xdja.ncpport.model.domain;

import com.xdja.ncpport.model.AbstractModel;
import lombok.Data;

/**
 * entity 示例
 * @author yejq@gmail.com
 * @date 2019-06-05
 */
@Data
public class AppInfo extends AbstractModel<Integer> {

    private Integer id;

    /**
     * 应用名称
     */
    private String name;

}
