package com.lanou.util;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/**
 * Created by dllo on 17/10/12.
 */
public class IDCardValidator extends FieldValidatorSupport{
    @Override
    public void validate(Object o) throws ValidationException {
        //自定义验证类型,即扩展原来struts支持的几种常见的验证type,
        //仿照RequiredStringValidator的实现方式
        String filedName= getFieldName();//获得要验证的属性名称
        String value = (String) getFieldValue(filedName,o);
        System.out.println("属性值:" + value);

        IDCard idCard = new IDCard();
        boolean result = idCard.Verify(value);//调用身份证号码验证
        if (!result){
            addFieldError(filedName,o);
        }
    }
}
