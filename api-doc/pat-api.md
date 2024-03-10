# OpenAPI definition


**简介**:OpenAPI definition


**HOST**:http://localhost:8515


**联系人**:


**Version**:v0


**接口路径**:/v3/api-docs


[TOC]






# alipay-controller


## 支付宝下单


**接口地址**:`/api/order/alipay/submitAlipay/{orderNo}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|orderNo|订单号|path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultString|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|string||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": ""
}
```