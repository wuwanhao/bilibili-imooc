package com.imooc.bilibili.domain;


/**
 * 自定义json响应
 * @param <T>
 */
public class JsonResponse<T> {

    private String code;
    private String msg;
    private T data;

    // 默认请求成功
    public static JsonResponse<String> success(){
        return new JsonResponse<String>(null);
    }

    // 定制成功
    public static JsonResponse<String> success(String data){
        return new JsonResponse<String>(data);
    }


    // 默认失败
    public static JsonResponse<String> fail(){
        return new JsonResponse<>("1", "失败");
    }

    // 定制失败
    public static JsonResponse<String> fail(String code, String msg){
        return new JsonResponse<>(code, msg);
    }

    public static JsonResponse<String> success(String code, String msg){
        return new JsonResponse<String>(code, msg);
    }


    public JsonResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResponse(T data) {
        this.data = data;
        this.msg = "成功";
        this.code = "0";
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
