package com.cdns.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author plxc
 * @since 2020-06-25
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Department implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 部门id
     */
      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String name;


}
