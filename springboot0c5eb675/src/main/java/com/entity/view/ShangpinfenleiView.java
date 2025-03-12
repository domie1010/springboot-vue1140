package com.entity.view;

import com.entity.ShangpinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 图书分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-05-15 17:12:00
 */
@TableName("shangpinfenlei")
public class ShangpinfenleiView  extends ShangpinfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinfenleiView(){
	}
 
 	public ShangpinfenleiView(ShangpinfenleiEntity shangpinfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
