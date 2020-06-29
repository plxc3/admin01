package com.cdns.admin.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PackgeName: com.cdns.admin.common
 * @ClassName: Result
 * @Author: plxc
 * Date: 2020/6/25 21:54
 * project name: admin
 * @Version:
 * @@Description:同一结果返回集
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result setMsg(String msg){
        this.msg=msg;
        return this;
    }
    public Result setData(T data){
        this.data=data;
        return this;
    }

    public static  Result getSuccess(){return new Result(200,"操作成功");}
    public static  Result getFail(){return new Result(400,"操作失败");}
    public static  Result getResult() { return new Result(200, "普通结果返回"); }
}
