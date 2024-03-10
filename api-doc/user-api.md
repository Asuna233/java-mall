# API接口文档


**简介**:API接口文档


**HOST**:http://localhost:8512


**联系人**:atguigu


**Version**:1.0


**接口路径**:/v3/api-docs/user-api


[TOC]






# user-info-controller


## register


**接口地址**:`/api/user/userInfo/register`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "username": "",
  "password": "",
  "nickName": "",
  "code": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userRegisterDto|注册对象|body|true|UserRegisterDto|UserRegisterDto|
|&emsp;&emsp;username|用户名||false|string||
|&emsp;&emsp;password|密码||false|string||
|&emsp;&emsp;nickName|昵称||false|string||
|&emsp;&emsp;code|手机验证码||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## login


**接口地址**:`/api/user/userInfo/login`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "username": "",
  "password": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userLoginDto|用户登录请求参数|body|true|UserLoginDto|UserLoginDto|
|&emsp;&emsp;username|用户名||false|string||
|&emsp;&emsp;password|密码||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## getCurrentUserInfo


**接口地址**:`/api/user/userInfo/auth/getCurrentUserInfo`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultUserInfoVo|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||UserInfoVo|UserInfoVo|
|&emsp;&emsp;nickName|昵称|string||
|&emsp;&emsp;avatar|头像|string||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"nickName": "",
		"avatar": ""
	}
}
```


# user-address-controller


## getUserAddress


**接口地址**:`/api/user/userAddress/getUserAddress/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|UserAddress|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id|唯一标识|integer(int64)|integer(int64)|
|createTime|创建时间|string(date-time)|string(date-time)|
|updateTime|修改时间|string(date-time)|string(date-time)|
|isDeleted|是否删除|integer(int32)|integer(int32)|
|userId|用户ID|integer(int64)|integer(int64)|
|name|name|string||
|phone|电话|string||
|tagName|标签名称|string||
|provinceCode|provinceCode|string||
|cityCode|cityCode|string||
|districtCode|districtCode|string||
|address|详细地址|string||
|fullAddress|完整地址|string||
|isDefault|是否默认地址（0：否 1：是）|integer(int32)|integer(int32)|


**响应示例**:
```javascript
{
	"id": 0,
	"createTime": "",
	"updateTime": "",
	"isDeleted": 0,
	"userId": 0,
	"name": "",
	"phone": "",
	"tagName": "",
	"provinceCode": "",
	"cityCode": "",
	"districtCode": "",
	"address": "",
	"fullAddress": "",
	"isDefault": 0
}
```


## findUserAddressList


**接口地址**:`/api/user/userAddress/auth/findUserAddressList`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultListUserAddress|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|array|UserAddress|
|&emsp;&emsp;id|唯一标识|integer(int64)||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;updateTime|修改时间|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除|integer(int32)||
|&emsp;&emsp;userId|用户ID|integer(int64)||
|&emsp;&emsp;name|name|string||
|&emsp;&emsp;phone|电话|string||
|&emsp;&emsp;tagName|标签名称|string||
|&emsp;&emsp;provinceCode|provinceCode|string||
|&emsp;&emsp;cityCode|cityCode|string||
|&emsp;&emsp;districtCode|districtCode|string||
|&emsp;&emsp;address|详细地址|string||
|&emsp;&emsp;fullAddress|完整地址|string||
|&emsp;&emsp;isDefault|是否默认地址（0：否 1：是）|integer(int32)||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": [
		{
			"id": 0,
			"createTime": "",
			"updateTime": "",
			"isDeleted": 0,
			"userId": 0,
			"name": "",
			"phone": "",
			"tagName": "",
			"provinceCode": "",
			"cityCode": "",
			"districtCode": "",
			"address": "",
			"fullAddress": "",
			"isDefault": 0
		}
	]
}
```


# sms-controller


## sendValidateCode


**接口地址**:`/api/user/sms/sendCode/{phone}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|phone||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```