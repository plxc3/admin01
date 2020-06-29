package com.cdns.admin.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.apache.ibatis.annotations.ResultMap;

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
public class User implements Serializable {


      /**
     * 用户id
     */@TableId(type = IdType.AUTO)
      private Integer userId;

      /**
     * 姓名
     */
      private String userName;

      /**
     * 性别，1男，0女
     */
      private Integer userSex;

      /**
     * 年龄
     */
      private Integer userAge;

      /**
     * 生日
     */
      private String userBirthd;

      /**
     * 部门id
     */
      @TableField(value = "user_department")
      private Integer userDepartment;

      /**
     * 创建时间
     */
      @TableField(fill = FieldFill.INSERT)
      private Date createTime;
      /**
     * 更新时间
     */
      private Date  updateTime;
      /**
     * 更新人
     */
      private String updateBy;

      /**
     * 乐观锁
     */
     @Version
      private Integer version;

      /**
     * 逻辑删除
     */
      @TableLogic
      private Integer deleted;

//      private Department department;


}
