package com.xdja.ncpport.common.exception;

import com.xdja.ncpport.common.enums.ErrorEnum;
import lombok.Data;

/**
 * parameter invalid error
 *
 * @author netyjq@gmail.com
 * @date 2019-04-28
 */
@Data
public class ParamInvalidException extends AbstractException {

    private String field;

    @Override
    String buildErrorMessage() {
        return ErrorEnum.WEB_PARAM_ERROR.buildMessage(this.getMessage()).toString();
    }

    public ParamInvalidException(String field, String message) {
        super("parameter: " + field + message);
        this.field = field;
    }

}
